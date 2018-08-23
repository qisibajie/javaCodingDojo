package com.staticUsage;

public class MainClass {

    public static void main(String[] arg) {
        System.out.println(BaseClass.returnValue());
        System.out.println(ChildClass.returnValue());
        BaseClass x = new ChildClass();
        System.out.println(x.returnValue());
    }
}
