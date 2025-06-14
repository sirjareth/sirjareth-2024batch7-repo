/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author user
 */
public class HashMapSat {
    
    // key value pairs
    // key: id | value: studentName
    
    public static void main(String[] args) {
        HashMap<Integer, String> studentMapping = new HashMap<>();

        studentMapping.put(1, "James Valmeo");
        studentMapping.put(2, "Sarah Jane Quimpo");
        studentMapping.put(3, "Darwin Marticio");
        
        // check if a key exist in the HashMap
        System.out.println(studentMapping.containsKey(3));
        // check if a value exist in the HashMap
        System.out.println(studentMapping.containsValue("Darwin "));
        
        // get value by key
        System.out.println(studentMapping.get(2));
        
        // remove value by key
        studentMapping.remove(1);
        
        // pag kuha ng keys
        Set<Integer> key = studentMapping.keySet();
        System.out.println(key);
        
        // pag kuha ng values
        Collection<String> values = studentMapping.values();
        System.out.println(values);
    }
    
    
    public void newExample(){
        HashMap<String, String> config = new HashMap<>();
        
        
        
        config.put("dburl", "jdbdc:mysql://port:8080:mydatabase");
        config.put("maxUsers", "250");
    }
    
    
    
}
