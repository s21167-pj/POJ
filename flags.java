/*
Flags implemented in Java.
Author: Marcel
 */

import java.util.Scanner; // Import Scanner class for get user input

public class flags {
    static void drawFlag(String flagCountry[][], int size) {
        for (int i = 0; i < 12; i++) {
            if (i % size == 0) {
                for (int j = 0; j < 18; j++) {
                    if (j % size == 0) System.out.print(flagCountry[i][j]);
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] polish = new String[12][18];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 18; j++) {
                if (i < 6) polish[i][j] = "*";
                else polish[i][j] = "o";
            }
        }

        System.out.println("Choice flag size \n1. big \n2. medium \n3. small");
    int choice = scan.nextInt();
        switch (choice){
            case 1:
                drawFlag(polish, 1);
                break;
            case 2:
                drawFlag(polish, 2);
                break;
            case 3:
                drawFlag(polish, 3 );
                break;
        }

    }
}