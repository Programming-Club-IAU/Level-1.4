import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class Bonus {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\h4yat\\OneDrive - IMAM ABDULRAHMAN BIN FAISAL UNIVERSITY\\Desktop\\Level-1.4\\Level-1.4\\infoFile.txt"));
        Scanner ciao = new Scanner(System.in);
        String line, name="";
        System.out.println("Welcome to the Attendance and Grade System!\nThis is the bonus part of the task\nEvery detail will be taken from the txt file. \nEnjoy!") ;
        System.out.print("Student's Name: ");
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Name: ")) {
                name = String.valueOf(line.substring(6).trim());
                System.out.println(name);
                break;
            }
        }

        System.out.println("The attendance for each subject:");
        //list of variables
        int prog=0, phys=0, math=0, chems=0;
        double gpa = 0.0;
        boolean Success = true;

        System.out.print("Math: ");
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Math Attendance: ")) {
                math = Integer.parseInt(line.substring(17).trim());
                System.out.println(math);
                break;
            }
        }

        System.out.print("Physics: ");
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Physics Attendance: ")) {
                phys = Integer.parseInt(line.substring(20).trim());
                System.out.println(phys);
                break;
            }
        }
        System.out.print("Chemistry: ");
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Chemistry Attendance: ")) {
                chems = Integer.parseInt(line.substring(22).trim());
                System.out.println(chems);
                break;
            }
        }

        System.out.print("Programming: ");
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Programming Attendance: ")) {
                prog = Integer.parseInt(line.substring(24).trim());
                System.out.println(prog);
                break;
            }
        }
        if (math < 44 || phys < 42 || chems < 40 || prog < 47) {
            System.out.print("Enter excuse of absence: ");
            String excuse="";
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Excuses: ")) {
                    excuse = String.valueOf(line.substring(6).trim());
                    System.out.println(excuse);
                    break;
                }
            }
            int index = excuse.indexOf("hospital");
            if (index != -1) {
                math++;prog++;chems++;phys++;
                if(math < 44 || phys < 42 || chems < 40 || prog < 47){
                    Success = false;
                }
            }
            else{
                Success = false;
            }
        }

        System.out.print("Students' GPA: ");
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("GPA: ")) {
                gpa = Double.parseDouble(line.substring(5).trim());
                System.out.println(gpa);
                break;
            }
        }/////Nice!!
        System.out.println("    ---------------------\n \\\\|Student info. updated|//\n    ---------------------\n" + //
                        "\nName: "+name+
                           "\nMath Attendance: "+math+" days\n" +
                           "Physics Attendance: "+phys+" days\n" + 
                           "Chemistry Attendance: "+chems+" days\n" + 
                           "Programming Attendance: "+prog+" days\n" + 
                           "Grade: "+gpa+" out of 5");
        if(Success){
            System.out.println("Result: Congrats! you've success");
        }
        else{
            System.out.println("Result: Oops. you failed");
        }
    }
}
