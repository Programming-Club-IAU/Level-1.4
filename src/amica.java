import java.nio.channels.NonReadableChannelException;
import java.util.Scanner;
public class amica {
    public static void main(String[] args) throws Exception {
        Scanner ciao = new Scanner(System.in);
        System.out.println("Welcome to the Attendance and Grade System!");
        System.out.print("Enter your name dear student: ");
        String name = ciao.nextLine();
        System.out.println("Enter the attendance for each subject:");
        //list of variables
        int gradeo,prog,phys,math,chems;

        System.out.print("Math: ");
        math = ciao.nextInt();

        System.out.print("Physics :");
        phys = ciao.nextInt();

        System.out.print("Chemistry :");
        chems = ciao.nextInt();

        System.out.print("programming: ");
        prog = ciao.nextInt();

        if(math<44 || phys<42 || chems<40 || prog<47){
        System.out.print("Enter excuse of absence: ");
        String excuse = ciao.nextLine();
        int index = excuse.indexOf("hospital");
        if(index!=-1){
            math++;prog++;chems++;phys++;
        }
        
        }




    }
}


