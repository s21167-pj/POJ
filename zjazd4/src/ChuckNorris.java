/*
Chuck Norris game from coding game implemented in Java.
Short bio: Binary with 0 and 1 is good, but binary with only 0, or almost, is even better! Originally, this is a concept
designed by Chuck Norris to send so called unary messages. Write a program that takes an incoming message as input and
displays as output the message encoded using Chuck Norris’ method.
Author: Marcel P
*/

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String binaire = "";
        for (char car : text.toCharArray()) {
            String letterInBinary = Integer.toBinaryString(car);
            while (letterInBinary.length() < 7) {
                letterInBinary = "0" + letterInBinary;
            }
            binaire += letterInBinary;
        }

        char lastChar = '2';

        for (char car : binaire.toCharArray()) {
            if (car == lastChar) {
                System.out.print("0");
            } else {
                if (lastChar != '2') {
                    System.out.print(" ");
                }
                lastChar = car;
                if (lastChar == '0') {
                    System.out.print("0");
                }
                System.out.print("0 0");
            }
        }
    }

}