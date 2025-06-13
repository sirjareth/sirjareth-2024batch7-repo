/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.enumeration;

public class Main {

    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY;
    }

    public static void main(String[] args) {
        Month month = Month.MARCH;

        switch(month){
            case JANUARY:
            case FEBRUARY:
            case MARCH:
                System.out.println("Summer");
                break;
            case APRIL:
                System.out.println("Spring");
                break;
        }
    }
}


/*
    for(Day day : Day.values()){
            System.out.println(day);
        }
*/