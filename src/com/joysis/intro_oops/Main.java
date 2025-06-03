/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.intro_oops;


public class Main {
    
    public static void main(String[] args) {
        // Class Instatiation
        // Classname object = new Classname();
        Keyboard kb1 = new Keyboard();
        kb1.brand = "Reddragon";
        kb1.color = "Blue";
        kb1.noOfKeys = 50;
        System.out.println(kb1.brand);
        kb1.toCommunicate();
        kb1.toTypeMessage();
        
        Keyboard kb2 = new Keyboard();
        kb2.color = "Razor";
        kb1.color = "White";

        
        Keyboard kb3 = new Keyboard();
        kb3.brand = "Logitech";
        kb3.toCommunicate();
        
    }
}
