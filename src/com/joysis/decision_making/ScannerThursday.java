/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.decision_making;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ScannerThursday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // antibug
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your Address: ");
        String address = scanner.nextLine();
        
        System.out.println("\n\nID: " + id + "\nName: " 
                + name + " \nAddress: " + address);
        
        scanner.close();
        
        
    }
}
