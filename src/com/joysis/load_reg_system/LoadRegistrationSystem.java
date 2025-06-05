/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.load_reg_system;

import com.joysis.decision_making.*;
import java.util.Scanner;

/*
            Load Registration System
        
            1. Text Only
            2. Call Only
            3. Call N Text
            4. Data Only
 */
public class LoadRegistrationSystem {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        promptMessage();
    }

    public static void promptMessage() {
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

        switch (choice) {
            case 1:
                textOnlyPromo();
                break;
            case 2:
                callOnlyPromo();
                break;
            case 3:
                // callNTextPromo();
                break;
            case 4:
                // Data Only
                break;
            case 5:
                exitConfirmation();
            default:
                System.out.println("Invalid Input! Please enter a valid number.");
                promptMessage();
        }
    }

    public static void textOnlyPromo() {
        boolean running = true;
        while (running) {
            System.out.println("\nText Only Promos:");
            System.out.println("    [1] 1 Day, P10");
            System.out.println("    [2] 2 Days, P20");
            System.out.println("    [3] 5 Days, P70");
            System.out.println("    [4] Back");
            System.out.println("    [5] Exit");
            System.out.print("Enter your choice: ");
            int textChoice = scanner.nextInt();
            String promoType = "Unli Text Promo";

            switch (textChoice) {
                case 1:
                    subscribe(1, promoType);
                    break;
                case 2:
                    subscribe(2, promoType);
                    break;
                case 3:
                    subscribe(5, promoType);
                    break;
                case 4:
                    promptMessage();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input!");
                    textOnlyPromo();
                    break;
            }

        }
    }

    public static void callOnlyPromo() {
        boolean running = true;
        while (running) {
            System.out.println("\nCall Only Promos:");
            System.out.println("    [1] 1 Day, P20");
            System.out.println("    [2] 2 Days, P30");
            System.out.println("    [3] 5 Days, P100");
            System.out.print("Enter your choice: ");
            int callChoice = scanner.nextInt();
            String promoType = "Unli Call Promo";
            switch (callChoice) {
                case 1:
                    subscribe(1, promoType);
                    break;
                case 2:
                    subscribe(2, promoType);
                    break;
                case 3:
                    subscribe(5, promoType);
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        }
    }

    public static void subscribe(int days, String promoType) {
        boolean running = true;
        while (running) {
            System.out.println("    [1] Subscribe");
            System.out.println("    [2] Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\nCongratulations! You are "
                        + "now subscribe to " + promoType + " for " + days + " Day(s)!");
                System.exit(0);
            } else {
                exitConfirmation();
            }
        }
    }

    public static void exitConfirmation() {
        while (true) {
            System.out.print("Are you sure that you want to exit? ");
            System.out.println("\nYes/No:");
            scanner.nextLine();
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("*** Thank you! ***");
                System.exit(0);
            } else {
                System.out.println("Go back to main menu...");
                promptMessage();
            }
        }

    }
    
    
}
