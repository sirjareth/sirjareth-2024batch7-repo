/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.collections;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        
        
        Employee e2 = new Employee(2, "Junelvin Saceda", 30, 70000);
        Employee e3 = new Employee(3, "Genesis  Quidasol", 20, 0000);
        
        employees.add(new Employee(1, "James Valmeo", 50, 80000));
        employees.add(new Employee(2, "Junelvin Saceda", 30, 70000));
        employees.add(new Employee(3, "Genesis  Quidasol", 20, 0000));
        
        
        
        employees.forEach(System.out::println);
    }
}
