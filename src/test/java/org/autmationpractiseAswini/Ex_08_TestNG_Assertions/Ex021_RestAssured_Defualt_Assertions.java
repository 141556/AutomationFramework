package org.autmationpractiseAswini.Ex_08_TestNG_Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Ex021_RestAssured_Defualt_Assertions {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;

    String payload = "{\n" +
            "\t\"firstname\" : \"Cameron\",\n" +
            "\t\"lastname\" : \"Winter\",\n" +
            "\t\"totalprice\" : 889,\n" +
            "\t\"depositpaid\" : true,\n" +
            "\t\"bookingdates\" : {\n" +
            "        \"checkin\": \"2025-06-05\",\n" +
            "        \"checkout\": \"2025-06-07\"\n" +
            "    },\n" +
            "    \"additionalneeds\": \"Breakfast,Dinner\"\n" +
            "}\n";

    @Test
    public void test_POSTRequest(){
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON).body(payload);

        response = requestSpecification.when().post();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        validatableResponse.body("booking.lastname", Matchers.equalTo("Winter"));
        validatableResponse.body("booking.firstname",Matchers.equalTo("Cameron"));
        validatableResponse.body("bookingid",Matchers.notNullValue());
    }
}
