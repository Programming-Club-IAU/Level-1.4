import java.util.Scanner;

public class AttendanceGradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Constants for minimum attendance days
        final int MATH_MIN_ATTENDANCE = 44;
        final int PHYSICS_MIN_ATTENDANCE = 42;
        final int CHEMISTRY_MIN_ATTENDANCE = 40;
        final int PROGRAMMING_MIN_ATTENDANCE = 47;
        // Prompt user to input student name
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        // Prompt user to input attendance for each subject
        System.out.println("Enter the attendance for each subject:");
        System.out.print("Math: ");
        int mathAttendance = scanner.nextInt();
        System.out.print("Physics: ");
        int physicsAttendance = scanner.nextInt();
        System.out.print("Chemistry: ");
        int chemistryAttendance = scanner.nextInt();
        System.out.print("Programming: ");
        int programmingAttendance = scanner.nextInt();
        // Prompt user to input excuse of absence
        System.out.println("Mark attendance for each subject (Enter excuse of absence):");
        String excuse = scanner.nextLine(); // Clear buffer
        excuse = scanner.nextLine(); // Read input
        if (excuse.toLowerCase().contains("hospital")) {
            mathAttendance++;
            physicsAttendance++;
            chemistryAttendance++;
            programmingAttendance++;
        }
        // Prompt user to input grade for the semester
        System.out.println("Enter grade for the semester (out of 5):");
        double semesterGrade = scanner.nextDouble();
        // Determine if attendance meets minimum requirements
        boolean mathPass = mathAttendance >= MATH_MIN_ATTENDANCE;
        boolean physicsPass = physicsAttendance >= PHYSICS_MIN_ATTENDANCE;
        boolean chemistryPass = chemistryAttendance >= CHEMISTRY_MIN_ATTENDANCE;
        boolean programmingPass = programmingAttendance >= PROGRAMMING_MIN_ATTENDANCE;
        // Output student information
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + studentName);
        System.out.println("Math Attendance: " + mathAttendance + " days");
        System.out.println("Physics Attendance: " + physicsAttendance + " days");
        System.out.println("Chemistry Attendance: " + chemistryAttendance + " days");
        System.out.println("Programming Attendance: " + programmingAttendance + " days");
        System.out.println("Grade: " + semesterGrade + "\n");
        // Determine if the student passes or fails
        if (mathPass && physicsPass && chemistryPass && programmingPass && semesterGrade > 3.5) {
            System.out.println("Result: Success");
        } else {
            System.out.println("Result: Failure");
        }
        scanner.close();
    }
}