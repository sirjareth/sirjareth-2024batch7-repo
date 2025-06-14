/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @contains method used in loto simulator
 */
public class LotoGeneratorUsingArrayList {
    
    public static void main(String[] args) {
        Set<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();
        
        while(lottoNumbers.size() < 6){
            int randomNumber = random.nextInt(58) + 1;
            // Add the number to the arraylist if it's not already present
            lottoNumbers.add(randomNumber);
        }
        
        System.out.println("Generated Loto Numbers:");
        lottoNumbers.forEach(System.out::println);
        
        
        
    }
}
