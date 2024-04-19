import java.util.Scanner;

public class App {
public static void main(String[] args) throws Exception {
Scanner input =new Scanner(System.in);


    System.out.println("enter student name: ");
    String name=input.nextLine();

Student stu =new Student(name);

System.out.println("enter the attendance for each subject:   ");
System.out.println("math : ");
stu.setMathAten(input.nextInt());

System.out.println("physics : ");
stu.setPhysicsAten(input.nextInt());

System.out.println("programming : ");
stu.setProgrammingAten(input.nextInt());

System.out.println("chemastry : ");
stu.setChemistryAten(input.nextInt());

input.nextLine();

System.out.println("mark attendence for each subject (excuse) : ");
String excuse=input.nextLine();

System.out.println("enter grade of semester out of 5");
stu.setGrade(input.nextDouble());

if(excuse.toLowerCase().contains("hospital"))
{
    stu.increaseAbsence();
}



System.out.println("student information: ");
System.out.println("name: "+stu.getName());
System.out.println("math atendence: "+stu.getMathAten());
System.out.println("physics atendence: "+stu.getPhysicsAten());
System.out.println("programing atendence: "+stu.getProgrammingAten());
System.out.println("chemastry atendence: "+stu.getChemistryAten());
System.out.println("grade: "+stu.getGrade());

if(stu.isSuccess())
System.out.println("success");
else
System.out.println("fail");
}
}
class Student{

private String name;
private int mathAten;
private int physicsAten;
private int programmingAten;
private int chemistryAten;
private Double grade;

public Student(String name)
{
this.name=name;
}

public String getName() {
return name;
}

public int getMathAten() {
return mathAten;
}

public int getPhysicsAten() {
return physicsAten;
}

public int getProgrammingAten() {
return programmingAten;
}

public int getChemistryAten() {
return chemistryAten;
}

public Double getGrade() {
return grade;
}

public void setName(String name) {
this.name = name;
}

public void setMathAten(int mathAten) {
this.mathAten = mathAten;
}

public void setPhysicsAten(int physicsAten) {
this.physicsAten = physicsAten;
}

public void setProgrammingAten(int programmingAten) {
this.programmingAten = programmingAten;
}

public void setChemistryAten(int chemistryAten) {
this.chemistryAten = chemistryAten;
}

public void setGrade(Double grade) {
this.grade = grade;
}

//method
public void increaseAbsence()
{
mathAten++;
chemistryAten++;
programmingAten++;
physicsAten++;

}
public boolean isSuccess()
{

if(mathAten>44 && physicsAten>42 && chemistryAten>40 && programmingAten>47&& grade>3.5)
{return true;}
else
{return false;}
}

public int getTotalAten()
{
return mathAten+physicsAten+programmingAten+chemistryAten;
}
}
