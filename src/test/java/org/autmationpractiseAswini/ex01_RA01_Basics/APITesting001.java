package org.autmationpractiseAswini.ex01_RA01_Basics;

import io.restassured.RestAssured;

public class APITesting001 {
    public static void main(String[] args) {

        //Fetch PIN Code details
        //full URL = https://api.zippopotam.us/IN/560029
        //Base URI = https://api.zippopotam.us
        //Base path = /IN/560029

        RestAssured.given().baseUri("https://api.zippopotam.us").
                basePath("/IN/560029").
                when().get().then().log().all().statusCode(200);

    }
}
