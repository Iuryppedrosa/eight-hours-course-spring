package com.iurydev.Project8Hours.entities;

public class MyFirstClass {

    private String myVar;

    //construtor
    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    //método
    public String hello(){
        return "Hello, World! ==> myVar = " + myVar;
    }
}