class Student {
    String name;
    double grade;
    int AttMath;
    int AttPhysics;
    int AttChemistry;
    int AttProgramming;
    String excuse;

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
        if (grade>=3.5 && AttMath>=44 && AttPhysics>=42 && AttChemistry>=40 && AttProgramming>=47){
            return "Success";
        }else
            return "Fail";
    }

    public void display(){
        System.out.println("\nStudent information:\nName: "+name+"\nMath Attendance: "+AttMath+" days\nPhysics Attendance: "+AttPhysics+" days\nChemistry Attendance: "+AttChemistry+" days\nProgramming Attendance: "+AttProgramming+" days\nGrade: "+grade);
        System.out.println("\n\nThe Results: "+pas(grade));
    }

    public void mathChecker(int AttMath){
        if(AttMath<0 || AttMath>50){
            System.err.println("The Math Attendence is Incorrect, Please Enter Again.");
            System.exit(0);
        }
    }

    public void physChecker(int AttPhysics){
        if(AttPhysics<0 || AttPhysics>50){
            System.err.println("The Physics Attendence is Incorrect, Please Enter Again.");
            System.exit(0);
        }
    }

    public void chemChecker(int AttChemistry){
        if(AttChemistry<0 || AttChemistry>50){
            System.err.println("The Chemistry Attendence is Incorrect, Please Enter Again.");
            System.exit(0);
        }
    }

    public void progChecker(int AttProgramming){
        if(AttProgramming<0 || AttProgramming>50){
            System.err.println("The Programming Attendence is Incorrect, Please Enter Again.");
            System.exit(0);
        }
    }

    public void gradeChecker(double grade){
        if(grade<0.0 || grade>5.0){
            System.err.println("The Grade is Incorrect, Please Enter Again.");
            System.exit(0);
        }
    }

    public void excChecker(String excuse){
        
    }
}
