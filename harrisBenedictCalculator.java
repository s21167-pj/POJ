/*
Harris Benedict Calculator implemented in Java.
Author: Marcel
 */

import java.util.Scanner; // Import Scanner class for get user input



public class harrisBenedictCalculator {

    public static void main(String[] args) {
        int BMR = 0;

        Scanner in = new Scanner(System.in);  // Create a scanner object
        System.out.print("Enter weight in kg:"); //prompt user for weight
        int weight = in.nextInt();
        System.out.print("Enter height in cm: "); //prompt user for height
        int height = in.nextInt();
        System.out.print("Enter age:"); //prompt user for age
        int age = in.nextInt();


        System.out.println("Choose number representing your sex:\n1.male\n2.female"); //promp user for sex choice and calc BMR depending of their choice
        int sex = in.nextInt();

        switch (sex) {
            case 1:
                BMR = (int) (66.5 + (13.75 * weight) + (5.003 * height) - (6.775 * age));
                break;

            case 2:
                BMR = (int) (655.1 + (9.563 * weight) + (1.85 * height) - (4.676 * age));
                break;
        }

        System.out.println("Choose number representing your lifestyle:\n1.Sedentary\n2.Lightly active\n3.Moderatetely active\n4.Very active\n5.Extra active"); //prompt user for their activity level and calc BMR depending of  their choice
        int lifestyle = in.nextInt();
        switch (lifestyle) {
            case 1:
                BMR = (int) (BMR * 1.2);
                break;
            case 2:
                BMR = (int) (BMR * 1.3);
                break;
            case 3:
                BMR = (int) (BMR * 1.6);
                break;
            case 4:
                BMR = (int) (BMR * 1.7);
                break;
            case 5:
                BMR = (int) (BMR * 1.9);
                break;
        }
        System.out.println("You should eat:" + " " + BMR + " " + "kcal"); //calc and present final BMR


    }
}