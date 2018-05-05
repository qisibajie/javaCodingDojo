package com.mock;

public enum  PersonType {
    S("student"), N("normal");

    private String type;

    PersonType(String type) {

        this.type = type;
    }

    public String getType(){
        return type;
    }
}
