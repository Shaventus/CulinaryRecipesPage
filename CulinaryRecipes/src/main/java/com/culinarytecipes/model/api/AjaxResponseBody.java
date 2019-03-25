package com.culinarytecipes.model.api;

import java.util.List;

public class AjaxResponseBody<T> {

	String mgs;
	List<T> result;
	public String getMgs() {
		return mgs;
	}
	public void setMgs(String mgs) {
		this.mgs = mgs;
	}
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
	
}
