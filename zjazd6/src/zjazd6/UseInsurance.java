package zjazd6;

import java.util.Scanner;

/*
    Author: Marcel Pankanin  
    UseInsurance program implemented in Java
    Date: 17.05.2020
*/
public class UseInsurance {
    public static void main(String[] args) {
        System.out.println("Choose your insurance \n 1. Health \n 2. Life");
        Insurance testInsurance;
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        if (userInput.equals("1")) {
            testInsurance = new Health();
            testInsurance.display();
        } else if (userInput.equals("2")) {
            testInsurance = new Life();
            testInsurance.display();
        } else {
            System.out.println("There is only 2 choices");
        }
    }
}
