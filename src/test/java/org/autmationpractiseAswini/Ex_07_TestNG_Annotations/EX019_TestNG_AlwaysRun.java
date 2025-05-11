package org.autmationpractiseAswini.Ex_07_TestNG_Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class EX019_TestNG_AlwaysRun {

    @Test (alwaysRun = true)//Always run we can it must and should e.g prerequistes -env setup
    public void test_TC1(){
        System.out.println("it will run always");
    }
    @AfterTest
    @Test
    public void test_TC2(){
        System.out.println("TC2");
    }
}
