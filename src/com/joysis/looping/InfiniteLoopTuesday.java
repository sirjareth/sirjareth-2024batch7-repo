/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.looping;

import java.util.Scanner;

public class InfiniteLoopTuesday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login System
        String username = "winter";
        String password = "winter123";

        boolean running = true;
        while (running) {
            System.out.print("Enter your username: ");
            String inputtedUsername = scanner.nextLine();
            System.out.print("Enter your password: ");
            String inputtedPassword = scanner.nextLine();

            if (inputtedUsername.equals(username) && inputtedPassword.equals(password)) {
                System.out.println("Logged In Successfully!");
                running = false;
                // System
            } else {
                System.out.println("Invalid Credentials.\n\n");
            }
        }

    }
}


/*
        System.out.println("For Loop");
        for(int i = 0; i < 5; i++){
            System.out.println("Winter");
        }
        
        System.out.println("\nWhile Loop");
        int i = 0;
        while(i < 5){
            System.out.println("Winter");
            i++;
        }
        
        System.out.println("\nDo While Loop");
        int j = 0;
        do{
            System.out.println("Winter");
            j++;
        }while(j < 5);
*/
