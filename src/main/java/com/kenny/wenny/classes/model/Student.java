package com.kenny.wenny.classes.model;

public class Student {
    private String studentOf;

    // Default constructor: it has no arguments
    public Student() {
        this("CFG");
    }

    // Constructor overload
    public Student(String studentOf) {
        this.studentOf = studentOf;
    }

    public String getStudentOf() {
        return studentOf;
    }

    public void setStudentOf(String studentOf) {
        this.studentOf = studentOf;
    }
}
