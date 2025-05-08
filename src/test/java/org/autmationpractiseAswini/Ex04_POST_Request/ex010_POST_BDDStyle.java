package org.autmationpractiseAswini.Ex04_POST_Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class ex010_POST_BDDStyle {

    String payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";

    @Test
    public void POST_Request(){RestAssured.given().baseUri("https://restful-booker.herokuapp.com").basePath("/auth").contentType(ContentType.JSON).body(payload
        ).when().post().then().log().all().statusCode(200);
    }



}
