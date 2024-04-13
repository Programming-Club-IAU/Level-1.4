import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UseFileIO {
    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new FileReader("StudentInfo.txt"));
             BufferedWriter outputWriter = new BufferedWriter(new FileWriter("StudentOutput.txt"))) {

            String line;
            while ((line = inputReader.readLine()) != null) {
                String name = line;
                String[] attendancesInfo = inputReader.readLine().split(" ");
                int[] attendances = new int[attendancesInfo.length];

                for (int i = 0; i < attendancesInfo.length; i++) {
                    attendances[i] = Integer.parseInt(attendancesInfo[i]);
                }

                String excuse = inputReader.readLine();
                Double grade = Double.parseDouble(inputReader.readLine());

                if (excuse.contains("hospital")) {
                    for (int i = 0; i < attendances.length; i++) {
                        attendances[i]++;
                    }
                }

                String[] subjects = {"Math", "Physics", "Chemistry", "Programming"};

                // Write in the output file
                outputWriter.write("Student information:\n");
                outputWriter.write("Student name: " + name + "\n");

                for (int i = 0; i < attendances.length; i++) {
                    outputWriter.write(subjects[i] + ": " + attendances[i] + " days\n");
                }

                outputWriter.write("Grade: " + grade + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
