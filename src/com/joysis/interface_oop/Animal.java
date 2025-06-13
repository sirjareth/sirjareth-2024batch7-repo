/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.interface_oop;


public interface Animal {
    
    
    
    // STATIC CONSTANT
    // default: public, static, final
    public double PI = 3.14;
    
    
    // ABSTRACT METHODS
    //  default: public, abstract
    public void walk();
    public void eat();
    public void eat(String foods);
    
}


class A implements B, C{

    @Override
    public void jump() {
        System.out.println("Jump 5x");
    }
}

interface B{
    public void jump();
}
interface C{
    public void jump();
}

