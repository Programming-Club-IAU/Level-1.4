import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        int[] attendance = new int[4];

        String[] subjects = {"Math", "Physics", "Chemistry", "Programming"};
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter attendance for " + subjects[i] + ": ");
            attendance[i] = input.nextInt();
        }

        input.nextLine();

        System.out.print("Mark attendance for each subject (Enter excuse of absence): ");
        String excuse = input.nextLine();
        if(excuse.contains("hospital")){
            for (int i = 0; i < attendance.length; i++){
                attendance[i]++;
            }
        }

        String result;
        System.out.print("Enter grade for the semester (out of 5): ");
        double grade = Double.parseDouble(input.nextLine()); // Read whole line and parse to int

        if(grade > 3.5){
             result = "Succeed";
        }
        else{
            result = "failed";
        }

        System.out.println("Student information:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " Attendance: " + attendance[i] + " days");
        }
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);

        
        input.close();
    }
}
