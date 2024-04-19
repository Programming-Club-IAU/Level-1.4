import java.util.Scanner;

public class Main {

    public static final int MATH_MIN_ATTENDANCE = 44;
    public static final int PHYSICS_MIN_ATTENDANCE = 42;
    public static final int CHEMISTRY_MIN_ATTENDANCE = 40;
    public static final int PROGRAMMING_MIN_ATTENDANCE = 47;
    public static final int REQUIRED_TOTAL_ATTENDANCE = 173; // Total minimum attendance across all subjects

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Attendance variables
        int mathAttendance, physicsAttendance, chemistryAttendance, programmingAttendance;

        // Get attendance for each subject
        System.out.println("Enter Attendance (out of 50):");
        mathAttendance = getAttendance(scanner, "Math");
        physicsAttendance = getAttendance(scanner, "Physics");
        chemistryAttendance = getAttendance(scanner, "Chemistry");
        programmingAttendance = getAttendance(scanner, "Programming");

        // Get grades for each subject
        System.out.println("\nEnter Grades (out of 5):");
        double mathGrade = getGrade(scanner, "Math");
        double physicsGrade = getGrade(scanner, "Physics");
        double chemistryGrade = getGrade(scanner, "Chemistry");
        double programmingGrade = getGrade(scanner, "Programming");

        // Calculate total attendance
        int totalAttendance = mathAttendance + physicsAttendance + chemistryAttendance + programmingAttendance;

        // Evaluate attendance and grades
        boolean passedAttendance = true;
        if (mathAttendance < MATH_MIN_ATTENDANCE) {
            System.out.println("Failed minimum attendance requirement for Math!");
            passedAttendance = false;
        }
        if (physicsAttendance < PHYSICS_MIN_ATTENDANCE) {
            System.out.println("Failed minimum attendance requirement for Physics!");
            passedAttendance = false;
        }
        if (chemistryAttendance < CHEMISTRY_MIN_ATTENDANCE) {
            System.out.println("Failed minimum attendance requirement for Chemistry!");
            passedAttendance = false;
        }
        if (programmingAttendance < PROGRAMMING_MIN_ATTENDANCE) {
            System.out.println("Failed minimum attendance requirement for Programming!");
            passedAttendance = false;
        }

        double averageGrade = (mathGrade + physicsGrade + chemistryGrade + programmingGrade) / 4.0;
        System.out.printf("\nAverage Grade: %.2f\n", averageGrade);

        boolean passedOverall = passedAttendance && averageGrade >= 3.5;
        if (passedOverall) {
            System.out.println("Student Passed!");
        } else {
            System.out.println("Student Failed!");
        }
    }

    public static int getAttendance(Scanner scanner, String subject) {
        System.out.printf("Enter attendance for %s: ", subject);
        int attendance = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter excuse (leave blank if none): ");
        String excuse = scanner.nextLine();
        if (excuse.toLowerCase().contains("hospital")) {
            System.out.println("Hospital visit recorded, increasing absences for all subjects.");
            attendance--; // Decrease attendance for all subjects
        }

        return attendance;
    }

    public static double getGrade(Scanner scanner, String subject) {
        System.out.printf("Enter grade for %s (out of 5): ", subject);
        double grade = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        return grade;
    }
}
