package com.coderscampus.Assignment_10.web;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment_10.dto.ApiException;
import com.coderscampus.Assignment_10.dto.DayResponse;
import com.coderscampus.Assignment_10.dto.WeekResponse;

@RestController 
public class MealPlanController {
    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(@RequestParam Long targetCalories,
                                                   @RequestParam String diet,
                                                   @RequestParam String exclude){
        RestTemplate rt = new RestTemplate();

        try {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "f516a0488d574f418c3ad84afd1d65dd")
                    .queryParam("timeFrame", "day")
                    .queryParam("targetCalories", targetCalories)
                    .queryParam("diet", diet)
                    .queryParam("excludeIngredients", exclude)
                    .build()
                    .toUri();

            return rt.getForEntity(uri, DayResponse.class);
        } catch (RestClientException e) {
            throw new ApiException("Error occurred while making the API request", e);
        }
    }

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<String> handleApiException(ApiException ex) {
        // log the error
        System.out.println(ex.getMessage());
        // return a response
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
    }

    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam Long targetCalories,
                                                    @RequestParam String diet,
                                                    @RequestParam String excludeIngredients){
        RestTemplate rt = new RestTemplate();
        ResponseEntity<WeekResponse> response = null;

        try {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "f516a0488d574f418c3ad84afd1d65dd")
                    .queryParam("timeFrame", "week")
                    .queryParam("targetCalories", targetCalories)
                    .queryParam("diet", diet)
                    .queryParam("excludeIngredients", excludeIngredients)
                    .build()
                    .toUri();

            response = rt.getForEntity(uri, WeekResponse.class);
        } catch (RestClientException e) {
            System.out.println("Error occurred while making the API request: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        return response;
    }
}