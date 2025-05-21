package com.kenny.wenny.classes.model;

public class Student {
    private String studentOf = "CFG";

    public String getStudentOf() {
        return studentOf;
    }

    public void setStudentOf(String studentOf) {
        System.out.println("Setting studentOf to " + studentOf);
        this.studentOf = studentOf;
    }
}
