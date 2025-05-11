package org.autmationpractiseAswini.Ex_07_TestNG_Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex013_TestNG_BeforeAndAfter_Annotations {
    //To Perform PUT
    // You need to get a token
    //You need to get a Booking id
    //Perform put
    //Close All

    @Test
    public void Put_Test(){

        System.out.println("1");
    }

    @BeforeTest
    public void get_Token(){ //It means @BeforeTest will execute before @Test
        System.out.println("2");
    }

    @BeforeTest
    public void get_BookingId(){ //It means @BeforeTest will execute before @Test
        System.out.println("3");
    }

    @AfterTest
    public void CloseAll(){
        System.out.println("Close");
    }
}
