/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.intro_oops;

public class ThreeTypesOfVariable {

    String lastName = "Ronquillo"; // instance variable 
    static String middleInitial = "B"; // static variable
    
    public static void main(String[] args) {
        String firstName = "Jareth"; // local variable
        System.out.println(firstName);
        
        System.out.println(middleInitial);
        
        ThreeTypesOfVariable obj = new ThreeTypesOfVariable();
        System.out.println(obj.lastName);
    }
    
    public static void greet(){
        System.out.println(middleInitial);
        
        ThreeTypesOfVariable obj = new ThreeTypesOfVariable();
        System.out.println(obj.lastName);
    }
}
