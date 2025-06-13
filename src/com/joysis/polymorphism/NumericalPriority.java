/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.polymorphism;


public class NumericalPriority {
    void sum(Integer a, Integer b){
        System.out.println("Integer sum is " + (a + b));
    }
    
    void sum(float a, float b){
        System.out.println("float sum is " + (a+ b));
    } 
    
    void sum(double a, double b){
        System.out.println("double sum is " + (a + b));
    }
    
    public static void main(String[] args) {
        NumericalPriority obj = new NumericalPriority();
        obj.sum(100, 100);
        obj.sum(100.0, 100.0);
        
    }
    
    /*
        a. Integer sum is 200
        b. float sum is 200.0
        c. double sum is 200.0
    */
    
    // int long float double Integer Long Float Double
}


/*
    void x(long a){System.out.println("long"); }
    void x(int a){System.out.println("int");}
    void x(float a){System.out.println("float");}
    void x(double a){System.out.println("double");}
    
    public static void main(String[] args) {
        NumericalPriority n = new NumericalPriority();
        n.x(10.10);
    }
*/