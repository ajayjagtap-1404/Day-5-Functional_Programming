package com.assigenement.day_5.functional_programming;

import java.util.Scanner;

public class FunctionalProgramming {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Distance from (0, 0) to (" + x + ", " + y + ") is " + distance);
    }
}
