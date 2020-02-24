import java.util.Scanner;


public class harrisBenedictCalculator {

    public static void main(String[] args) {
        double BMR = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in kg:");
        double weight = in.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = in.nextDouble();
        System.out.print("Enter age:");
        int age = in.nextInt();


        System.out.println("Choose number representing your sex:\n1.male\n2.female"); //Prompt user for pyramid size
        int sex = in.nextInt();

        switch (sex) {
            case 1:
                BMR = (88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age));
                break;

            case 2:
                BMR = (447.593 + (9.247 * weight) + (3.090 * height) - (4.330 * age));
                break;
        }

        System.out.println("Choose number representing your lifestyle:\n1.Sedentary\n2.Lightly active\n3.Moderatetely active\n4.Very active\n5.Extra active");
        int lifestyle = in.nextInt();
        switch (lifestyle) {
            case 1:
                BMR = BMR * 1.2;
                break;
            case 2:
                BMR = BMR * 1.375;
                break;
            case 3:
                BMR = BMR * 1.55;
                break;
            case 4:
                BMR = BMR * 1.725;
                break;
            case 5:
                BMR = BMR * 1.9;
                break;
        }
        System.out.println("You should eat:" + " " + BMR + " " + "kcal");


    }
}