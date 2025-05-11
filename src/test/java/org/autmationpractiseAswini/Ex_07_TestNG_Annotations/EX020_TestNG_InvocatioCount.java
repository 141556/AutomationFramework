package org.autmationpractiseAswini.Ex_07_TestNG_Annotations;

import org.testng.annotations.Test;

public class EX020_TestNG_InvocatioCount {

    @Test (invocationCount = 10)
    public void test_TC1(){
        System.out.println("it will execute 10 times");

    }

}
