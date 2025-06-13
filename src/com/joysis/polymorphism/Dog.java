/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.polymorphism;


public class Dog extends Animal{

    String breed;
    
    // Constructor Overriding
    public Dog(String name, int ageInMonths, String breed) {
        super(name, ageInMonths);
        this.breed = breed;
    }

    @Override
    public void eat(){
        System.out.println("arf arf");
    }


}
