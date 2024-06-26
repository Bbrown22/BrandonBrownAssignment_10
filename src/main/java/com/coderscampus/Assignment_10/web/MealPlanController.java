package com.coderscampus.Assignment_10.web;

import java.net.URI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.coderscampus.Assignment_10.dto.DayResponse;
import com.coderscampus.Assignment_10.dto.WeekResponse;

@RestController
public class MealPlanController {

    @GetMapping("/mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(
            @RequestParam(value = "targetCalories", required = false) Integer targetCalories,
            @RequestParam(value = "diet", required = false) String diet,
            @RequestParam(value = "exclude", required = false) String exclude) {

        UriComponentsBuilder builder = UriComponentsBuilder
                .fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("apiKey","1a8d3fca280944d4a241292d1ddc0084")
                .queryParam("timeFrame","week");

        if (targetCalories != null) {
            builder.queryParam("targetCalories", targetCalories);
        }

        if (diet != null) {
            builder.queryParam("diet", diet);
        }

        if (exclude != null) {
            builder.queryParam("exclude", exclude);
        }

        URI uri = builder.build().toUri();

        RestTemplate rt = new RestTemplate();
        ResponseEntity<WeekResponse> responseEntity  = rt.getForEntity(uri, WeekResponse.class);
        System.out.println(responseEntity);
        return responseEntity;
    }

    @GetMapping("/mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(
            @RequestParam(value = "targetCalories", required = false) Integer targetCalories,
            @RequestParam(value = "diet", required = false) String diet,
            @RequestParam(value = "exclude", required = false) String exclude) {

        UriComponentsBuilder builder = UriComponentsBuilder
                .fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("apiKey","1a8d3fca280944d4a241292d1ddc0084")
                .queryParam("timeFrame","day");

        if (targetCalories != null) {
            builder.queryParam("targetCalories", targetCalories);
        }

        if (diet != null) {
            builder.queryParam("diet", diet);
        }

        if (exclude != null) {
            builder.queryParam("exclude", exclude);
        }

        URI uri = builder.build().toUri();

        RestTemplate rt = new RestTemplate();
        ResponseEntity<DayResponse> responseEntity  = rt.getForEntity(uri, DayResponse.class);
        System.out.println(responseEntity);
        return responseEntity;
    }
}