package com.AXPOannieChallenge.stepDefs;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class AEMETapiKeyValidation {


    @Test
    public void validateAemetApiKey() {

        // Set the base URI for the AEMET API
        RestAssured.baseURI = "https://opendata.aemet.es/";
        String area = "mad2";

        // Make the API call and extract the response
        Response response = RestAssured.given()
                .header("API-Key", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJtYXlvbWVyMDVAZ21haWwuY29tIiwianRpIjoiNjRiMzBmNDEtNzU0Yy00YjI2LWE1ZTgtYjQzYTBhYjJkOWVkIiwiaXNzIjoiQUVNRVQiLCJpYXQiOjE3MzM3OTQ0NTksInVzZXJJZCI6IjY0YjMwZjQxLTc1NGMtNGIyNi1hNWU4LWI0M2EwYWIyZDllZCIsInJvbGUiOiIifQ.EOPJ3BynMbEPbC1AxWzyJDQgXNZm8xl27wSBWH5DtEw") // Replace with your valid API key
                .when()
                .get("https://opendata.aemet.es/opendata/api/prediccion/especifica/montaña/pasada/area/mad2")
                .then()
                .statusCode(200) // Assert that the response status code is 200
                .extract()
                .response();

        // Extract data from the response
        String responseBody = response.getBody().asString();
        System.out.println("Able to get MAD2 area successfully, therefore API KEY IS VALID" + responseBody);
    }
}