/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        // variable declaration
        String name;

        // prompt input, and scan in
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        name = input.next();

        //concatenate string
        String output = "Hello, " + name + ", nice to meet you!";

        // print output
        System.out.println(output);

    }
}
