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
               prog>= 47 && gpa > 3.5;

            }


            private void HospitalAttend(){
                 if (excuse.toLowerCase().contains("hospital")) {
            math+= 1;
            phys += 1;
            chem += 1;
            prog += 1;
        }
            }

        }

public class Task4 {
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
        String excuseMessage = scanner.nextLine();



        System.out.println("Student information :");

        System.out.println("Student Name: " + name);
        System.out.println("Math Attendance: " + math);
        System.out.println("Physics Attendance: " + phys);
        System.out.println("Chemistry Attendance: " + chem);
        System.out.println("Programming Attendance: " + prog);
        System.out.println("GPA: " + gpa);
        Student student  = new Student(name, math, phys, chem, prog, gpa, excuseMessage);
        String status = student.success() ? "Successful" : "Failure";
        System.out.println("Success Status: " + status);






    }
}
