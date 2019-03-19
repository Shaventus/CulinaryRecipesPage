package com.culinaryrecipes.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAccount;

	@Temporal(TemporalType.TIMESTAMP)
	private Date creationAccountDate;

	private String email;


	private byte enabled;


	private String password;


	private String username;


	//bi-directional many-to-one association to Comment
	@OneToMany(mappedBy="account")
	private List<Comment> comments;

	//bi-directional many-to-one association to Like
	@OneToMany(mappedBy="account")
	private List<Like> likes;

	//bi-directional many-to-one association to Recipe
	@OneToMany(mappedBy="account")
	private List<Recipe> recipes;

	//bi-directional many-to-many association to Role
	@ManyToMany(mappedBy="accounts")
	private List<Role> roles;

	public Account() {
	}

	public int getIdAccount() {
		return this.idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public Date getCreationAccountDate() {
		return this.creationAccountDate;
	}

	public void setCreationAccountDate(Date creationAccountDate) {
		this.creationAccountDate = creationAccountDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getEnabled() {
		return this.enabled;
	}

	public void setEnabled(byte enabled) {
		this.enabled = enabled;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Comment> getComments() {
		return this.comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Comment addComment(Comment comment) {
		getComments().add(comment);
		comment.setAccount(this);

		return comment;
	}

	public Comment removeComment(Comment comment) {
		getComments().remove(comment);
		comment.setAccount(null);

		return comment;
	}

	public List<Like> getLikes() {
		return this.likes;
	}

	public void setLikes(List<Like> likes) {
		this.likes = likes;
	}

	public Like addLike(Like like) {
		getLikes().add(like);
		like.setAccount(this);

		return like;
	}

	public Like removeLike(Like like) {
		getLikes().remove(like);
		like.setAccount(null);

		return like;
	}

	public List<Recipe> getRecipes() {
		return this.recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	public Recipe addRecipe(Recipe recipe) {
		getRecipes().add(recipe);
		recipe.setAccount(this);

		return recipe;
	}

	public Recipe removeRecipe(Recipe recipe) {
		getRecipes().remove(recipe);
		recipe.setAccount(null);

		return recipe;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}