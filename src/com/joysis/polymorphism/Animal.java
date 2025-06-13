/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.polymorphism;


public class Animal {
    
    public String name;
    public int ageInMonths;
    
    
    public Animal(String name, int ageInMonths) {
        this.name = name;
        this.ageInMonths = ageInMonths;
    }
    
    
    public final static double PI = 3.14;
    
    public void eat(){}
    
    // bawal i override: private, final, static
    // non-access modifiers: abstract, static, final 
    
    
}
