package org.autmationpractiseAswini.EX_09_PayloadManagement;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex024_RestAssured_PayloadMap {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;

    @Test
    public void test_POST(){
//        String payload = "{\n" +
//                "\t\"firstname\" : \"Cameron\",\n" +
//                "\t\"lastname\" : \"Winter\",\n" +
//                "\t\"totalprice\" : 889,\n" +
//                "\t\"depositpaid\" : true,\n" +
//                "\t\"bookingdates\" : {\n" +
//                "        \"checkin\": \"2025-06-05\",\n" +
//                "        \"checkout\": \"2025-06-07\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\": \"Breakfast,Dinner\"\n" +
//                "}\n";

        Map<String,Object > JsonBodyMap = new LinkedHashMap<>();
        JsonBodyMap.put("firstname", "Aswini");
        JsonBodyMap.put("lastname", "Jangala");
        JsonBodyMap.put("totalprice", 899);
        JsonBodyMap.put("depositpaid", true);

        Map<String,Object > JsonDatesMap = new LinkedHashMap<>();
        JsonDatesMap.put("checkin", "2025-05-07");
        JsonDatesMap.put("checkout", "2025-05-08");


        Map<String,Object> JsonOtherMap = new LinkedHashMap<>();
        JsonOtherMap.put("additionalneeds", "Breakfast");
//        System.out.println(JsonBodyMap+"JsonDatesMap"+JsonOtherMap);
}
}
