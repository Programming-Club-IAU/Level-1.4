import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        System.out.print("Please enter your name: ");
        Scanner input = new Scanner(System.in);
            String name = input.nextLine();

        System.out.println("Enter your attendance for all subjects.");

        System.out.print("Math :");
            int math = input.nextInt();

        System.out.print("Physics :");
            int physics = input.nextInt();

        System.out.print("Chemistry :");
            int chemistry = input.nextInt();

        System.out.print("Programming :");
            int programming = input.nextInt();

            input.nextLine();

        System.out.print("Enter an excuse of absence : ");
            String absenceExcuse= input.nextLine();

        System.out.print("enter your (GPA out of 5) ");
            Double gpa= input.nextDouble();

        if(absenceExcuse.contains("hospital")){
            math++;
            physics++;
            chemistry++;
            programming++;
        }
        if (math < 44 || physics < 42 || chemistry < 40 || programming <47 || gpa < 3.5) {
            System.out.println("Failed.");
        }
        else{
        System.out.println("student name: "+name);
        System.out.println("math Attendance: "+math);
        System.out.println("physics Attendance: "+physics);
        System.out.println("chemistry Attendance: "+chemistry);
        System.out.println("Programming Attendance: "+programming);
        System.out.println("GPA: "+gpa+"\n");
        System.out.println(" ****** Succeeded ******");
        }
    }
}
