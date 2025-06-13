/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.polymorphism;


public class Cat extends Animal{

    String color;   
    
    
    public Cat(String name, int ageInMonths, String color) {
        super(name, ageInMonths);
        this.color = color;
    }

   
    

    public static void main(String[] args) {
        
    }
    
    
    
   
    @Override
    public void eat(){
        System.out.println("meow meow");
    }
    
    
    
    
    
    // public - protected - default  
    
//    @Override
//    public void eat(String food){
//    
//    }
    
    
    
    
}
