package zjazd6;

import java.util.Arrays;
import java.util.Scanner;

/*
    Author: Marcel Pankanin  
    CreateLoans class implemented in Java
    Date: 18.05.2020
*/
public class CreateLoans {
    public static void main(String[] args) {
        Scanner scanOne = new Scanner(System.in);

        System.out.println("How many your prime interest rate is");
        double userInputRate = scanOne.nextDouble();
        Loan[] loans = new Loan[5];
        for (int i = 0; i < loans.length; i++) {
            Scanner scanTwo = new Scanner(System.in);
            System.out.println("Whats your name");
            String userInputName = scanTwo.nextLine();
            System.out.println("What type of loan you want");
            String userInputLoanType = scanTwo.nextLine().toUpperCase();
            System.out.println("How much money you want");
            double userInputAmount = scanTwo.nextDouble();
            System.out.println("How long you want pay for it");
            int userInputTerm = scanTwo.nextInt();
            if (userInputLoanType.equals("P")) {
                loans[i] = new PersonalLoan(i + 1, userInputName,
                        userInputAmount, userInputTerm,
                        userInputRate);
            } else if (userInputLoanType.equals("B")) {
                loans[i] = new BusinessLoan(i + 1, userInputName,
                        userInputAmount, userInputTerm,
                        userInputRate);
            }
        }
        System.out.println(Arrays.toString(loans));
    }
}
