/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.activities;


public class Activity8_Ronquillo {
    
    public static void main(String[] args) {
        String country = "Philippines";
        String vowels = "aeiou";
        
        System.out.println(country.charAt(0));
        System.out.println(country.charAt(country.length() -1));
        
        int counter = 0;
        for (int i = 0; i < country.length(); i++) {
            if (country.toLowerCase().charAt(i) == 'p') {
                counter++;
            }
        }
        System.out.println(counter);
        
        int count = 0;
        for (int i = 0; i < country.length(); i++) { // country
            for (int j = 0; j < vowels.length(); j++) { // vowels
                //                 1  ==  2
                if (country.charAt(i) == vowels.charAt(j)) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
        
    }
}
