import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
public class Bonus10 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\h4yat\\OneDrive - IMAM ABDULRAHMAN BIN FAISAL UNIVERSITY\\Desktop\\Level-1.4\\Level-1.4\\infoFile.txt"));
        FileWriter w = new FileWriter("C:\\Users\\h4yat\\OneDrive - IMAM ABDULRAHMAN BIN FAISAL UNIVERSITY\\Desktop\\Level-1.4\\Level-1.4\\infoFile.txt",true);
        Scanner ciao = new Scanner(System.in);
        String line, name="", excuse="";
        int prog=0, phys=0, math=0, chem=0;
        double gpa = 0.0;
        boolean Success = true,need=false;
        System.out.println("Welcome to the Attendance and Grade System!\nThis is the bonus part of the task\nEvery detail will be taken from the txt file. \nEnjoy!") ;
        System.out.println("Student's info: ");
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Name: ")) {
                name = String.valueOf(line.substring(6).trim());
            }
            if (line.startsWith("Math Attendance: ")) {
                math = Integer.parseInt(line.substring(17).trim());
            }
            if (line.startsWith("Physics Attendance: ")) {
                phys = Integer.parseInt(line.substring(20).trim());
            }
            if (line.startsWith("Chemistry Attendance: ")) {
                chem = Integer.parseInt(line.substring(22).trim());
            }
            if (line.startsWith("Programming Attendance: ")) {
                prog = Integer.parseInt(line.substring(24).trim());
            }
            if (line.startsWith("GPA: ")) {
                gpa = Double.parseDouble(line.substring(5).trim());
                need=true;
                break;
            }
        }
        System.out.println("The attendance for each subject:");
        System.out.println("Math: " + math);
        System.out.println("Physics: " + phys);
        System.out.println("Chemistry: " + chem);
        System.out.println("Programming: " + prog);
        System.out.println("Students' GPA: " + gpa);
        while(need){
                line = reader.readLine(); // read a new line
                if (math < 44 || phys < 42 || chem < 40 || prog < 47) {
                    System.out.print("The excuse of absence: ");
                    if (line.startsWith("Excuses: ")) {
                        excuse = String.valueOf(line.substring(9).trim());
                        System.out.println(excuse);
                    }
                    int index = excuse.indexOf("hospital");
                    if (index != -1) {
                        math++;prog++;chem++;phys++;
                        if(math < 44 || phys < 42 || chem < 40 || prog < 47){
                            Success = false;
                        }
                    }
                    else{
                        Success = false;
                    }
                }
                need=false;
            }
            System.out.println("\n    ---------------------\n \\\\|Student info. updated|//\n    ---------------------\n" + //
                        "\nName: "+name+
                           "\nMath Attendance: "+math+" days\n" +
                           "Physics Attendance: "+phys+" days\n" + 
                           "Chemistry Attendance: "+chem+" days\n" + 
                           "Programming Attendance: "+prog+" days\n" + 
                           "Grade: "+gpa+" out of 5");
        if(Success){
            try{
                w.append("\nResult: Congrats! you've success >_<");
                w.close();
            }
            catch(Exception ex){
                System.out.println("Can't write in the file");
            }
            System.out.println("Result: Congrats! you've success >_<");
        }
        else{
            try{
                w.append("\nResult: Oops. you failed :'(");
                w.close();
            }
            catch(Exception ex){
                System.out.println("Can't write in the file");
            }
            System.out.println("Result: Oops. you failed :'(");
        }
    }
}

