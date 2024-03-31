class Student {
    String name;
    double grade;
    int AttMath;
    int AttPhysics;
    int AttChemistry;
    int AttProgramming;

    Student(){
        this.name="null";
        this.grade=0.0;
        this.AttMath=0;
        this.AttPhysics=0;
        this.AttChemistry=0;
        this.AttProgramming=0;
    }
    Student(String name,double grade, int AttMath, int AttPhysics, int AttChemistry, int AttProgramming){
        this.name=name;
        this.AttMath=AttMath;
        this.AttPhysics=AttPhysics;
        this.AttChemistry=AttChemistry;
        this.AttProgramming=AttProgramming;
    }

    public String pas(double grade){
        if (grade>=3.5){
            if (AttPhysics>=)
        }
    }
    public void display(){
        System.out.println("\nStudent information:\nName: "+name+"\nMath Attendance: "+AttMath+" days\nPhysics Attendance: "+AttPhysics+" days\nChemistry Attendance: "+AttChemistry+" days\nProgramming Attendance: "+AttProgramming+"days\nGrade: "+grade);
        System.out.println("\n\nThe Results: "+pas(grade));
    }
}
