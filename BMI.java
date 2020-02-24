import java.util.Scanner; // Import Scanner class for get user input

public class BMI {  //

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Create a scanner object

        System.out.print("Enter weight in kg: "); // Prompt user for enter weight kg
        int weight = in.nextInt(); // Initalization of weight variable, and read user input

        System.out.print("Enter height in cm: "); // Prompt user for enter height in cm
        int heightInCentimetre = in.nextInt(); //  Initalization of height variable, and read user input

        double heightInMeters = (heightInCentimetre * 0.01); // Convert height to metres
        double bmi = weight / (heightInMeters * heightInMeters); // Calculate BMI

        System.out.println("Your BMI is: " + bmi); // Output BMI
        // simple if checking bmi between specific periods
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
