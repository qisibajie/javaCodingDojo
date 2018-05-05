package com.mock;

public class Student implements Person {

    private int age;
    private PersonPrinter personPrinter;

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

    public void doAnswerHighSchoolStudent(){
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
        highSchoolStudent.setName("highSchoolStudent");
        highSchoolStudent.setAge(10);
        highSchoolStudent.setId(123456789);
        personPrinter.printPerson(highSchoolStudent);
        highSchoolStudent.setGrade(3);
    }

    public void staticDoAnswerHighSchoolStudent(){
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
        highSchoolStudent.setName("highSchoolStudent");
        highSchoolStudent.setAge(10);
        highSchoolStudent.setId(123456789);
        CommonPrinter.printPerson(highSchoolStudent);
        highSchoolStudent.setGrade(3);
    }

    public void setPersonPrinter(PersonPrinter personPrinter) {
        this.personPrinter = personPrinter;
    }
}
