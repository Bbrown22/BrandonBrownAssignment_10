package com.coderscampus.Assignment_10.dto;

import java.util.Objects;

//import java.util.Objects;

public class DayResponse {
	private Long targetCalories;
	private String diet;
	private String exclude;
	
	public Long getTargetCalories() {
		return targetCalories;
	}
	public void setTargetCalories(Long targetCalories) {
		this.targetCalories = targetCalories;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public String getExclude() {
		return exclude;
	}
	public void setExclude(String exclude) {
		this.exclude = exclude;
	}
	@Override
	public int hashCode() {
		return Objects.hash(diet, exclude, targetCalories);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DayResponse other = (DayResponse) obj;
		return Objects.equals(diet, other.diet) && Objects.equals(exclude, other.exclude)
				&& Objects.equals(targetCalories, other.targetCalories);
	}
	@Override
	public String toString() {
		return "DayResponse [targetCalories=" + targetCalories + ", diet=" + diet + ", exclude=" + exclude + "]";
	}
	
	
	
	
	
	

}
