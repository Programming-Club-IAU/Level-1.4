import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        while(true){
            try{
                String name;
                Scanner input = new Scanner(System.in);
                System.out.print("Enter student name : ");
                name = input.next();
                System.out.print("Enter GPA : ");
                Student student = new Student(name, input.nextDouble());
                student.addCourse("Math", 44);
                student.addCourse("Physics", 42);
                student.addCourse("Chemistry", 40);
                student.addCourse("Programming", 47);
                for(Course c:student.getCoursesList()){
                    if(c!=null){
                        System.out.print("Enter attendace for " + c.getName() + " : ");
                        c.setAttendance(input.nextInt());
                    }
                }
                System.out.println("Done !");
                System.err.println("=======================================================================");
                student.Show();
                if(student.getResult()){
                    System.out.println("Result : Success!");
                }
                else{
                    System.out.println("Result : Failed!");
                }
                System.err.println("=======================================================================");
                
                System.exit(0);
            }
            catch(Exception e){
                System.out.println("Something went wrong..." + e.getMessage() + e.getLocalizedMessage());
            }
        }
    }
}
class Course{
    private String CourseName;
    private int AttendanceCount, MinimumAttendance;
    private boolean isSuccess;
    public Course(String name, int MinimumAttend){
        CourseName = name;
        MinimumAttendance = MinimumAttend; 
    }
    private boolean checkExcuse(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter excuse for absence : ");
        String excuse = input.nextLine();
        if(excuse.contains("hospital")) {
            return true;
        } else {
            return false;
        }
    }
    public void setAttendance(int Attend){
        AttendanceCount = Attend;
        if(AttendanceCount > MinimumAttendance){
            isSuccess = true;
        }
        else{
            isSuccess = checkExcuse();
        }
    }
    public void SetName(String name){
        CourseName = name;
    }
    public void setCount(int count){
        AttendanceCount = count;
    }
    public void setMinimumAttendace(int num){
        MinimumAttendance = num;
    }
    public int getMinimumAttendace(){
        return MinimumAttendance;
    }
    public String getName(){
        return CourseName;
    }
    public int getCount(){
        return AttendanceCount;
    }
    public boolean isSuccess(){
        return isSuccess;
    }

}
class Student{
    String Name;
    double GPA;
    int Index;
    Course[] courses = new Course[6];
    public Student(String name, double gpa){
        Name = name;
        GPA = gpa;
    }

    public void addCourse(String name, int minimum){
        courses[Index] = new Course(name, minimum);
        Index++;
    }
    public void setName(String name){
        Name = name;
    }
    public void setGPA(int gpa){
        GPA = gpa;
    }
    public String getName(){
        return Name;
    }
    public double getGPA(){
        return GPA;
    }
    public Course[] getCoursesList(){
        return courses;
    }
    public void Show() {
        System.out.println("Student name : " + Name);
        for(Course k:courses){
            if(k != null){
                System.out.println(k.getName() + " Attendace : " + k.getCount());
            }
        }
    }
    public boolean getResult(){
        if(GPA < 3.5){
            return false;
        }
        else{
            for(Course c:courses){
                if(c!=null){
                    if(c.isSuccess()!=true){
                        return false;
                    }
                }
            }
            return true;
        }
    }


}