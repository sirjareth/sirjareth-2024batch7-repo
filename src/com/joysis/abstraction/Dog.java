/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.abstraction;

/**
 *
 * @author user
 */
public class Dog extends Animal{

    @Override
    public void walk() {
        System.out.println("munch munch");
    }
    
    
    @Override
    public void jump(){
        System.out.println("Jump 10x");
    }
    
}
