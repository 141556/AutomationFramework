package org.autmationpractiseAswini.ex03_GET_Request;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting006_GET_BDDStyle_Single_TC {
    @Test
    public void BDDStyle(){
        String pincode = "560029";
        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("IN"+pincode).when().get()
                .then().log().all().statusCode(200);
    }

}
