package org.autmationpractiseAswini.Ex_08_TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ex022_TestNG_Assertions {
    //Hard assert

//    @Test
//    public void test_Hard_Assert(){
//        System.out.println("Start of the program");
//        Assert.assertEquals("aswini", "Aswini");//The assertion fails hence the next lines will not get execute
//        System.out.println("End of the program");
//    }



    //Soft assert

@Test
    public void test_SoftAssert(){
        System.out.println("Start of the program");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false);// though it fails the next line will get execute
        System.out.println("End of the program");
        softAssert.assertAll();
    }
}
