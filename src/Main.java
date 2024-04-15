import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n\n");
        System.out.println("Attendance Tracker");
        System.out.println("_____________________________");

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        Student student = new Student(studentName);

        System.out.println("\nEnter the attendance for each subject:");
        AttendanceTracker.trackAttendance(student);

        System.out.println("\nMark attendance for each subject (Enter excuse of absence):");
        AttendanceTracker.markAttendanceWithExcuse(student);

 
        System.out.print("\nEnter grade for the semester (out of 5): ");
        double grade = scanner.nextDouble();
        student.setGrade(grade);

        String result = AttendanceTracker.determineResult(student);
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + student.getName());
        for (Subject subject : student.getSubjects()) {
            System.out.println(subject.getName() + " Attendance: " + subject.getAttendance() + " days");
        }
        System.out.println("Grade: " + grade);
        System.out.println("\nResult: " + result);

        // Save student information to file
        FileIOManager.saveStudentInfo(student);
    }
}