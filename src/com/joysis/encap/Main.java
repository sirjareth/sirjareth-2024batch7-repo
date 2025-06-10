/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.encap;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        User user1 = new User();
        
        User user2 = new User(1, "winter", "winter123", "winter summer");
        User user3 = new User("summer", "summer123");
//        
//        System.out.println("* Account Registration Form *");
//        System.out.print("Enter username: ");
//        String username = sc.nextLine();
//        user.setName(username);
//        
//        System.out.print("Enter password: ");
//        String password = sc.nextLine();
//        user.setPassword(password);
//        
//        System.out.print("Enter full name: ");
//        String fullName = sc.nextLine();
//        user.setFullName(password);
//        
//        System.out.print("Enter address: ");
//        String address = sc.nextLine();
//        user.setAddress(password);
//        
//        System.out.print("Enter course: ");
//        String course = sc.nextLine();
//        user.setCourse(password);
    }
}
