package com.culinaryrecipes.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the like database table.
 * 
 */
@Entity
@NamedQuery(name="Like.findAll", query="SELECT l FROM Like l")
public class Like implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLike;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime;

	//bi-directional many-to-one association to Account
	@ManyToOne
	private Account account;

	//bi-directional many-to-one association to Recipe
	@ManyToOne
	private Recipe recipe;

	public Like() {
	}

	public int getIdLike() {
		return this.idLike;
	}

	public void setIdLike(int idLike) {
		this.idLike = idLike;
	}

	public Date getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Recipe getRecipe() {
		return this.recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

}