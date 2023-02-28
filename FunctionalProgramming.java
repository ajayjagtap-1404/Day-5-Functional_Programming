package com.assigenement.day_5.functional_programming;

import java.util.Scanner;

public class FunctionalProgramming {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Functional Programming :");

        SumOfThreeIntegers sumOfThreeIntegers = new SumOfThreeIntegers();
        System.out.println("Enter Array size : ");
        int size = sumOfThreeIntegers.sc.nextInt();
        int [] arr = new int[size];
        sumOfThreeIntegers.getArrInput(size,arr);

        sumOfThreeIntegers.checkTriplets(arr);

    }

    private void checkTriplets( int[] arr) {
        System.out.println("Triplets are : ");
        int count = 0;
        for (int i =0; i<arr.length; i++) {
            for (int j =i+1; j< arr.length; j++) {
                for (int k=j+1; k< arr.length; k++) {
                    int sum = arr[i]+arr[j]+arr[k];

                    if (sum == 0) {
                        System.out.println( + arr[i] +" "+ arr[j]+" "+arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Count of Triplet pair : " +count);
    }

    private   void getArrInput(int size, int []arr) {

        for (int i=0; i<size; i++) {
            System.out.println("Enter " +(i+1) + " element :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Element are : ");
        for (int i=0 ; i< arr.length ; i++) {
            System.out.print(arr[i]+ ",");

        }
        System.out.println();

         }
    }

