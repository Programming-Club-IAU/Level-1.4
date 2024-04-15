import java.util.Scanner;

public class Task4 {
    private String name;
    private int mathAttendance;
    private int physAttendance;
    private int chemAttendance;
    private int progAttendance;
    private double gpa;
    private String excuseMessage;

    // Constructor to initialize the student data
    public Task4(String name, int mathAttendance, int physAttendance, int chemAttendance, int progAttendance, double gpa, String excuseMessage) {
        this.name = name;
        this.mathAttendance = mathAttendance;
        this.physAttendance = physAttendance;
        this.chemAttendance = chemAttendance;
        this.progAttendance = progAttendance;
        this.gpa = gpa;
        this.excuseMessage = excuseMessage;
        adjustAttendanceForHospital();
    }

    // Adjust attendance if the excuse contains "hospital"
    private void adjustAttendanceForHospital() {
        if (this.excuseMessage.toLowerCase().contains("hospital")) {
            this.mathAttendance += 1;
            this.physAttendance += 1;
            this.chemAttendance += 1;
            this.progAttendance += 1;
        }
    }

    // Check if the student meets the success criteria
    public boolean isSuccess() {
        return this.mathAttendance >= 44 && this.physAttendance >= 42 && this.chemAttendance >= 40 &&
               this.progAttendance >= 47 && this.gpa >= 3.5;
    }

    // Print student information
    public void printStudentInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Math Attendance: " + this.mathAttendance);
        System.out.println("Physics Attendance: " + this.physAttendance);
        System.out.println("Chemistry Attendance: " + this.chemAttendance);
        System.out.println("Programming Attendance: " + this.progAttendance);
        System.out.println("GPA: " + this.gpa);
        System.out.println("Success Status: " + (isSuccess() ? "Successful" : "Unsuccessful"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's name:");
        String name = scanner.nextLine();

        System.out.println("Enter attendance for Math:");
        int mathAttendance = scanner.nextInt();

        System.out.println("Enter attendance for Physics:");
        int physAttendance = scanner.nextInt();

        System.out.println("Enter attendance for Chemistry:");
        int chemAttendance = scanner.nextInt();

        System.out.println("Enter attendance for Programming:");
        int progAttendance = scanner.nextInt();

        System.out.println("Enter GPA:");
        double gpa = scanner.nextDouble();
        scanner.nextLine();  

        System.out.println("Enter any excuse message:");
        String excuseMessage = scanner.nextLine();
        


        System.out.println("Student information :");

       
        Student student = new Student(name, mathAttendance, physAttendance, chemAttendance, progAttendance, gpa, excuseMessage);

        
        student.printStudentInfo();

        scanner.close();
    }
}
