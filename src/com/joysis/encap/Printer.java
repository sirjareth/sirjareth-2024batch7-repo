/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.encap;


public class Printer {
    
    public static void main(String[] args) {

        User user1 = new User(1, "winter", "winter123", "winter eyeleo", "malabon");
//        User user2 = new User(2, "summer", "summer", "summer eyeleo", "quezon");
//        User user3 = new User(3, "fall", "fall", "fall eyeleo", "rizal");
        User user4 = new User();
        
        System.out.println(user1.getUsername());
//        System.out.println(user2.getUsername());
//        System.out.println(user3.getUsername());
        
        System.out.println(user1.getCompanyName());
    }
   
}
