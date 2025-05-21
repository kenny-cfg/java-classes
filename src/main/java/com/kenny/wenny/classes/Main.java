package com.kenny.wenny.classes;

import com.kenny.wenny.classes.model.Student;

public class Main {
    public static void main(String[] args) {
        var studentA = new Student("CFG");
        var studentB = new Student("Oxford");
        var studentC = new Student("Hull");
        System.out.println(studentA.getStudentOf());
        System.out.println(studentB.getStudentOf());
        System.out.println(studentC.getStudentOf());
    }
}