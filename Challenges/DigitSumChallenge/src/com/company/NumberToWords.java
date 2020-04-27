package com.company;

public class NumberToWords {

    public static void numberToWords(int number) {
        int count = getDigitCount(number);
        int reverse = 0;
        int reverseCount = 0;
        if (count < 0) {
            System.out.println("Invalid Value");
        } else {
            reverse = reverse(number);
            reverseCount = getDigitCount(reverse);
        }
        int zeroes = 0;
        if (count > reverseCount) {
            zeroes = count - reverseCount;
        }


        while (reverseCount > 0) {
            int numberx = 0;
            numberx = (numberx * 10) + (reverse % 10);
            reverse /= 10;

            switch (numberx) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            reverseCount--;
        }

        for (int i = 0; i < zeroes; i++) {
            System.out.print("Zero ");
        }
    }

    public static int reverse(int number) {
        boolean negative = false;
        if (number < 0) {
            negative = true;
            number *= -1;
        }

        int reverse = 0;
        while (number > 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }

        if (negative) {
            reverse *= -1;
        }

        return reverse;
    }


    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number == 0) return 1;
        int count = 0;

        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
