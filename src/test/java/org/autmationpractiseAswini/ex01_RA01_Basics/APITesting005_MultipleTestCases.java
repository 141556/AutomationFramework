package org.autmationpractiseAswini.ex01_RA01_Basics;

import io.restassured.RestAssured;

public class APITesting005_MultipleTestCases {

    public static void main(String[] args) {

        //Fetch PIN Code details
        //full URL = https://api.zippopotam.us/IN/560029
        //Base URI = https://api.zippopotam.us
        //Base path = /IN/560029

         int pincode = 560029;
        RestAssured.given().baseUri("https://api.zippopotam.us").
                basePath("/IN/"+pincode).
                when().get().then().log().all().statusCode(200);


     String pincode1 = "@";
        RestAssured.given().baseUri("https://api.zippopotam.us").
                basePath("/IN/"+pincode1).
                when().get().then().log().all().statusCode(200);

        pincode1 = "-1";
        RestAssured.given().baseUri("https://api.zippopotam.us").
                basePath("/IN/"+pincode1).
                when().get().then().log().all().statusCode(200);

//Comment: will get an error the main method has a problem now, we can't execute one test case also parallel so to manage there is a library called TESTNG
    }
}
