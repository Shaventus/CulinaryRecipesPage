package com.culinaryrecipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageNavigationController 
{
	@GetMapping("/public/home")
	public String home() 
	{
		return "pages/public/index";
	}
	
	@GetMapping("/public/terms")
	public String terms() 
	{
		return "pages/public/terms";
	}

	@GetMapping("/public/privacy")
	public String privacy() 
	{
		return "pages/public/privacy";
	}
	
	@RequestMapping(value = "/public/signin", method = RequestMethod.GET)
    public String signin(Model model, String error, String logout) 
	{
        if (error != null)
            model.addAttribute("loginError", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");
        
        return "pages/public/signin";
    }
	
	@RequestMapping(value = "/public/signup", method = RequestMethod.GET)
	public String signup() 
	{
		return "pages/public/signup";
	}
	
	/**
	 * admin
	 * @return
	 */
	@GetMapping("/admin/home")
	public String homeAdmin() 
	{
		return "pages/admin/index";
	}
	
	@GetMapping("/admin/terms")
	public String termsAdmin() 
	{
		return "pages/admin/terms";
	}

	@GetMapping("/admin/privacy")
	public String privacyAdmin() 
	{
		return "pages/admin/privacy";
	}
	
	@GetMapping("/admin/recipes")
	public String recipesAdmin() 
	{
		return "pages/admin/recipes";
	}
	
	@GetMapping("/admin/ingredients")
	public String ingredientsAdmin() 
	{
		return "pages/admin/ingredients";
	}
	
	@GetMapping("/admin/community")
	public String communityAdmin() 
	{
		return "pages/admin/community";
	}
	
	@GetMapping("/admin/myAccount")
	public String myAccountAdmin() 
	{
		return "pages/admin/myAccount";
	}
	
	@GetMapping("/admin/areaAdmin")
	public String areaAdmin() 
	{
		return "pages/admin/areaAdmin";
	}
	
	/**
	 * user
	 * @return
	 */
	
	@GetMapping("/user/home")
	public String homeUser() 
	{
		return "pages/user/index";
	}
	
	@GetMapping("/user/terms")
	public String termsUser() 
	{
		return "pages/user/terms";
	}

	@GetMapping("/user/privacy")
	public String privacyUser() 
	{
		return "pages/user/privacy";
	}
	
	@GetMapping("/user/recipes")
	public String recipesUser() 
	{
		return "pages/user/recipes";
	}
	
	@GetMapping("/user/ingredients")
	public String ingredientsUser() 
	{
		return "pages/user/ingredients";
	}
	
	@GetMapping("/user/community")
	public String communityUser() 
	{
		return "pages/user/community";
	}
	
	@GetMapping("/user/myAccount")
	public String myAccountUser() 
	{
		return "pages/user/myAccount";
	}
		
}
