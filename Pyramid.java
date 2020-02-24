/*
Pyramid implemented in Java.
Author: Marcel
 */


import java.util.Scanner; // Import Scanner class for get user input

public class Pyramid {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Create a scanner object
        System.out.print("Enter size of pyramid: "); //Prompt user for pyramid size
        int size = in.nextInt(); // Initalization of  size variable, and read user input

        int oddNumber = 1; // counter needed for changing rows by odd numbers
        int numberOfSpaces = size - 1; //number of spaces at start always less by 1 than initial size

        for (int i = 1; i <= size; i++) { // responsible for rows

            char letter = '`'; //this char is before a
            for (int j = 1; j <= numberOfSpaces; j++) {
                System.out.print(" "); //print spaces
            }


            for (int j = 1; j <= oddNumber; j++) {


                if (j <= i)  //until j is less or equal as row number chars increment
                {
                    letter++;
                } else //when j is more than row number chars decrement
                {
                    letter--;
                }

                System.out.print(letter); //print char
            }
            System.out.println();
            oddNumber += 2; //grows by 2 each loop to ensure odd number of chars in row
            numberOfSpaces--;//number of spaces decrease each loop
        }

    }
}

