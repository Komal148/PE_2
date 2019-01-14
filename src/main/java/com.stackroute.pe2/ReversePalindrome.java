package com.stackroute.pe2;

/*Write a Java method to Reverse the given input & Check if it is a Palindrome.*/

public class ReversePalindrome {
    String palCheck(String string) {
        String reverseString = "";
        int length = string.length();
        for (int i = length - 1 ; i >= 0 ; i--) //reversing the string
            reverseString = reverseString + string.charAt(i);
        if(reverseString.equals(string)) //checking for string equality
        {
            return (string + " is a palindrome");
        }
        else
        {
            return (string + " is not a palindrome");
        }
    }
}