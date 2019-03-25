package com.culinaryrecipes.model.dto;

import java.util.Date;

public class LikeDto 
{
	private int idLike;
	private Date datetime;
	
	public int getIdLike() 
	{
		return this.idLike;
	}

	public void setIdLike(int idLike) 
	{
		this.idLike = idLike;
	}

	public Date getDatetime() 
	{
		return this.datetime;
	}

	public void setDatetime(Date datetime) 
	{
		this.datetime = datetime;
	}	
}
