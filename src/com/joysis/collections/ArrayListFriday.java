/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListFriday {
    

    public static void main(String[] args) {
        // syntax on how to create an arraylist object
        LinkedList<String> firstDice = new LinkedList<>();
        firstDice.add(null);
        firstDice.add("Blue");
        firstDice.add("White");
        firstDice.add("Pink");
        firstDice.add("Red");
        firstDice.addFirst("Yellow");
        firstDice.addLast("Black");
        firstDice.removeFirst();
        firstDice.removeLast();
        firstDice.getFirst();
        firstDice.getLast();
        
        ArrayList<String> secondDice = new ArrayList<>(firstDice);
        
        ArrayList<String> thirdDice = new ArrayList<>(firstDice);
        
        ArrayList<String> colorGame = new ArrayList<>();
        colorGame.addAll(firstDice);
        colorGame.addAll(secondDice);
        colorGame.addAll(thirdDice);
        
        Collections.shuffle(colorGame);
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println(colorGame.get(i));   
        }
        
    }
    
    
}


/*
    //System.out.println(colors.size() - 1);
        System.out.println(colors.get(1));
        System.out.println(colors.indexOf("Black"));
        System.out.println(colors.lastIndexOf("Black"));

// System.out.println(colors.lastIndexOf("Black"));   
        //colors.set(4, "Blue");






                // Traversing an arraylist using for loop
//        for (int i = 0; i < colors.size(); i++) {
//            System.out.println(colors.get(i));
//            if(colors.get(i).equals("White")){
//                break;
//            }
//        }
        
        // Traversing an arraylist using for each loop
        for(String color : colors){
            System.out.println(color);
        }
        
        colors.stream().forEach(color -> System.out.println(color));

        colors.forEach((color) -> System.out.println(color));


        System.out.println("Ascending");
        Collections.sort(colors);
        colors.forEach(System.out::println);
        
        System.out.println("\nDescending");
        Collections.reverse(colors);
        colors.forEach(System.out::println);
*/


