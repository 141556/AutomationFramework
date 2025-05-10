package org.autmationpractiseAswini.ex01_RA01_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting002_ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pin code:");
        int pincode = sc.nextInt();
        RestAssured.given().baseUri("https://api.zippopotam.us").
                basePath("/IN/"+pincode).
                when().get().then().log().all().statusCode(200);

    }
}
