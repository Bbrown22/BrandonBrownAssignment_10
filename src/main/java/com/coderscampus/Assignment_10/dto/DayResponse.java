package com.coderscampus.Assignment_10.dto;

import java.util.Objects;


public class DayResponse {
	private String targetCalories;
	private String diet;
	private String exclude;

	private String timeFrame;

	public String getTimeFrame() {
		return timeFrame;
	}

	public void setTimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
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
	public String getExclude() {
		return exclude;
	}
	public void setExclude(String exclude) {
		this.exclude = exclude;
	}

	@Override
	public String toString() {
		return "DayResponse{" +
				"targetCalories='" + targetCalories + '\'' +
				", diet='" + diet + '\'' +
				", exclude='" + exclude + '\'' +
				'}';
	}
}
