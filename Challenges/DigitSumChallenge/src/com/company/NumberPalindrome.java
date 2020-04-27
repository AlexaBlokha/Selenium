package com.company;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        int originalNumber = number;
        int reverse = 0;
        while (number > 0) {

            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;

            if (originalNumber == reverse) {
                return true;
            }
        }
        return false;
    }
}
