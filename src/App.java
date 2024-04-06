import java.util.Scanner;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) {
        //importing the class
        Scanner input=new Scanner(System.in);
        Student info = new Student();
        
        //the friendly user interface with the inputs with checking every input with the proper cheacker
        System.out.print("==========================================\n Welcome to The Attendence and Grading System \n Enter The Student name: ");
        String name=input.nextLine();
        System.out.print("Enter The Attendence for Each of These Subjects IN ORDER (Math, Physics, Chemistry, Programming)\n>");
        int math=input.nextInt();
        info.mathChecker(math);
        System.out.print(">");
        int physics=input.nextInt();
        System.out.print(">");
        int chemistry=input.nextInt();
        System.out.print(">");
        int programming=input.nextInt();
        System.out.println("Mark attendance for each subject (enter excuse fo absence)");
        String excuse=input.nextLine();
        
        System.out.print("Enter grade for the semester (out of 5): ");
        double grade=input.nextDouble();
        info.gradeChecker(grade);

        //re-enter the values to the student class (after checking with the method attcheacker)
        info.name=name;
        info.AttMath=math;
        info.AttPhysics=physics;
        info.AttChemistry=chemistry;
        info.AttProgramming=programming;
        info.grade=grade;
        info.pas(grade);
        info.display();

    }
}
