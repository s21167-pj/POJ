/*
Power of Thor - Episode 1 game from coding game implemented in Java.
Short bio: A basic problem to go a little bit further with conditions and variables: your program must allow Thor to
reach the coordinates of the light of power in a 2D field.
Author: Marcel P
*/

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            String direction = "";

            if (initialTy < lightY) {
                initialTy++;
                direction = "S";
            } else if (initialTy > lightY) {
                initialTy--;
                direction = "N";
            }

            if (initialTx < lightX) {
                initialTx++;
                direction += "E";
            } else if (initialTx > lightX) {
                initialTx--;
                direction += "W";
            }

            System.out.println(direction);
        }
    }
}
      
    