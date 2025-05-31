/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.strings;

import java.util.Scanner;


public class StringSaturday {
    public static void main(String[] args) {
        // charAt()
        // length()
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Are you sure that you want to exit? ");
        System.out.println("\nY/N:");
        char answer = scanner.nextLine().charAt(0);
        
        if (answer == 'Y' || answer == 'y') {
            System.out.println("*** Thank you! ***" + answer);
        } else {
            System.out.println("Go back to main menu...");
            // main menu
        }
        
        
        
        
        
        /*
            a. true
            b. false
            c. exception
            d. compilation fails
        */
        
        
        // Loto Generator
        // Bingo Simulator
        // random method
    }
}


/*
    String hero = "Superman";
        String newHero = "Batman";
        
        System.out.println(hero.replace("superman", newHero));


    char[] letter = {'J','a','v','a'};


        System.out.print("Are you sure that you want to exit? ");
        System.out.println("\nYes/No:");
        String answer = scanner.nextLine();
        
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("*** Thank you! ***" + answer);
        } else {
            System.out.println("Go back to main menu...");
            // main menu
        }


        System.out.println("Enter your middle name: ");
        String middleName = sc.nextLine();
        
        
        
        System.out.println("Middle Initial: " + middleName.trim().charAt(0));
        
        
        
        String word = "                                 ";
        
        String newWord = word.trim();
        System.out.println(newWord.isEmpty());


        for (int i = 1; i <= 10; i++) {
            String character = " , ";
            
            if (i != 10) {
                System.out.print(i + character);
            } else {
                System.out.print(i + character.replace(character, " = "));
            }
        }
*/