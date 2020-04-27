package com.company;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int remainder1 = num1 % 10;
        int remainder2 = num2 % 10;
        int remainder3 = num3 % 10;

        if (remainder1 == remainder2 || remainder1 == remainder3 || remainder2 == remainder3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}