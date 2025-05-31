/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.decision_making;

import java.util.Scanner;

/*
            Load Registration System
        
            1. Text Only
            2. Call Only
            3. Call N Text
            4. Data Only
 */
public class LoadRegistrationSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("=============================");
            System.out.println("  Load Registration System  ");
            System.out.println("=============================");

            System.out.println("    [1] Text Only");
            System.out.println("    [2] Call Only");
            System.out.println("    [3] Call N Text"); // switch statement
            System.out.println("    [4] Data Only");
            System.out.println("    [5] Exit");
            System.out.print("Select your choice: ");
            int choice = scanner.nextInt();

            // nested if statement
            if (choice == 1) {
                System.out.println("\nText Only Promos:");
                System.out.println("    [1] 1 Day, P10");
                System.out.println("    [2] 2 Days, P20");
                System.out.println("    [3] 5 Days, P70");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("    [1] Subscribe");
                    System.out.println("    [2] Exit");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();

                    if (choice == 1) {
                        System.out.println("\nCongratulations! You are "
                                + "now subscribe to Unli Text for 1 Day!");
                    } else {
                        System.out.print("Are you sure that you want to exit? ");
                        System.out.println("\nYes/No:");
                        String answer = scanner.nextLine();

                        if (answer.equalsIgnoreCase("yes")) {
                            System.out.println("*** Thank you! ***");
                            running = false;
                        } else {
                            System.out.println("Go back to main menu...");
                            // main menu
                        }

                        
                    }
                } else if (choice == 2) {
                    System.out.println("    [1] Subscribe");
                    System.out.println("    [2] Exit");
                    if (choice == 1) {
                        System.out.println("\nCongratulations! You are "
                                + "now subscribe to Unli Text for 1 Day!");
                    } else {
                        System.out.print("Are you sure that you want to exit? ");
                        System.out.println("\nYes/No:");
                        String answer = scanner.nextLine();

                        if (answer.equalsIgnoreCase("yes")) {
                            System.out.println("*** Thank you! ***");
                            running = false;
                        } else {
                            System.out.println("Go back to main menu...");
                            // main menu
                        }

                        running = false;
                    }
                } else if (choice == 3) {
                    System.out.println("    [1] Subscribe");
                    System.out.println("    [2] Exit");
                    if (choice == 1) {
                        System.out.println("\nCongratulations! You are "
                                + "now subscribe to Unli Text for 1 Day!");
                    } else {
                        System.out.print("Are you sure that you want to exit? ");
                        System.out.println("\nYes/No:");
                        String answer = scanner.nextLine();

                        if (answer.equalsIgnoreCase("yes")) {
                            System.out.println("*** Thank you! ***");
                            running = false;
                        } else {
                            System.out.println("Go back to main menu...");
                            // main menu
                        }
                        running = false;
                    }
                }
            } else if (choice == 2) {
                System.out.println("\nCall Only Promos:");
                System.out.println("    [1] 1 Day, P20");
                System.out.println("    [2] 2 Days, P30");
                System.out.println("    [3] 5 Days, P100");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("    [1] Subscribe");
                        System.out.println("    [2] Exit");
                        System.out.print("Enter your choice: ");
                        int subscribeChoice = scanner.nextInt();

                        switch (subscribeChoice) {
                            case 1:
                                System.out.println("\nCongratulations! You are "
                                        + "now subscribe to Unli Text for 1 Day!");
                                break;
                            case 2:
                                System.out.println("** Thank you! **");
                                running = false;
                                break;
                            default:
                                System.out.println("Invalid Input!");
                        }
                }
            }
        }

    }
}
