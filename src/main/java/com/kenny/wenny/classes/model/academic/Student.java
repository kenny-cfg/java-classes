package com.kenny.wenny.classes.model.academic;

public class Student {
    // This `final` makes the `name` attribute immutable
    private final String name;
    private String studentOf = "CFG";

    public Student(String name) {
        this.name = name;
        studentOf = "Not CFG";
    }

    public String getName() {
        return name;
    }

    // This method is pointless
    public void setName(String name) {
        // This can't work because the `name` attribute is `final`
//        this.name = name;
    }

    public String getStudentOf() {
        return studentOf;
    }

    public void setStudentOf(String studentOf) {
        this.studentOf = studentOf;
    }
}
