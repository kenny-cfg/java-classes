package com.kenny.wenny.classes.model;

public class Student {
    private String studentOf;

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
