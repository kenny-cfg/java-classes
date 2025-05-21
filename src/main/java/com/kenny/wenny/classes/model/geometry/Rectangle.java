package com.kenny.wenny.classes.model.geometry;

public class Rectangle extends Shape {
    private final double width;
    private final double height;
    public static String name = "RECTANGLE";

    public static String getName() {
        return name;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override // Optional, but generally good practice
    public double getArea() {
        return width * height;
    }
}
