import java.util.Scanner;

         class Student {
            String name;
            int math;
            int phys;
            int chem;
            int prog;
            double gpa;
            String excuse;

            public Student(String name, int math, int phys, int chem, int prog, double gpa, String excuse) {
                    this.name = name;
                    this.math = math;
                    this.phys = phys;
                    this.chem = chem;
                    this.prog = prog;
                    this.gpa = gpa;
                    this.excuse = excuse;
                  
            }


            public boolean success(){
                return math >= 44 && phys >= 42 && chem >= 40 &&
               prog>= 47 && gpa >= 3.5;

            }


            public void HospitalAttend(){
                 if (this.excuse.toLowerCase().contains("hospital")) {
            this.math += 1;
            this.phys += 1;
            this.chem += 1;
            this.prog += 1;
        }
            }

        }

public class Test {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);





      


        System.out.println("Enter student's name:");
        String name = scanner.nextLine();

        System.out.println("Enter attendance for Math:");
        int math = scanner.nextInt();

        System.out.println("Enter attendance for Physics:");
        int phys = scanner.nextInt();

        System.out.println("Enter attendance for Chemistry:");
        int chem = scanner.nextInt();

        System.out.println("Enter attendance for Programming:");
        int prog = scanner.nextInt();

        System.out.println("Enter GPA:");
        double gpa = scanner.nextDouble();
        scanner.nextLine();  

        System.out.println("Enter any excuse message:");
        String excuse = scanner.nextLine();



        System.out.println("Student information :");
        Student student  = new Student(name, math, phys, chem, prog, gpa, excuse);
        student.HospitalAttend();

        System.out.println("Student Name: " + student.name);
        System.out.println("Math Attendance: " + student.math);
        System.out.println("Physics Attendance: " + student.phys);
        System.out.println("Chemistry Attendance: " + student.chem);
        System.out.println("Programming Attendance: " + student.prog);
        System.out.println("GPA: " + gpa);
        String status = student.success() ? "Successful" : "Failure";
 
        System.out.println("Success Status: " + status);






    }
}


   
