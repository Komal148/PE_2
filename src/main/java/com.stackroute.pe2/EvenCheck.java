package com.stackroute.pe2;
/*Write a boolean method called isEven() in a class called EvenNumTest, which takes an int as input and returns true if the input is even. The signature of the method is as follows: public static boolean isEven(int number)*/

public class EvenCheck {
    Boolean checkEven(int number) {
        if(number % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
