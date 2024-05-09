import java.util.Scanner;

public class attendancegradessystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the attendance for each subject (Example: 45) :");
        int mathAttendance = inputAttendance("Math", scanner);
        int physicsAttendance = inputAttendance("Physics", scanner);
        int chemistryAttendance = inputAttendance("Chemistry", scanner);
        int programmingAttendance = inputAttendance("Programming", scanner);

        System.out.print("Mark attendance for each subject (Enter excuse of absence): ");
        String excuse = scanner.nextLine();
        if (excuse.toLowerCase().contains("hospital")) {
            mathAttendance++;
            physicsAttendance++;
            chemistryAttendance++;
            programmingAttendance++;
        }

        System.out.print("Enter gpa for the semester (out of 5): ");
        double grade = Double.parseDouble(scanner.nextLine());

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Math Attendance: " + mathAttendance + " days");
        System.out.println("Physics Attendance: " + physicsAttendance + " days");
        System.out.println("Chemistry Attendance: " + chemistryAttendance + " days");
        System.out.println("Programming Attendance: " + programmingAttendance + " days");
        System.out.println("Grade: " + grade);


        String result = determineResult(mathAttendance, physicsAttendance, chemistryAttendance, programmingAttendance, grade);
        System.out.println("\nResult: " + result);
    }

    private static int inputAttendance(String subject, Scanner scanner) {
        System.out.print(subject + ": ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static String determineResult(int math, int physics, int chem, int prog, double grade) {
        if (math >= 44 && physics >= 42 && chem >= 40 && prog >= 47 && grade > 3.5) {
            return "Success";
        } else {
            return "Failure";
        }
    }
}
