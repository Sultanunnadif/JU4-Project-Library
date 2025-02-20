package com.nadif.Pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ReqresApiPages {
    private String baseURL = "https://reqres.in/";
    private Response response;

    public void setEndpoint(String endpoint){
        RestAssured.baseURI = baseURL + endpoint;
    }
    public Response sendGetRequest(){
        response = given()
                .get()
                .then()
                .extract()
                .response();
        return response;
    }
    public Response sendPOSTRequest(String requestBody){
        response = given()
                .header("Content-Type","application/json") //postman header
                .body(requestBody)
                .when()
                .post()
                .then()
                .extract()
                .response();
        return response;
    }
}
