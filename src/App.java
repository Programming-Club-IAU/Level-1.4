import java.util.Scanner;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) {
        //importing the class
        Scanner input=new Scanner(System.in);
        Student info = new Student();
        
        //the friendly user interface with the inputs with checking every input with the proper cheacker and inporting every infomation to the class "Student"
        System.out.print("==========================================\n Welcome to The Attendence and Grading System \n Enter The Student name: ");
        String name=input.nextLine();
        info.nameChecker(name);
        info.name=name;

        System.out.print("Enter The Attendence for Each of These Subjects IN ORDER (Math, Physics, Chemistry, Programming)\n>");
        int math=input.nextInt();
        info.mathChecker(math);
        info.AttMath=math;

        System.out.print(">");
        int physics=input.nextInt();
        info.physChecker(physics);
        info.AttPhysics=physics;

        System.out.print(">");
        int chemistry=input.nextInt();
        info.chemChecker(chemistry);
        info.AttChemistry=chemistry;

        System.out.print(">");
        int programming=input.nextInt();
        info.progChecker(programming);
        info.AttProgramming=programming;

        System.out.print("Mark attendance for each subject (enter excuse fo absence): ");
        String excusse=input.nextLine();
        info.excChecker(excusse);
        info.excuse=excusse;

        System.out.print("Enter grade for the semester (out of 5): ");
        double grade=input.nextDouble();
        info.gradeChecker(grade);
        info.grade=grade;
        
        //Checking if the Student pass or not and display it infomation
        info.pas(grade);
        info.display();

    }
}
