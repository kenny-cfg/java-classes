package com.kenny.wenny.classes;

public class Exercise5 {
    /*
Make a method that:
    Takes in a name, an age
    Prints out a different message depending on the age

    0-4: “yet to start school”
    5-18: “in school”
    18+: “adult”
    Returns a value depending on the class too - either “INFANT”,”CHILD”, or “ADULT”
     */
    public static String getPersonType(String name, int age) {
        if (age >= 0 && age <= 4) {
            System.out.println("yet to start school");
            return "INFANT";
        } else if (age >= 5 && age <= 18) {
            System.out.println("in school");
            return "CHILD";
        } else if (age > 18) {
            System.out.println("adult");
            return "ADULT";
        } else {
            System.out.println("I've no idea what you've given me");
            return "BUM";
        }
    }
}
