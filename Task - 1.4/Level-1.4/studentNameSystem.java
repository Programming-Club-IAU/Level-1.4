import java.util.Scanner;

public class studentNameSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        int mathAttend = getSubjectAttend(scanner, "Math");
        int physicsAttend = getSubjectAttend(scanner, "Physics");
        int chemistryAttend = getSubjectAttend(scanner, "Chemistry");
        int programmingAttend = getSubjectAttend(scanner, "Programming");

        System.out.print("Enter excuse of absence: ");
        String excuseOfAbsence = scanner.nextLine();

        if (excuseOfAbsence.toLowerCase().contains("hospital")) {
            mathAttend++;
            physicsAttend++;
            chemistryAttend++;
            programmingAttend++;
        }

        System.out.print("Enter grade for the semester (out of 5): ");
        double grade = scanner.nextDouble();

        scanner.close();

        int mathMinimumAttend = 44;
        int physicsMinimumAttend = 42;
        int chemistryMinimumAttend = 40;
        int programmingMinimumAttend = 47;

        boolean pass = (mathAttend >= mathMinimumAttend) &&
                (physicsAttend >= physicsMinimumAttend) &&
                (chemistryAttend >= chemistryMinimumAttend) &&
                (programmingAttend >= programmingMinimumAttend) &&
                (grade >= 3.5);

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + studentName);
        System.out.println("Math Attendance: " + mathAttend + " days");
        System.out.println("Physics Attendance: " + physicsAttend + " days");
        System.out.println("Chemistry Attendance: " + chemistryAttend + " days");
        System.out.println("Programming Attendance: " + programmingAttend + " days");
        System.out.println("Grade: " + grade);

        String result;
        if (pass) {
            result = "Congratulations, you passed!";
        } else {
            result = "Sorry, you failed.";
        }
        System.out.println("\nResult: " + result);
    }

    private static int getSubjectAttend(Scanner scanner, String subject) {
        System.out.print(subject + ": ");
        return scanner.nextInt();
    }
}