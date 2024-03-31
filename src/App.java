import java.util.Scanner;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) {
        //importing the class
        Scanner input=new Scanner(System.in);
        Student info = new Student();
        
        //the friendly user interface with the inputs
        System.out.print("==========================================\n Welcome to The Attendence and Grading System \n Enter The Student name: ");
        String name=input.nextLine();
        System.out.print("Enter The Attendence for Each of These Subjects IN ORDER (Math, Physics, Chemistry, Programming)\n>");
        int math=input.nextInt();
        System.out.print(">");
        int physics=input.nextInt();
        System.out.print(">");
        int chemistry=input.nextInt();
        System.out.print(">");
        int programming=input.nextInt();
        //System.out.println("Mark attendance for each subject (enter excuse fo absence)");
        System.out.print("Enter grade for the semester (out of 5): ");
        double grade=input.nextDouble();
        attcheacker(math,physics,chemistry,programming,grade);
        
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

    public static void attcheacker(int m,int py, int c, int pg, double g){
        if(m<0 ||m>=50){
            System.out.println("The Math attendences is wrong enter again");
            System.exit(0);
        } else if(py<0 ||py>=50){
            System.out.println("The Physic attendences is wrong enter again");
            System.exit(0);
        } else if(c<0 ||c>=50){
            System.out.println("The Chemistry attendences is wrong enter again");
            System.exit(0);
        } else if(pg<0 ||pg>=50){
            System.out.println("The Programming attendences is wrong enter again");
            System.exit(0);
        } else if(g<0.0 ||g>5.0){
            System.out.println("The Grade input is wrong enter again");
            System.exit(0);
        }
    }
}
