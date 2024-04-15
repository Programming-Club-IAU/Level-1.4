/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author SOADAD
 */
public class Student {
    private String name;
    private int mathAttendance;
    private int physicsAttendance;
    private int chemistryAttendance;
    private int programmingAttendance;
    private double grade;
    private String result;

    public Student(String name) {
        this.name = name;
        this.mathAttendance = 0;
        this.physicsAttendance = 0;
        this.chemistryAttendance = 0;
        this.programmingAttendance = 0;
        this.grade = 0.0;
        this.result = "";
    }

    public void inputAttendance(Scanner scanner) {
        System.out.println("Enter the attendance for each subject:");
        System.out.print("Math: ");
        mathAttendance = scanner.nextInt();
        System.out.print("Physics: ");
        physicsAttendance = scanner.nextInt();
        System.out.print("Chemistry: ");
        chemistryAttendance = scanner.nextInt();
        System.out.print("Programming: ");
        programmingAttendance = scanner.nextInt();

        scanner.nextLine(); // Consume newline character
    }

    
    public void inputGrade(Scanner scanner) {
        System.out.print("Enter grade for the semester (out of 5): ");
        grade = scanner.nextDouble();
        
        if (isSuccess()) {
            result = "Success";
        } else {
            result = "Failure";
        }
    }

    public boolean isSuccess() {
        return mathAttendance >= 44 && physicsAttendance >= 42 &&
               chemistryAttendance >= 40 && programmingAttendance >= 47 &&
               grade >= 3.5;
    }
    public int getMathAttendance() {
        return mathAttendance;
    }

    public int getPhysicsAttendance() {
        return physicsAttendance;
    }

    public int getChemistryAttendance() {
        return chemistryAttendance;
    }

    public int getProgrammingAttendance() {
        return programmingAttendance;
    }

    public double getGrade() {
        return grade;
    }
    public String getResult() {
        return result;
    }
}