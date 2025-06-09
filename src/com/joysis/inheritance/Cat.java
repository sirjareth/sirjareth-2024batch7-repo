/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.inheritance;

// DRY -> Don't Repeat Yourself Principle
public class Cat extends Animal{
    
    public void run(){
        
    }

    @Override
    public void eat() {
        System.out.println("meow meow...");
    }

    @Override
    public void jump() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Polymorphism -> method oveloading, method overriding
}
