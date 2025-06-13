/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.abstraction;

/*
        non-abstract class, concrete class
        abstract class
    */


public abstract class Animal {

    public Animal() {
    }
    
    protected static void walk(String style){
        
    }
    
    //   concrete / non-abstract method
    protected final static void eat(){
        
    }
    
   
    
    // abstract method
    public abstract void walk();
    public abstract void jump();
    
}
