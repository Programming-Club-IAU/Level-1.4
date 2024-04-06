public class Student {
    private final int ID;
    private final String NAME;
    private double gpa;



    //Math: 0   Phys: 1  Chem: 2    Prog: 3
    private static final short attendanceLimit[] = {44,42,40,47};
    private final short[] attendanceList = new short[4];

    public Student(int id, String fName, String lName){
        ID = id;
        NAME = String.format("%s\t%s",fName,lName);
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return NAME;
    }

    public double getGPA(){
        return gpa;
    }

    public short[] getAttendanceList(){
        return attendanceList;
    }

    public void setGpa(double newGrade)throws IllegalArgumentException{
        if(newGrade > 5 || newGrade < 0)
            throw new IllegalArgumentException("Inserted grade is not within acceptable range.");
        else gpa = newGrade;
    }

    public void setAttendance(short absenceNum, short courseIndex){
        if(absenceNum > 50 || absenceNum < 0)
            throw new IllegalArgumentException("Attendance number not within range!");
        attendanceList[ courseIndex ] = absenceNum;
    }

    public void attendanceIncrease(){
        for(short i = 0; i < attendanceList.length; i++)
            if(attendanceList[i] < 50)
                setAttendance((short) (attendanceList[i] + 1), i);
    }

    public String getStatus(){
        for(short i = 0; i < 4; i++)
            if(attendanceList[i] < attendanceLimit[i])
                return "FAIL";
        if( getGPA() < 3.5)
            return "FAIL";
        return "PASS";
    }
}
