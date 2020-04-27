package com.company;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastNumber = -1;

        while (number > 0) {
            if (number % 10 > lastNumber && lastNumber == -1) {
                lastNumber = number % 10;
            }
            if (number / 10 == 0) {
                lastNumber += number % 10;
            }
            number /= 10;

        }
        return lastNumber;
    }
}