/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysis.array;

import java.util.Scanner;

public class ActMultiDArray {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("\t Average Calculator");
        System.out.println("===================================");

        System.out.print("Enter number of students: ");
        int studentCount = scanner.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjectCount = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        String[] subjects = new String[subjectCount];
        System.out.println("\nEnter subject names:");
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();
        }

        String[] students = new String[studentCount];
        
        
        
        int[][] grades = new int[studentCount][subjectCount];

        // Input student names and their grades per subject
        for (int i = 0; i < studentCount; i++) {
            System.out.print("\nName of Student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
            System.out.println("Enter grades for each subject:");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print(subjects[j] + ": ");
                grades[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline after grades
        }

        // Displaying Report
        System.out.println("\n");
        System.out.println("======================================================================");
        System.out.println("\t\t\t Grades Report");
        System.out.println("======================================================================");

        // Header row
        System.out.printf("%-20s|", "Student");
        for (String subject : subjects) {
            System.out.printf("%-10s|", subject);
        }
        System.out.printf("%-10s|\n", "Average");
        System.out.println("------------------------------------------------------------------");

        // Student rows
        for (int i = 0; i < studentCount; i++) {
            System.out.printf("%-20s|", students[i]);
            float sum = 0;

            for (int j = 0; j < subjectCount; j++) {
                System.out.printf("%-10d|", grades[i][j]);
                sum += grades[i][j];
            }

            float average = sum / subjectCount;
            System.out.printf("%-10s|\n", average);
        }

        
        scanner.close();
    }
}
