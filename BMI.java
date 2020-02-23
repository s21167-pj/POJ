import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        int weight = in.nextInt();


        System.out.print("Enter height in cm: ");
        int heightInCentimetre = in.nextInt();

        double heightInMeters = (heightInCentimetre * 0.01);
        double bmi = weight / (heightInMeters * heightInMeters);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.print("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.print("Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.print("Overweight");
        } else if (bmi >= 30) {
            System.out.print("Obese");
        }
    }

}
