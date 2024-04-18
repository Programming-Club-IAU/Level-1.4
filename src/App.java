import java.util.Scanner;

public class App {
    //global variables
    static String[] subjects = new String[]{"Math attendance ","Physics attendance ","Chemistry attendance ","Programming attendance "};
    static boolean thereIsAbsence = false;// to indicate non-accepted or non-sloved absence

    static void printInfo(String name,int attendance[], double grade, String result){//print info at the end of the program
        System.out.println("\nhere is the result :\nname: "+name);
        for (int i=0;i<4;i++){
            System.out.println(subjects[i]+" : "+attendance[i]);
        }

        //print result
        if (thereIsAbsence){result="Failed";};
        System.out.println("grade: "+grade+"\n\nNow for the most important part!\nyour result is..."+result);

        //print goodbye msg
        if(result == "Success"){
            System.out.println("congrats and I wish you more success <3\n\nTHE END.");
        }
        else{
            System.out.println("better luck next time, I wish you make it next time <3\n\nTHE END.");
        }

    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        //String[] subjects = new String[]{"Math attendance ","Physics attendance ","Chemistry attendance ","Programming attendance "};
        int[] studentAttendance = new int[4];

        System.out.println("Welcome!!\nPlease enter your name: ");
        String name = input.nextLine();

        System.out.println("Now please enter your attendance for each of the following subjects: ");
        for (int i=0 ; i<4 ; i++){
            System.out.println(subjects[i]);
            studentAttendance[i]=input.nextInt();
            input.nextLine();
        }
        // check if there is an absence
        if(student.isThereAbsence(studentAttendance)){
            System.out.println("enter excuse of absence (will get one attendance in each class *if accepted*): ");
            String excuse = input.nextLine();
            if(student.excuseAccepttance(excuse)){// check if excuse accepted
                student.increaseAbsence(studentAttendance);
            }
            else{
                System.out.println("-->  sorry your excuse was not accepted..");
                thereIsAbsence=true;// to indicate non-accepted or non-sloved absence
            }
        }

        //get grades
        System.out.println("now enter you grade out of 5: ");
        double grade=input.nextDouble();
        //check if student successed or failed
        String result = student.StudentSuccess(grade);
        printInfo(name,studentAttendance,grade,result);
        input.close();

    }   
}
