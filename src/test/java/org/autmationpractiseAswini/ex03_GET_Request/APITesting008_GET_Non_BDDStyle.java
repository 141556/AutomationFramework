package org.autmationpractiseAswini.ex03_GET_Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting008_GET_Non_BDDStyle {


    RequestSpecification r;
    Response R;
    ValidatableResponse VR;

    @Test
    public void NonBDD_GET(){
String pincode = "560029";
     r= RestAssured.given();
     r .baseUri("https://api.zippopotam.us/");
     r.basePath("IN/"+pincode);
     R = r.when().log().all().get();
     VR = R.then().log().all().statusCode(200);

    }
    @Test
    public void NonBDD_GET1(){
        String pincode = "515551";
        r= RestAssured.given();
        r .baseUri("https://api.zippopotam.us/");
        r.basePath("IN/"+pincode);
        R = r.when().log().all().get();
        VR = R.then().log().all().statusCode(200);

    }
}
