package com.kenny.wenny.classes;

import com.kenny.wenny.classes.model.Student;

public class Main {
    public static void main(String[] args) {
        var student = new Student();
        student.setStudentOf("Open University");
        System.out.println(student.getStudentOf());
    }
}