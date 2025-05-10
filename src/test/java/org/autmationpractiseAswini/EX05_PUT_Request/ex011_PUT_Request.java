package org.autmationpractiseAswini.EX05_PUT_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ex011_PUT_Request {

    RequestSpecification requestSpecification ;
    Response response;
    ValidatableResponse validatableResponse;
    @Test
    @Description("Update the booking details")
    public void NonBDD_PUTRequest(){
  String token = "55c63b1c11f6a84";
  String bookingId = "1648";
  String username ="admin";
  String password = "password123";
  String payload = "{\n" +
          "\t\"firstname\" : \"marry\",\n" +
          "\t\"lastname\" : \"Diaz\",\n" +
          "\t\"totalprice\" : 2110,\n" +
          "\t\"depositpaid\" : true,\n" +
          "\t\"bookingdates\" : {\n" +
          "        \"checkin\": \"2023-05-09\",\n" +
          "        \"checkout\": \"2023-07-09\"\n" +
          "    },\n" +
          "    \"additionalneeds\": \"Breakfast,Dinner\"\n" +
          "}";

        requestSpecification = RestAssured.given().baseUri("https://restful-booker.herokuapp.com").basePath("/booking/"+bookingId).cookie(token,"token").contentType(ContentType.JSON).auth().basic(username, "admin").auth().basic(password,"password123").body(payload).cookie("token", token);
        response= requestSpecification.when().put();
        validatableResponse= response. then().log().all().statusCode(200);
    }
}
