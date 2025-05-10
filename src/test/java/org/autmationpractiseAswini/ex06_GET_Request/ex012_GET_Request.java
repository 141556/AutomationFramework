package org.autmationpractiseAswini.ex06_GET_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ex012_GET_Request {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    @Description

    public void GET_request() {
        String bookingid = "1648";
        requestSpecification = RestAssured.given().baseUri("https://restful-booker.herokuapp.com").basePath("/booking/"+bookingid);
        response = requestSpecification.when().get();
        validatableResponse = response.then().log().all().statusCode(200);


    }
}
