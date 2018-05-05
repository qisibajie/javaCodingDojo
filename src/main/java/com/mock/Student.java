package com.mock;

public class Student implements Person {

    private int age;

    public Student(){

    }

    public Student(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public static String getStaticMethod() {
        return "staticMethod";
    }

    @Override
    public String getName() {
        return "student";
    }

    public final String getFinalMethod(){
        return "getFinalMethod";
    }

    private String getPrivateMethod(){
        return "getPrivateMethod";
    }

    public String callPrivateMethod(){
        return getPrivateMethod();
    }
}
