package com.assigenement.day_5.functional_programming;

import java.util.Scanner;

public class TwoDArrayProblem {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TwoDArrayProblem twoDArrayProblem = new TwoDArrayProblem();
        System.out.println("Welcome to 2D Arrays Problem ");
        System.out.println("Enter number for rows : ");
        int rows = twoDArrayProblem.sc.nextInt();

        System.out.println("Enter number for columns :");
        int column = twoDArrayProblem.sc.nextInt();
        int[][] arr = new int[rows][column];

        twoDArrayProblem.arrayElement(arr, rows, column);
    }

    private void arrayElement(int[][] arr, int rows, int column) {
        for (int i = 0; i < rows; i++) {
            //    System.out.println("Enter " +(i+1) + " element: ");
            for (int j = 0; j < column; j++) {
               // System.out.println("Enter " + (j + 1) + " element: ");
                System.out.println("Enter element :");

                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Element are in 2D Array :");
        for (int i=0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
             }
            System.out.println();
        }
    }



}
