package org.autmationpractiseAswini.Ex_07_TestNG_Annotations;

import org.testng.annotations.*;

public class EX021_TestNG_All_Annotations {


    @Test
    public void test_TC1(){
        System.out.println("TC");
    }
    @BeforeSuite
    public void test_TC2(){
        System.out.println("Before suite");
    }
    @BeforeClass
    public void test_TC4(){
        System.out.println("Before class");
    }
    @BeforeTest
    public void test_TC3(){
        System.out.println("Before Test");
    }

    @BeforeMethod
    public void test_TC5(){
        System.out.println("Before method");
    }

    @AfterMethod
    public void test_TC6(){
        System.out.println("After method");
    }

    @AfterClass
    public void test_TC7(){
        System.out.println("After class");
    }

    @AfterTest
    public void test_TC8(){
        System.out.println("After test");
    }
    @AfterSuite
    public void test_TC9(){
        System.out.println("After Suite");
    }


}
