/*
Armstrong Number checker implemented in Java.
Author: Marcel P
 */

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {

    public static void isArmstrongNumber(int numberToCheck) {
        int numberToCompare = numberToCheck;
        int lengthOfNumber = String.valueOf(numberToCheck).length();
        int validateResult = 0;
        List<Double> superDigits = new ArrayList<Double>();
        while (numberToCheck > 0) {
            superDigits.add(Math.pow(numberToCheck % 10, lengthOfNumber)); //powered(x length) modulo
            numberToCheck /= 10;
        }
        for (Double d : superDigits)
            validateResult += d;
        if (numberToCompare == validateResult) {
            System.out.println("Provided number is Armstrong number");
        } else {
            System.out.println("Provided number is not Armstrong number");
        }
    }

    public static void main(String[] args) {
        isArmstrongNumber(153);
        isArmstrongNumber(123);
        isArmstrongNumber(1634);

    }
}
