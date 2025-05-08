package org.autmationpractiseAswini.ex01_RA01_Basics;

public class APITesting003_NoDesignPatternOrNoChaining {
    public void step1(){
        System.out.println("Step1");
    }
    public void step2(){
        System.out.println("Step2");
    }
    public void step3(String param){
        System.out.println("Step3");
    }
    public static void main(String[] args) {
        APITesting003_NoDesignPatternOrNoChaining np = new APITesting003_NoDesignPatternOrNoChaining();

        //No Design pattern: We call each one by one
        np.step1();
        np.step2();
        np.step3("ASWINI");
    }
}
