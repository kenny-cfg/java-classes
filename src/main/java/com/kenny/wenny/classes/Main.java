package com.kenny.wenny.classes;

import com.kenny.wenny.classes.model.Student;

public class Main {
    public static void main(String[] args) {
        var studentA = new Student("Ekta");
        var studentB = new Student("Nade");
        var studentC = new Student("Kenny");
        System.out.println(studentA.getStudentOf());
        System.out.println(studentB.getName());
        System.out.println(studentC.getName());
    }
}