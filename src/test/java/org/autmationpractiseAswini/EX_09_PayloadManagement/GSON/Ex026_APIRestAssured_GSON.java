package org.autmationpractiseAswini.EX_09_PayloadManagement.GSON;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;



import static org.assertj.core.api.Assertions.*;

public class Ex026_APIRestAssured_GSON {

    //GSON -Is a google library which will convert your class to json
    //JSON to Class
    //JSON is plain text in key and value pair to transfer from client to server

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    @Test
    public void test_Create_Booking_Positive()
    {
// Step1 - POST
        //URL --.Base URI and Base path
        //HEADER
        //BODY
        //AUT -No


        //STEP-2
        //Prepare payload (Object to JSON)
        //Send the request

        //STEP-3
        //Validate response
        //Verify status code

        Booking booking = new Booking();
        booking.setFirstname("Cameron");
        booking.setLastname("Winter");
        booking.setTotalprice(999);
        booking.setDepositpaid(true);

       Bookingdates bookingdates = new Bookingdates();
       bookingdates.setCheckin("2025-06-05");
       bookingdates.setCheckout("2025-06-07");
       booking.setBookingdates(bookingdates);
       booking.setAdditionalneeds("Breakfast");

        //java object to json
        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        System.out.println(jsonStringBooking);

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON).body(jsonStringBooking);

         response = requestSpecification.when().post();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        //CASE -1 Extarct of first name -Direct Extraction

        String firstname = response.then().extract().path("booking.firstname");
        System.out.println(firstname);

        //TestNG Assertion
        Assert.assertEquals(firstname,"Cameron");
        assertThat(firstname).isNotEmpty().isNotNull().isEqualTo("Cameron");

        //Json path jsonPath.getString("");
        JsonPath jsonpath = new JsonPath(response.asString());
        String bookingId = jsonpath.getString("bookingid");
        String firstName = jsonpath.getString("booking.firstname");
        System.out.println(bookingId);
        System.out.println(firstName);

        String jsonResponse = response.asString();


        //Case -3 DeSer - Extraction
        //We need another class for this -that is will use response to create a calss(BookingResponse

        BookingResponse bookingResponse = gson.fromJson(jsonResponse, BookingResponse.class);
        System.out.println(bookingResponse.getBooking().getFirstname());
        System.out.println(bookingResponse.getBooking().getLastname());
        System.out.println(bookingResponse.getBookingid());
        System.out.println(bookingResponse.getBooking().getAdditionalneeds());
        System.out.println(bookingResponse.getBooking().getTotalprice());
        System.out.println(bookingResponse.getBooking().getBookingdates().getCheckin());
        System.out.println(bookingResponse.getBooking().getBookingdates().getCheckout());


        assertThat(bookingResponse.getBookingid()).isNotNull().isNotZero();
    }
}
