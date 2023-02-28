package com.assigenement.day_5.functional_programming;

import java.util.Scanner;

public class FunctionalProgramming {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a, b, c:");

        System.out.println("Enter value of a:");
        double a = sc.nextDouble();

        System.out.println("Enter value of b:");
        double b = sc.nextDouble();

        System.out.println("Enter  value of c:");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.checkRoots(a,b,c);

    }
    private void checkRoots(double a, double b,double c) {


        //  formula
        double delta = (b * b - 4 * a * c);

        System.out.println("delta:" + delta);

        if (delta >= 0) {
            // check delta is greater or equal to  0

            // two real and distinct roots
            double firstRoot = (-b + Math.sqrt(delta)) / (2 * a);
            double secondRoot = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("First root: " + firstRoot);
            System.out.println("second root: " + secondRoot);
        } else {
            System.out.println("roots are not real ");

        }

    }
}
