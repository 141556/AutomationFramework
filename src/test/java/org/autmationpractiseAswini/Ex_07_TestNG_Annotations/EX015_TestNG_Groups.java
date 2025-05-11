package org.autmationpractiseAswini.Ex_07_TestNG_Annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EX015_TestNG_Groups {

    //Sanity - 1
    //Regression -2
    //Smoke -1

    @Test (groups = {"sanity","reg"}, priority = 1)
    public void test_Sanity(){
        System.out.println("Sanity");
        System.out.println("Reg");
        Assert.assertTrue(true);
    }
    @Test (groups = {"P1", "Regression"}, priority = 2)
    public void test_Regression(){
        System.out.println("P1");
        System.out.println("Regression");

    }
    @Test (groups = {"P1","Smoke"}, priority = 3)
    public void test_Smoke(){
        System.out.println("P1");
        System.out.println("Smoke");
    }
}
