/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.collections;

import java.util.HashSet;
import java.util.Set;


public class HashSetSat {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(50);
        numbers.add(40);
        numbers.add(30);
        numbers.add(50);
        numbers.add(null);
        numbers.forEach(System.out::println);
    }
    
    
    
    
    
    
}
