public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){
//        firstNumber*=1000;
//        secondNumber*=1000;
//        if ((int)firstNumber==(int)secondNumber){
//            return true;
//        }else {
//            return false;
//        }

        return ((int)(firstNumber*=1000) == (int)(secondNumber*=1000));
    }

}
