package com.coderscampus.Assignment_10.dto;

import java.util.List;


public class DayResponse {
<<<<<<< HEAD
    private List<MealResponse> meals;
    private NutrientResponse nutrients;
    
	public List<MealResponse> getMeals() {
		return meals;
=======
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
>>>>>>> 4e34c1fe89bbebb2e27473ec0bbb4f0a9b99faa7
	}
	public void setMeals(List<MealResponse> meals) {
		this.meals = meals;
	}
	public NutrientResponse getNutrients() {
		return nutrients;
	}
	public void setNutrients(NutrientResponse nutrients) {
		this.nutrients = nutrients;
	}
<<<<<<< HEAD
    
    
    
=======
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
>>>>>>> 4e34c1fe89bbebb2e27473ec0bbb4f0a9b99faa7
}
