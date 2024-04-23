package com.coderscampus.Assignment_10.dto;

import java.util.List;

public class DayResponse {
    private List<MealResponse> meals;
    private NutrientResponse nutrients;
    
    public List<MealResponse> getMeals() {
        return meals;
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
}