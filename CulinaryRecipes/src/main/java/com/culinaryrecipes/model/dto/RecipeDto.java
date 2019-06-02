package com.culinaryrecipes.model.dto;

import java.util.Date;

import com.culinaryrecipes.model.Recipe;

public class RecipeDto {
	
	private String country;

	private Date datetime;

	private String description;

	private int difficulty;

	private String ingredients;

	private String mainIngredient;

	private String photo;

	private String time;

	private String trivia;
	
	public RecipeDto() {};
	
	public RecipeDto(Recipe recipe) {
		this.country = recipe.getCountry();
		this.datetime = recipe.getDatetime();
		this.description = recipe.getDescription();
		this.difficulty = recipe.getDifficulty();
		this.ingredients = recipe.getIngredients();
		this.mainIngredient = recipe.getMainIngredient();
		this.photo = recipe.getPhoto();
		this.time = recipe.getTime();
		this.trivia = recipe.getTrivia();
	}
	
	

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the datetime
	 */
	public Date getDatetime() {
		return datetime;
	}

	/**
	 * @param datetime the datetime to set
	 */
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the difficulty
	 */
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * @param difficulty the difficulty to set
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	/**
	 * @return the ingredients
	 */
	public String getIngredients() {
		return ingredients;
	}

	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	/**
	 * @return the mainIngredient
	 */
	public String getMainIngredient() {
		return mainIngredient;
	}

	/**
	 * @param mainIngredient the mainIngredient to set
	 */
	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the trivia
	 */
	public String getTrivia() {
		return trivia;
	}

	/**
	 * @param trivia the trivia to set
	 */
	public void setTrivia(String trivia) {
		this.trivia = trivia;
	}
	
	

}
