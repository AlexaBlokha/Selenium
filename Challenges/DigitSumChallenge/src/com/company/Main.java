package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Sum of digit in number 125 is " + sumDigits(1001));
//        System.out.println("Sum of digit in number -125 is " + sumDigits(-125));
//        System.out.println("Sum of digit in number 4 is " + sumDigits(4));
//        System.out.println("Sum of digit in number 32123 is " + sumDigits(32123));
//
//
//        System.out.println(NumberPalindrome.isPalindrome(-222));


//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(322));

     //   System.out.println(EvenDigitSum.getEvenDigitSum(1223));
       // System.out.println(SharedDigit.hasSharedDigit(12,34));

        //System.out.println(LastDigitChecker.isValid(9));
        //System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25,15));

//        System.out.println(NumberToWords.getDigitCount(1234567));
//        System.out.println(NumberToWords.reverse(1000));
        NumberToWords.numberToWords(1000000100);
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        //125 -> 125/10=12 / 12*10=120 ->125-120=5

        while (number > 0) {
            //extract the least-significant digit

            int digit = number % 10;
            sum += digit;

            //drop the least-significant digit
            number /= 10;
        }
        return sum;
    }
}
