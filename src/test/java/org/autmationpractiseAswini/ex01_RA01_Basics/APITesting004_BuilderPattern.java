package org.autmationpractiseAswini.ex01_RA01_Basics;

public class APITesting004_BuilderPattern {

    public APITesting004_BuilderPattern step1(){
        System.out.println("Step1");
        return this;
    }
    public APITesting004_BuilderPattern step2(){
        System.out.println("Step2");
        return this;
    }
    public APITesting004_BuilderPattern step3(String param){
        System.out.println("Step2");
        return this;
    }

    public static void main(String[] args) {
        APITesting004_BuilderPattern bp = new APITesting004_BuilderPattern();
        bp.step1().step2().step3("Aswini");
    }
}
