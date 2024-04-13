import java.util.Scanner;
public class task {
    static void data(){
        Scanner n1 = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = n1.nextLine(); 
 
        System.out.println("enter the attendance for each subject:");
 
        Scanner n2 = new Scanner(System.in);
        System.out.print("math: ");
        int math = n2.nextInt();
 
        Scanner n3 = new Scanner(System.in);
        System.out.print("physics: ");
        int physics = n3.nextInt();
 
        Scanner n4 = new Scanner(System.in);
        System.out.print("chemistry: ");
        int chemistry = n4.nextInt();
 
        Scanner n5 = new Scanner(System.in);
        System.out.print("programming: ");
        int programming = n5.nextInt();
 
        Scanner n6 = new Scanner(System.in);
        System.out.print("Mark attendance for each subject (Enter excuse of absence): ");
        String excuse = n6.nextLine();
 
        Scanner n7 = new Scanner(System.in);
        System.out.print("Enter grade for the semester (out of 5): ");
        float grade = n7.nextFloat();

        boolean result = excuse.contains("hospital");
        if (result){
            math++;
            physics++;
            chemistry++;
            programming++;
        }
        if (grade>5.0){
            System.out.println("you cant enter a grade above 5.0");
        }
        else{
            
            System.out.print("\n" + "Student Information:" + "\n" + "name: " + name + "\n" + "math Attendance: " + math + "\n" + "Physics Attendance: " + physics+ "\n" + "Chemistry Attendance: " + chemistry + "\n" + "Programming Attendance: " + programming + "\n" + "Grade: " + grade + "\n");
        

            if (math < 44 || physics < 42 || chemistry < 40 || programming < 47 || grade < 3.5){
                System.out.println("result: fail");
        }
            else{
                System.out.println("result: success");
        }
        }

    }


    public static void main(String[] args) {
        data();
    }
}
