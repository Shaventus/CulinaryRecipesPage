package com.culinaryrecipes.model.dto;

public class CategoryDto 
{
	private int idCategory;
	private String name;
	private String type;

	public int getIdCategory() 
	{
		return this.idCategory;
	}

	public void setIdCategory(int idCategory) 
	{
		this.idCategory = idCategory;
	}

	public String getName() 
	{
		return this.name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getType() 
	{
		return this.type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}	
}
