package com.coderscampus.Assignment_10.dto;

import java.util.Map;

public class WeekResponse {
<<<<<<< HEAD
    private Map<String, DayResponse> week;

	public Map<String, DayResponse> getWeek() {
		return week;
	}

	public void setWeek(Map<String, DayResponse> week) {
		this.week = week;
	}
    
    
=======
	private String targetCalories;
	private String diet;
	private String exclude;
	private String week;

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getTargetCalories() {
		return targetCalories;
	}
	public void setTargetCalories(String targetCalories) {
		this.targetCalories = targetCalories;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public String getExcludeIngredients() {
		return exclude;
	}
	public void setExcludeIngredients(String exclude) {
		this.exclude = exclude;
	}

	@Override
	public String toString() {
		return "WeekResponse{" +
				"targetCalories='" + targetCalories + '\'' +
				", diet='" + diet + '\'' +
				", exclude='" + exclude + '\'' +
				", week='" + week + '\'' +
				'}';
	}
>>>>>>> 4e34c1fe89bbebb2e27473ec0bbb4f0a9b99faa7
}
