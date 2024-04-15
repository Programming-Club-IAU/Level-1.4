/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github;
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
public class Github {
    private static final String FILE_PATH = "student_info.txt";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        if (!isStudentExists(name)) {
            System.out.println("Student not found. Adding new student...");
            addNewStudent(name, scanner);
        } else {
            System.out.println("Student found. Displaying information...");
            displayStudentInfo(name);
        }

        scanner.close();
    }

    private static boolean isStudentExists(String name) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(name)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static void displayStudentInfo(String name) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(name)) {
                    System.out.println("Student Information:");
                    System.out.println("Name: " + line);
                    System.out.println("Math Attendance: " + reader.readLine().split(": ")[1]);
                    System.out.println("Physics Attendance: " + reader.readLine().split(": ")[1]);
                    System.out.println("Chemistry Attendance: " + reader.readLine().split(": ")[1]);
                    System.out.println("Programming Attendance: " + reader.readLine().split(": ")[1]);
                    double grade = Double.parseDouble(reader.readLine().split(": ")[1]);
                System.out.println("Grade: " + grade);
                
                // Get result from the file or from Student class
                String result = "";
                if (grade >= 3.5) {
                    result = "Success";
                } else {
                    result = "Failure";
                }
                
                System.out.println("Result: " + result);
                return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addNewStudent(String name, Scanner scanner) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH, true))) {
            writer.println(name);
            Student student = new Student(name);
            student.inputAttendance(scanner);
            student.inputGrade(scanner);
            writer.println("Math: " + student.getMathAttendance());
            writer.println("Physics: " + student.getPhysicsAttendance());
            writer.println("Chemistry: " + student.getChemistryAttendance());
            writer.println("Programming: " + student.getProgrammingAttendance());
            writer.println("Grade: " + student.getGrade());
            writer.println(); // Empty line to separate student information
            System.out.println("Student added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}