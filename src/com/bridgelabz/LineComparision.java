package com.bridgelabz;

import java.util.Scanner;
import java.lang.Math;

public class LineComparision {

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


        double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of line is: " + length1);

        double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length of line is: " + length2);

        if (length1 == length2) {
            System.out.println("Two lines are equal");
        } else {
            System.out.println("Two lines are not equal");
        }

    }

    public static void main(String[] args) {
        equals();
    }
}
