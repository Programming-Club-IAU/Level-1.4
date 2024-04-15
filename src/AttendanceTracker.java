import java.util.Scanner;

public class AttendanceTracker {
    public static void trackAttendance(Student student) {
        Scanner scanner = new Scanner(System.in);
        for (Subject subject : student.getSubjects()) {
            System.out.print(subject.getName() + ": ");
            int days = scanner.nextInt();
            subject.markAttendance(days);
        }
    }

    public static void markAttendanceWithExcuse(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter excuse of absence (if any): ");
        String excuse = scanner.nextLine();
        if (excuse != null && excuse.toLowerCase().contains("hospital")) {
            System.out.println("Attendance adjusted for hospital visit.");
            for (Subject subject : student.getSubjects()) {
                subject.markAttendance(1); // Increase one absence for each subject
            }
        } 
        else {
            for (Subject subject : student.getSubjects()) {
                System.out.print(subject.getName() + ": ");
                int days = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                subject.markAttendance(days); // Mark attendance with provided days
            }
        }
    }

    public static String determineResult(Student student) {
        boolean passed = true;
        for (Subject subject : student.getSubjects()) {
            if (!subject.hasMetAttendanceRequirement()) {
                passed = false;
                break;
            }
        }
        double totalGrade = student.getGrade();
        if (passed && totalGrade >= 3.5) {
            return "Success";
        } else if (totalGrade < 3.5) {
            return "Failure: Grade below 3.5";
        } else {
            return "Failure: Attendance requirement not met";
        }
    }
}
