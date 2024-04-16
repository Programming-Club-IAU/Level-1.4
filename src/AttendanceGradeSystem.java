
package attendancegradesystem;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AttendanceGradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student name
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        // Get attendance for each subject
        System.out.println("Enter the attendance for each subject:");
        int mathAttendance = getSubjectAttendance("Math", scanner);
        int physicsAttendance = getSubjectAttendance("Physics", scanner);
        int chemistryAttendance = getSubjectAttendance("Chemistry", scanner);
        int programmingAttendance = getSubjectAttendance("Programming", scanner);

        // Get grade for the semester
        System.out.print("Enter grade for the semester (out of 5): ");
        double grade = scanner.nextDouble();

        // Check for excuses of absence
        System.out.print("Enter excuse of absence: ");
        scanner.nextLine(); // Consume newline
        String excuse = scanner.nextLine();
        if (excuse.toLowerCase().contains("hospital")) {
            mathAttendance++;
            physicsAttendance++;
            chemistryAttendance++;
            programmingAttendance++;
        }

        // Calculate total attendance
        int totalDays = 50;
        double mathAttendancePercentage = (double) mathAttendance / totalDays * 100;
        double physicsAttendancePercentage = (double) physicsAttendance / totalDays * 100;
        double chemistryAttendancePercentage = (double) chemistryAttendance / totalDays * 100;
        double programmingAttendancePercentage = (double) programmingAttendance / totalDays * 100;

        // Determine if the student passes or fails
        boolean pass = mathAttendance >= 44 && physicsAttendance >= 42 &&
                chemistryAttendance >= 40 && programmingAttendance >= 47 && grade >= 3.5;

        // Display student information
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + studentName);
        System.out.println("Math Attendance: " + mathAttendance + " days (" + mathAttendancePercentage + "%)");
        System.out.println("Physics Attendance: " + physicsAttendance + " days (" + physicsAttendancePercentage + "%)");
        System.out.println("Chemistry Attendance: " + chemistryAttendance + " days (" + chemistryAttendancePercentage + "%)");
        System.out.println("Programming Attendance: " + programmingAttendance + " days (" + programmingAttendancePercentage + "%)");
        System.out.println("Grade: " + grade);

        // Display result
        if (pass) {
            System.out.println("\nResult: Success");
        } else {
            System.out.println("\nResult: Failure");
        }

        // Save student information to a file
        saveToFile(studentName, mathAttendance, physicsAttendance, chemistryAttendance, programmingAttendance, grade, pass);

        scanner.close();
    }

    private static int getSubjectAttendance(String subject, Scanner scanner) {
        System.out.print(subject + ": ");
        return scanner.nextInt();
    }

    private static void saveToFile(String studentName, int mathAttendance, int physicsAttendance, int chemistryAttendance, int programmingAttendance, double grade, boolean pass) {
        try {
            FileWriter writer = new FileWriter("student_information.txt", true);
            writer.write("Name: " + studentName + "\n");
            writer.write("Math Attendance: " + mathAttendance + " days\n");
            writer.write("Physics Attendance: " + physicsAttendance + " days\n");
            writer.write("Chemistry Attendance: " + chemistryAttendance + " days\n");
            writer.write("Programming Attendance: " + programmingAttendance + " days\n");
            writer.write("Grade: " + grade + "\n");
            writer.write("Result: " + (pass ? "Success" : "Failure") + "\n\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    
    
    
    
    
    //ASCII Art 
     System.out.println("                ________________________________________________");
        System.out.println("            /                                                \\");
        System.out.println("           |    _________________________________________     |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |  C:\\> _ TASK 4                         |    |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |            Sponsored by:                |    |");  
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |               Programming               |    |");
        System.out.println("           |   |                  Club                   |    |");
        System.out.println("           |   |               Development               |    |");
        System.out.println("           |   |                   Unit                  |    |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |_________________________________________|    |");
        System.out.println("           |                                                  |");
        System.out.println("           \\_________________________________________________/");
        System.out.println("                   \\___________________________________/");
        System.out.println("                ___________________________________________");
        System.out.println("             _-' .-. .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.  --- `-_");
        System.out.println("          _-'.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.  .-.-.`-_");
        System.out.println("       _-'.-.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-`__`. .-.-.-.`-_");
        System.out.println("    _-'.-.-.-.-. .-----.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-----. .-.-.-.-.`-_");
        System.out.println(" _-'.-.-.-.-.-. .---.-. .-------------------------. .-.---. .---.-.-.-.`-_");
        System.out.println(":-------------------------------------------------------------------------:");
        System.out.println("`---._.-------------------------------------------------------------._.---'");
    
    }
}
