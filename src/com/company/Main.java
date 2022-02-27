// Denise Chen
// IS 147-04
// d189@umbc.edu
// 11/12/2021
// Put user input in an array, print array, and get sum of array

package com.company;

import java.util.Scanner;

public class Main {

    static int[] salesArray = new int[7];      // 7 is the length of the array

    public static void main(String[] args) {
        sales();
    } // public static void main END

    public static void sales() {

        Scanner inputSales = new Scanner(System.in);
        int totalSales = 0;
        for (int day = 0; day < salesArray.length; day++) {
            System.out.print("Enter sale for day " + (day + 1) + ": ");
            salesArray[day] = inputSales.nextInt();
            totalSales = totalSales + salesArray[day];
        }

        System.out.println("\nSales for 7 days \n------------------");

        for (int daySales = 0; daySales < salesArray.length; daySales++) {
            System.out.println("Day " + (daySales + 1) + " sales: " + salesArray[daySales]);
        }
        System.out.println("\nTotal sales: " + totalSales);
    } // sales() END
} //public class main END
