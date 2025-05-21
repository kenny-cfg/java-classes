package com.kenny.wenny.classes.model;

public class Student {
    private String name;
    private String studentOf = "CFG";

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getStudentOf() {
        return studentOf;
    }

    public void setStudentOf(String studentOf) {
        this.studentOf = studentOf;
    }
}
