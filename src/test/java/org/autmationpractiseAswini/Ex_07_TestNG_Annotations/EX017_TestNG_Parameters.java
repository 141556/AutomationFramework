package org.autmationpractiseAswini.Ex_07_TestNG_Annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EX017_TestNG_Parameters {

    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Browser checking");

        if (value.equalsIgnoreCase("firefox"))
            System.out.println("Start firefox browser");
        if(value.equalsIgnoreCase("chrome"))
            System.out.println("Start chrome browser");
    }
}
