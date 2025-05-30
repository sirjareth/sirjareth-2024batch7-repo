/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.decision_making;

public class IfElseStatement {

    public static void main(String[] args) {

        // voters age classification
        /* age
            14 below -> Not yet a voter
            15 - 17 -> School Election
            18 - 25 -> SK Election
            26 - 30 -> National Election
            31 and above -> International Election
         */
        byte age = 0;
        String result;

        // valid age -> 1 - 100
        if (age >= 1 && age <= 100) { // outer if
            if (age >= 31) { // inner if
                result = "International Election";
            } else if (age >= 26) {
                result = "National Election";
            } else if (age >= 18) {
                result = "SK Election";
            } else if (age >= 15) {
                result = "School Election";
            } else {
                result = "Not yet a voter";
            }
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid Age. Age must be greater than 0.");
        }

        
        // Validation
        // switch statements
        // looping
        
        
        
//        if (age <= 14) {
//            System.out.println("Not yet a voter");
//        } else if (age <= 17) { //15 - 17 
//            System.out.println("School Election");
//        } else if (age <= 25) {
//            System.out.println("SK Election");
//        } else if (age <= 30) {
//            System.out.println("National Election");
//        } else if (age <= 100){
//            System.out.println("International Election");
//        }
        //You can vote to  You can vote to International Election
        // program that will check if the number is odd or even
        // Odd or Even
        //String isEven = number % 2 == 0 ? "Even" : "Odd";
    }

}

/*
           int number = 510;

        // Simple-if > If-Else Statement
//        if(number % 2 == 0){
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
        
        float temp = 37.0f;
        
        if(temp >= 37.5){
            System.out.println("Fever"); 
            System.out.println("Hello");
            System.out.println("Java");
        } else {
            System.out.println("Normal Temp");
        }
 */
