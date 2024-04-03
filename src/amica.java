import java.util.Scanner;

public class amica {
    public static void main(String[] args) throws Exception {
        Scanner ciao = new Scanner(System.in);
        System.out.println("Welcome to the Attendance and Grade System!");
        System.out.print("Enter your name dear student: ");
        String name = ciao.nextLine();
        System.out.println("Enter the attendance for each subject:");
        //list of variables
        int prog, phys, math, chems;
        double gpa = 0;
        boolean Success = true;

        System.out.print("Math: ");
        math = ciao.nextInt();

        System.out.print("Physics: ");
        phys = ciao.nextInt();

        System.out.print("Chemistry: ");
        chems = ciao.nextInt();

        System.out.print("Programming: ");
        prog = ciao.nextInt();

        if (math < 44 || phys < 42 || chems < 40 || prog < 47) {
            System.out.print("Enter excuse of absence: ");
            String forSpace = ciao.nextLine();
            String excuse = ciao.nextLine();
            int index = excuse.indexOf("hospital");
            if (index != -1) {
                math++;prog++;chems++;phys++;
                if(math < 44 || phys < 42 || chems < 40 || prog < 47){
                    Success = false;
                }
            }
            else{
                Success = false;
            }
        }

        System.out.print("Enter your GPA: ");
        gpa = ciao.nextDouble();
        if(gpa<=3.5){
            Success = false;
        }
        
        System.out.println("Student information:\nName"+name+
                           "Math Attendance: "+math+" days\n" +
                           "Physics Attendance: "+phys+" days\n" + 
                           "Chemistry Attendance: "+chems+" days\n" + 
                           "Programming Attendance: "+prog+" days" + 
                           "Grade: "+gpa);
        if(Success){
            System.out.println("Result: Congrats! you've success");
        }
        else{
            System.out.println("Result: Oops. you failed");
        }
    }
}
