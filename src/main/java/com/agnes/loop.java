package com.agnes;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        /* learning how to get comfortable with if statements
         create a weight convention program. that converts weights from lbs to kgs and kgs to lbs.
        */

        // import scanner to get user input.

        Scanner scanner = new Scanner(System.in);
        // declare my variables.

        double weight;
        double newWeight;
        int choice;
        // create a welcome message
        System.out.println("Welcome to my weight convention App");

        //prompt for user input or choice.
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.println("Choose an option:");
        choice = scanner.nextInt();
        // option to convert lbs to kgs.
        if (choice == 1) {
            System.out.println("enter the weight in lbs");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("the new weight in kgs is " + newWeight);
            // option to convert kgs to lbs

        } else if (choice == 2) {
            System.out.println("enter the weight in kgs");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("The new weight in lbs is " + newWeight);
            //inform the user it was an invalid choice.
        }else{
            System.out.println("That was not a valid choice");
            scanner.close();
        }
    }
}
