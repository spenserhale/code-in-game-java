package com.codeingame;

import java.util.Scanner;

public class Temperatures {
    /**
     * https://www.codingame.com/ide/puzzle/temperatures
     *
     * Write a program that prints the temperature closest to 0 among input data.
     * If two numbers are equally close to zero, positive integer has to be considered closest to zero
     * (for instance,if the temperatures are -5 and 5, then display 5).
     *
     * Input
     * Line 1: N, the number of temperatures to analyze
     * Line 2: A string with the N temperatures expressed as integers ranging from -273 to 5526
     *
     * Output
     * Display 0 (zero) if no temperatures are provided. Otherwise, display the temperature closest to 0.
     * @param args
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 0) {
            System.out.println(n);
            return;
        }

        int lowest = in.nextInt();
        int absLowest = Math.abs(lowest);
        n--;

        for (int i = 0; i < n; i++) {
            int current = in.nextInt();
            int absCurrent = Math.abs(current);

            if(absCurrent > absLowest) {
                continue;
            }

            if(absCurrent < absLowest) {
                lowest = current;
            } else {
                lowest = Math.max(current, lowest);
            }

            absLowest = Math.abs(lowest);
        }

        System.out.println(lowest);
    }
}
