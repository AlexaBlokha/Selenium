package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if (numberOne < 10 || numberOne > 99) {
            return false;
        }
        if (numberTwo < 10 || numberTwo > 99) {
            return false;
        }

        int division = numberTwo / 10;
        int remainder = numberTwo % 10;
        int division2 = numberOne / 10;
        int remainder2 = numberOne % 10;

        if ((division == division2 || division == remainder2) || ((remainder == division2 || remainder == remainder2))) {
            return true;
        }

        return false;
    }
}