package com.bridgelabz;

import java.util.Scanner;
import java.lang.Math;

public class LineComparision {

       static float length1=0;
       static float length2=0;

        static void compare() {

                if ( length1> length2) {
                        System.out.println("Line 1 is greater than Line 2");
                } else {
                        System.out.println("Line 1 is smaller than Line 2");
                }
        }

        static void equals(){
        // welcome to Line Comparison Program.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1");
        double x1 = sc.nextDouble();
        System.out.println("Enter y1");
        double y1 = sc.nextDouble();
        System.out.println("Enter x2");
        double x2 = sc.nextDouble();
        System.out.println("Enter y2");
        double y2 = sc.nextDouble();
        System.out.println("Enter x3");
        double x3 = sc.nextDouble();
        System.out.println("Enter y3");
        double y3 = sc.nextDouble();
        System.out.println("Enter x4");
        double x4 = sc.nextDouble();
        System.out.println("Enter y4");
        double y4 = sc.nextDouble();


         length1 = (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of line is: " + length1);

         length2 = (float) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length of line is: " + length2);

        if (length1 == length2) {
            System.out.println("Two lines are equal");
        } else {
            System.out.println("Two lines are not equal");
        }

    }

    public static void main(String[] args) {
        equals();
        compare();
    }
}
