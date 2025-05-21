package com.kenny.wenny.classes;

import com.kenny.wenny.classes.model.academic.Student;
import com.kenny.wenny.classes.model.geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        var rectangle = new Rectangle(3, 4);
        System.out.println("Area of the rectangle is " + rectangle.getArea());
    }
}