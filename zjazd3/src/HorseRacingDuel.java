/*
Horse-racing Duals game from coding game implemented in Java.
Short bio: Casablanca’s hippodrome is organizing a new type of horse racing: duals. During a dual, only two horses will
 participate in the race. In order for the race to be interesting, it is necessary to try to select two horses with
 similar strength. Write a program which, using a given number of strengths, identifies the two closest strengths and
 shows their difference with an integer (≥ 0).
Author: Marcel P
*/


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Integer> power = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int Pi = in.nextInt();
            power.add(Pi);
        }

        Collections.sort(power);
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < power.size() - 1; i++) {
            int current = power.get(i);
            int next = power.get(i + 1);

            int D = next - current;
            if (D < answer) {
                answer = D;
            }
        }

        System.out.println(answer);
    }
}