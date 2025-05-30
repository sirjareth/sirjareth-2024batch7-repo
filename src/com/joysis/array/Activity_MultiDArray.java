/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.array;

import java.util.Scanner;

public class Activity_MultiDArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("\t Average Calculator");
        System.out.println("===================================");

        System.out.print("Enter number of students: ");
        int studentCount = scanner.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjectCount = scanner.nextInt();

        scanner.nextLine();

        String[] students = new String[studentCount];
        int[][] grades = new int[studentCount][subjectCount];

        // traversing array     
        for (int i = 0; i < studentCount; i++) {
            System.out.print("\nName of Student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
            System.out.println("Enter grades: ");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print((j + 1) + ".");
                grades[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }

        // displaying and computing the average
        System.out.println("\n");
        System.out.println("======================================================================");
        System.out.println("\t Grades Report");
        System.out.println("======================================================================");

        for (int i = 0; i < studentCount; i++) {
            System.out.print(students[i] + ": ");
            float sum = 0;

            for (int j = 0; j < subjectCount; j++) {
                if (j < subjectCount - 1) {
                    System.out.print(grades[i][j] + ", ");
                } else {
                    System.out.print(grades[i][j]);
                }
                sum += grades[i][j];
            }
            float average = sum / subjectCount;
            System.out.println("\nAverage: " + average);
            System.out.println("---------------------------------");
        }

        scanner.close();
    }
}
