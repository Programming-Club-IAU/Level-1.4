import java.util.Scanner;
public class task14 {
    public static void main(String[] args) throws Exception {

        System.out.print("whats your name ");
            Scanner input = new Scanner(System.in);

        String name= input.nextLine();
            System.out.println("your name is "+ name);
            System.out.println("enter ur attendance for each subject:");
            System.out.print("math: ");

        int mathat= input.nextInt();
            System.out.print("physics: ");

        int physat= input.nextInt();
            System.out.print("chemistry: ");

        int chemat= input.nextInt();
            System.out.print("programming: ");

        int programmingat= input.nextInt ();
            input.nextLine();

        System.out.println("Enter an excuse of absence (should have a hospital excuse to make it count): ");
            String excuse= input.nextLine();

        System.out.println("enter your (GPA out of 5) ");
           Double GPA= input.nextDouble();

if(excuse.toLowerCase().contains("hospital")){
            mathat++;
            physat++;
            chemat++;
            programmingat++;
        
    if( mathat <44 || physat<42 || chemat<40 || programmingat <47 || GPA<3.5){
            System.out.println("you failed ");

        }
    else{
        System.out.println("------------------------------");
        System.out.println("student name: "+name);
        System.out.println("math Attendance: "+mathat);
        System.out.println("physics Attendance: "+physat);
        System.out.println("chemistry Attendance: "+chemat);
        System.out.println("Programming Attendance: "+programmingat);
        System.out.println("GPA: "+GPA);
        System.out.println("");
        System.out.println("you succeeded");
    }
}   

    }
}
