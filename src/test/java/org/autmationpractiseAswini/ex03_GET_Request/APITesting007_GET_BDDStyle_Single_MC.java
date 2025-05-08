package org.autmationpractiseAswini.ex03_GET_Request;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting007_GET_BDDStyle_Single_MC {

    @Test
    public void GET_TC1(){
        RestAssured
                .given().baseUri("https://api.zippopotam.us").basePath("IN/560029")
                .when().get()
                .then().log().all().statusCode(200);
    }
    @Test
    public void GET_TC2(){
        RestAssured
                .given().baseUri("https://api.zippopotam.us").basePath("IN/560019")
                .when().get()
                .then().log().all().statusCode(200);
    }

}
