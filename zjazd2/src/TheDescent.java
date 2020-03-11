/*
The Descent game from coding game implemented in Java.
Short bio: A simple problem to try out the CodinGame platform: your program must find the highest mountain out of a list of mountains.
Author: Marcel
*/
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int mountainIndex= 0;
        int tmpIndex=0;
        // game loop
        int sizeOfMount = 0;
        while (true) {
            sizeOfMount=0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if(mountainH>sizeOfMount){
                    sizeOfMount = mountainH;
                    tmpIndex=i;
                }
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(tmpIndex); // The index of the mountain to fire on.
        }
    }
}
