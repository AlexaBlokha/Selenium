public class TeenNumberChecker {

//    public static boolean hasTeen(int firstCombo, int secondCombo, int thirdCombo) {
//        if ((firstCombo >= 13 && firstCombo <= 19) || (secondCombo >= 13 && secondCombo <= 19) || (thirdCombo >= 13 && thirdCombo <= 19)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public static boolean isTeen(int singleParam){
//        if(singleParam >=13 && singleParam <=19){
//            return true;
//        }else {
//            return false;
//        }

    public static boolean hasTeen(int firstCombo, int secondCombo, int thirdCombo) {
        return ((firstCombo >= 13 && firstCombo <= 19) || (secondCombo >= 13 && secondCombo <= 19) || (thirdCombo >= 13 && thirdCombo <= 19));
    }
    public static boolean isTeen(int singleParam){
       return  (singleParam >=13 && singleParam <=19);
    }
}

