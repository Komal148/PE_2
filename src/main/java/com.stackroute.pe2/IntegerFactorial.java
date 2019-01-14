package com.stackroute.pe2;

/*Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit signed integer)*/

public class IntegerFactorial {
    public String getFactorial(int number) {
        String string="";
        int factorial=1;
        for (int i=1;i<=number;i++) {
            factorial = factorial * i; // calculates factorial
            string = string + "The factorial of " + i + " is " + factorial + "\n";
        }
        return string;
    }
}

