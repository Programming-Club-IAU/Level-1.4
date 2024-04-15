import java.io.*;
public class FileIOManager {
    public static void saveStudentInfo(Student student) {
        try {
            FileWriter writer = new FileWriter(student.getName() + "_info.txt");
            writer.write("Name: " + student.getName() + "\n");
            for (Subject subject : student.getSubjects()) {
                writer.write(subject.getName() + " Attendance: " + subject.getAttendance() + " days\n");
            }
            writer.write("Grade: " + student.getGrade() + "\n");
            writer.close();
            System.out.println("\nStudent information saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
