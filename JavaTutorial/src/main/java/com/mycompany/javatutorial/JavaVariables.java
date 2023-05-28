package com.mycompany.javatutorial;

/**
 *
 * @author josel
 */
public class JavaVariables {

    public static void main(String[] args) {

        //variables
        String name = "John";
        System.out.println(name);
        int myNum = 15;
        System.out.println(myNum);

        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;

        //print variables
        System.out.println("Hello " + name);
        int x = 5;
        int y = 6;
        System.out.println(x + y);

        //Declare Many Variables
        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c);

        //Identifiers
        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;
    }
}
