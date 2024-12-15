package com.AXPOannieChallenge.stepDefs;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.hamcrest.Matchers.*;

public class ApiKeyValidationTest {
    private final String baseUrl = "https://api.aemet.es/api/antartida/datos";

    @Test
    public void validateApiKey() {
        SignupAutomation signupAutomation = new SignupAutomation();
        signupAutomation.signup("test@example.com", "password123");
        String apiKey = signupAutomation.getApiKey();

        // Validate API key
        Response response = RestAssured.given()
                .header("Authorization", "Bearer " + apiKey)
                .get(baseUrl + "/fechaini/2023-01-01/fechafin/2023-01-31/estacion/12345");

        // Validate response
        response.then()
                .statusCode(200)
                .body("temp", notNullValue())
                .body("pres", notNullValue())
                .body("vel", notNullValue());

    }
}