import java.util.Scanner;

public class task4 {public static void main(String[] args) throws Exception {
        
    Scanner input = new Scanner(System.in);

    int counter = 0;
    System.out.println("Enter the number of students:");
    int numStudents = Integer.parseInt(input.nextLine());

    Student[] studentsArray = new Student[numStudents];
    String nextStudent = "no";
    
        Student student = new Student();
       do {
    
            System.out.print("Enter student name:");
            String name = input.nextLine();
            student.setName(name);
    
            System.out.println("Enter the attendance for each subject:");
            System.out.print("Math:");
            int math = Integer.parseInt(input.nextLine());
            student.setMath(math);
    
            System.out.print("Physics:");
            int physics = Integer.parseInt(input.nextLine());
            student.setPhysics(physics);
    
            System.out.print("Chemistry:");
            int chemistry = Integer.parseInt(input.nextLine());
            student.setChemistry(chemistry);
    
            System.out.print("Programming:");
            int programming = Integer.parseInt(input.nextLine());
            student.setProgramming(programming);
    
            System.out.print("Mark attendance for each subject (Enter excuse of absence):");
            String excuse = input.nextLine();
            student.checkingAbsence(excuse);
    
            System.out.print("Enter grade for the semester (out of 5):");
            double grade = input.nextDouble();
            student.setGrade(grade);
    
            student.checkingResult();
            student.display();
    
            studentsArray[counter] = student;
            counter++;
            input.nextLine(); 
            if (counter!=numStudents)
            {System.out.print("\nDo you want to enter other student info?");
            nextStudent = input.nextLine();}
            else 
            { System.out.println("\nThanks for using our program\n");
                break;}
            
            System.out.println();
    
    } while (nextStudent.toLowerCase().equals("yes" ) && counter!=numStudents);
   

input.close();
}


public static class Student {
private String name;
private int math;
private int physics;
private int chemistry;
private int programming;
private double grade;
private String result;
private String excuse;
private int absences;

public void display() {
    System.out.println("Student Information:\nName: " + name + "\nMath Attendance: " + math + " days\nPhysics Attendance: " + physics +
        " days\nChemistry Attendance: " + chemistry + " days\nProgramming Attendance: " + programming + " 1days\nGrade: " + grade + "\n\nResult: " + result);
}

public void checkingResult() {
    result = "Failure";
    if (math >= 44 && physics >= 42 && chemistry >= 40 && programming >= 47 && grade > 3.5 && grade<=5) {
        result = "Success";
    }
}

public void checkingAbsence(String excuse) {
    if (excuse.toLowerCase().contains("hospital")) {
        absences++;
        ++math;
        ++physics;
        ++chemistry;
        ++programming;
        

    }
}


public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getMath() {
    return math;
}

public void setMath(int math) {
    this.math = math;
}

public int getPhysics() {
    return physics;
}

public void setPhysics(int physics) {
    this.physics = physics;
}

public int getChemistry() {
    return chemistry;
}

public void setChemistry(int chemistry) {
    this.chemistry = chemistry;
}

public int getProgramming() {
    return programming;
}

public void setProgramming(int programming) {
    this.programming = programming;
}

public double getGrade() {
    return grade;
}

public void setGrade(double grade) {
    this.grade = grade;
}

public String getResult() {
    return result;
}

public void setResult(String result) {
    this.result = result;
}

public String getExcuse() {
    return excuse;
}

public void setExcuse(String excuse) {
    this.excuse = excuse;
}

public int getAbsences() {
    return absences;
}

public void setAbsences(int absences) {
    this.absences = absences;
}

}
}


