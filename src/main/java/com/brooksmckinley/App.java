/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    static int SQ_FT_PER_GALLON = 350;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length of the room? ");
        int length = scan.nextInt();
        System.out.print("What is the width of the room? ");
        int width = scan.nextInt();

        System.out.println(generatePaintReport(length, width));
    }

    public static String generatePaintReport(int length, int width) {
        int area = length * width;
        int gallons = area / SQ_FT_PER_GALLON;
        // Round up if necessary
        if (area % SQ_FT_PER_GALLON != 0) {
            gallons++;
        }
        return "You will need to purchase " + gallons + " gallons of paint to cover " + area + " square feet.";
    }
}