package org.autmationpractiseAswini.Ex_07_TestNG_Annotations;

import org.testng.annotations.Test;

public class EX016_TestNG_DependsOnmethod {

    @Test
    public void serverStartedOK(){
        System.out.println("Server is ready to use");
    }

    @Test (dependsOnMethods = "serverStartedOK" )
    public void method1(){
        System.out.println("Method1");
    }
    @Test (dependsOnMethods = "serverStartedOK")
    public void method2(){
        System.out.println("Method2");
    }
}
