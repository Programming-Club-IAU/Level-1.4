import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Main{
    static ArrayList<Student> studentList;
    public static void main(String[] args) throws FileNotFoundException {
        studentList = initialize();
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        do{
         try{
             System.out.print("""
                     Please select one of the following operations:
                     1- Add a new student
                     2- View student info in records
                     3- Exit program
                     """);

             short choice = input.nextShort();

             switch( choice ){
                 case 1:
                     int id;
                     String fName, lName;
                     System.out.print("Please insert ID: ");
                     id = input.nextInt();
                     if(find(id) != -1)
                         throw new IllegalArgumentException("ID already exists!");

                     System.out.print("Please insert first name: ");
                     fName = input.next();
                     System.out.print("Please insert last name: ");
                     lName = input.next();

                     Student temp = new Student(id, fName, lName);
                     System.out.println("Please insert the amount of absences in the following subjects (out of 50):");
                     for(short i = 0; i < 4; i++){
                         String[] courseList = {"Math", "Phys", "Chem", "Comp"};
                         short attendanceNum;
                         System.out.printf("%s: ", courseList[i]);
                         attendanceNum = input.nextShort();
                         temp.setAttendance(attendanceNum, i);
                     }

                     System.out.print("Any excused absences? (y/n): ");
                     if(input.next().toLowerCase().charAt(0) == 'y'){
                         input.nextLine();
                         System.out.print("Please insert ALL excuses here: ");
                         Scanner reader = new Scanner(input.nextLine());
                         while(reader.hasNext())
                             if( reader.next().equalsIgnoreCase("hospital"))
                                 temp.attendanceIncrease();
                         reader.close();
                     }
                     else input.nextLine();

                     System.out.print("Please insert grade (0.0 - 5.0): ");
                     temp.setGpa(input.nextDouble());


                     view(temp);
                     studentList.add(temp);
                     break;

                 case 2:
                     int index;
                     System.out.print("Please insert student ID here: ");
                     index = find(input.nextInt());
                     if(index == -1)
                         throw new IllegalArgumentException("ID not in records!");
                     view(studentList.get(index));
                     break;

                 case 3:
                     flag = false;


             }
         }
         catch(InputMismatchException e){
             System.err.println("Wrong type of input!");
             input.nextLine();
         }
         catch (IllegalArgumentException f){
             System.err.println(f.getMessage());
         }
         finally {
             System.out.println("-----------------------------------------------------------------------------\n");
         }
        }
        while(flag);







        save();
    }

    static ArrayList<Student> initialize(){
        ArrayList<Student> temp = new ArrayList<>();
        try{
            Scanner reader = new Scanner( new FileInputStream("studentList.txt"));
            while(reader.hasNext() ) {
                temp.add(new Student(reader.nextInt(), reader.next(), reader.next()));
                for (short i = 0; i < 4; i++)
                    temp.getLast().setAttendance(reader.nextShort(), i);
                temp.getLast().setGpa(reader.nextDouble());
            }
        }
        catch(FileNotFoundException e){
            new File("studentList.txt");
            return new ArrayList<>();
        }
        return temp;
    }

    static void save() throws FileNotFoundException {
        PrintWriter pout = new PrintWriter(new FileOutputStream("studentList.txt"));
        for(Student i : studentList ) {
            pout.print(String.format("%d\t%s\t", i.getID(), i.getName()));
            for(short j : i.getAttendanceList())
                pout.print(j + "\t");
            pout.println(i.getGPA());
        }
        pout.close();
    }

    static int find(int id){
        for(int i = 0; i < studentList.size(); i++)
            if(id == studentList.get(i).getID())
                return i;
        return -1;
    }

    static void view(Student std){
        System.out.printf("-----------------------------------------------------------------------------\nID: %d\nName: %s\nATTENDANCE [MATH, PHYS, CHEM, COMP]:\n%s\nGPA: %.2f\n\n%s\n",std.getID(),std.getName(), Arrays.toString(std.getAttendanceList()), std.getGPA(),std.getStatus());
    }
}