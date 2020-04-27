package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int num1 = 0;
        int result = 0;
        if (first > second) {
            num1 = second;
        } else {
            num1 = first;
        }
        for (int i = num1; i > 0; i--) {
            int a = first % i;
            int b = second % i;
            if(a==0&&b==0){
                result=i;
                return result;
            }
        } return -1;
    }
}