package org.autmationpractiseAswini.ex02_RA_TestNG_AllureReport;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_FixForMultiple_TC_TestNG {


    @Test
    @Description( "Positive Test case to fetch the details of pin code"
    )
    public void test_GET_Positive_TC1(){
        RestAssured.given().baseUri("https://api.zippopotam.us").
                basePath("/IN/560029").
                when().get().then().log().all().statusCode(200);
    }
    @Test
    @Description( "Negative Test case to fetch the details of pin code"
    )
    public void test_GET_Negative_TC2(){
        RestAssured.given().baseUri("https://api.zippopotam.us").
                basePath("/IN/1234").
                when().get().then().log().all().statusCode(404);
    }
    @Test
    @Description( "Negative Test case to fetch the details of pin code"
    )
    public void test_GET_Negative_TC3(){
        RestAssured.given().baseUri("https://api.zippopotam.us").
                basePath("/USA/560029").
                when().get().then().log().all().statusCode(404);

    }

}
