package com.company;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int remainder=0;
        int sumNumber = 0;

        while (number > 0) {
            remainder = number % 10;
            number/=10;

            if (remainder % 2 == 0) {
                sumNumber+=remainder;


            }
        }return sumNumber;
    }
}
