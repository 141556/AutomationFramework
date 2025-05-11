package org.autmationpractiseAswini.Ex_07_TestNG_Annotations;

import org.testng.annotations.Test;

public class Ex014_Annotations_Priority {

    @Test (priority = 1)
    public void t1(){
        System.out.println("t2");
    }

    @Test//if no priority has been assigned it will take it as first priority
    public void t3(){
        System.out.println("t1");
    }


    @Test (priority = 2)
    public void t2(){
        System.out.println("t3");
    }


}
