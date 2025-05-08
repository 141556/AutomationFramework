package org.autmationpractiseAswini.Ex04_POST_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ex09_POST_Request_NonBDDStyle {

    RequestSpecification r;
    Response R;
    ValidatableResponse VR;


    String payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";

    @Test
    @Description("Token generation")
    public void POST_Request() {
        //Part-1 Requesting the HTTP METHOD,URL and Body
        r = RestAssured.given().baseUri("https://restful-booker.herokuapp.com").basePath("/auth");
        r = r.contentType(ContentType.JSON);
        r = r.body(payload);

        //Part-2 sending request
        R = r.when().log().all().post();
        //Part-3 Verification of status
        VR = R.then().log().all().statusCode(200);


    }
}
