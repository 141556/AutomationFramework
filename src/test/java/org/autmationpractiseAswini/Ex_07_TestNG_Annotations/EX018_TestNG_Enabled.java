package org.autmationpractiseAswini.Ex_07_TestNG_Annotations;

import org.testng.annotations.Test;

public class EX018_TestNG_Enabled {

    @Test (enabled = false)
    public void test_TC1()
    {
        System.out.println("TC1");
    }
    @Test
    public void test_TC2(){
        System.out.println("TC2");
    }
    @Test
    public void test_TC3(){
        System.out.println("TC3");
    }
}
