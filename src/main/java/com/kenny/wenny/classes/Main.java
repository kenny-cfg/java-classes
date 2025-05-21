package com.kenny.wenny.classes;

import com.kenny.wenny.classes.model.Student;

public class Main {
    public static void main(String[] args) {
        var studentA = new Student();
        var studentB = new Student();
        var studentC = new Student();
        System.out.println(studentA.getStudentOf());
        System.out.println(studentB.getStudentOf());
        System.out.println(studentC.getStudentOf());
    }
}