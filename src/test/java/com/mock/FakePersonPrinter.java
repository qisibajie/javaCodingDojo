package com.mock;

public class FakePersonPrinter implements PersonPrinter {
    private HighSchoolStudent highSchoolStudent;

    @Override
    public void printPerson(HighSchoolStudent highSchoolStudent) {
        this.highSchoolStudent = highSchoolStudent;
    }


    public HighSchoolStudent getHighSchoolStudent() {
        return highSchoolStudent;
    }
}
