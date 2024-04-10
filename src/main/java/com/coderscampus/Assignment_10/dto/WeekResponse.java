package com.coderscampus.Assignment_10.dto;

import java.util.Objects;


public class WeekResponse {
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
}
