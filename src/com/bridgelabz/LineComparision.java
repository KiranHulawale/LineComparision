package com.bridgelabz;

import java.util.Scanner;
import java.lang.Math;

public class LineComparision {

    public static void main(String[] args) {

        // welcome to line comparison program.
        double lengthLine = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();

        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculating lenth between co-ordinates.
         lengthLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of line is: " + lengthLine);
    }
}
