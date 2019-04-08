package com.culinaryrecipes.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		
	  auth.jdbcAuthentication().dataSource(dataSource)
	  	.rolePrefix("ROLE_")
		.usersByUsernameQuery(
			"SELECT username,password,enabled FROM account WHERE username=?")
		.authoritiesByUsernameQuery(
			"SELECT account.username,role.name FROM role "
			+ "JOIN account_has_role ON role.idrole = account_has_role.role_idrole "
			+ "JOIN account ON account_has_role.account_idaccount = account.idaccount "		
			+ "WHERE username=?")
		.passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
				.antMatchers("/","/public/**","/static/**","/login","/register","/fragments/**","/index", "/resources/**","/media/**","/css/**","/images/**").permitAll()
				.antMatchers("/pages/admin/**").hasRole("Admin")
				.antMatchers("/pages/user/**").hasRole("User")
				.anyRequest().authenticated()
				.and()
			.formLogin()
				//.loginPage("/login")
				.permitAll()
				.and()
			.logout()
				.permitAll();
		
		http.csrf().disable();
	}
	
	
	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user = 
				User.withDefaultPasswordEncoder()
					.username("user")
					.password("password")
					.roles("User")
					.build();
		return new InMemoryUserDetailsManager(user);
	}
	
	
}
