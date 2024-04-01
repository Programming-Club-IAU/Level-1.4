import java.util.Scanner ;

public class Attendance_Grade_System {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
       
        String iauArt = 
             "  III      A     U   U \n" + 
             "   I      A A    U   U \n" + 
             "   I     AAAAA   U   U \n" + 
             "   I     A   A   U   U \n" + 
             "  III    A   A    UUU  \n";
             System.out.println(iauArt);
             System.out.println("===========================================================================\n\n");
        System.out.print(
        "Welcome to the Attendance with Grade System\n\n"+
        "Enter student name: ");
        String student_name = scanner.nextLine();
 
        int requirement_attendance[] = {44 , 42 , 40 , 47} ;
        int attendance[] = new int[4] ;
        String[] subjects = {"Math" , "Physics" , "Chemistry" , "Programming"};
        boolean hospitalExcuse = false;
 
        System.out.println("Enter the attendance for each subject: ");
        for (int i = 0 ; i < attendance.length ; i++){
         System.out.print(subjects[i] + ": ");
         attendance[i] = scanner.nextInt();
        }
         System.out.println("===========================================================================\n\n");
         System.out.println("Mark attendance for each subject (Enter excuse of absence): ");
         scanner.nextLine();
         String excuse = scanner.nextLine();
         if (excuse.toLowerCase().contains("hospital")) {
             hospitalExcuse = true;
         }
 
         if (hospitalExcuse){
             for ( int i = 0 ; i < attendance.length ; i++ ){
             attendance[i]++ ;
             }
         }
         System.out.println("===========================================================================\n\n");
         System.out.println("Enter grade for the semester (out of 5):");
         double grade = scanner.nextDouble();
 
         boolean success = true ;
         for (int i = 0 ; i < requirement_attendance.length;i++){
             if ( attendance[i] < requirement_attendance[i] ) {
             success = false;
             break;
             }
         }
         if (grade < 3.5){
             success = false;
         }
         System.out.println("===========================================================================\n\n");
         System.out.println("Student Information: ");
         System.out.println("Name: "+student_name);
         for (int i = 0 ; i < attendance.length ; i++){
             System.out.println(subjects[i] +
              "Attendance: " + attendance[i] + " days." );
         }
         System.out.println("Grade: " + grade + "\n");
         if (success){
             System.out.println("Result: Success.");
         }
         else{
             System.out.println("Result: failure.");
         }
    }
}
