import java.util.*;
import java.io.*;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        String userName, excuse;
        double GPA;
        String subjects[] = {"Math", "Physics", "Chemistry", "Programming"};
        final double minAttend[] = {44, 42, 40, 47};
        double studentAttend[] = new double[4];
        String result = "Success";

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter your name: ");
        userName = myObj.next();

        for (int i = 0; i < subjects.length; i++) {
            while (true) {
                try {
                    System.out.print(subjects[i] + ": ");
                    studentAttend[i] = myObj.nextDouble();
                    if (studentAttend[i] < minAttend[i]) {
                        result = "Fail";
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    myObj.next(); // to consume the invalid token
                }
            }
        }

        myObj.nextLine(); // Consume newline left-over
        System.out.print("Mark attendance for each subject (Enter excuse of absence): ");
        excuse = myObj.nextLine();

        while (true) {
            try {
                System.out.print("Enter grade for the semester (out of 5): ");
                GPA = myObj.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                myObj.next(); // to consume the invalid token
            }
        }

        if (excuse.contains("hospital")) {
            for (int i = 0; i < studentAttend.length; i++) {
                studentAttend[i]++;
            }
        }

        File file = new File("students.txt");
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    System.out.println("Error creating new file: " + file.getAbsolutePath());
                    return;
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
                return;
            }
        }

        StringBuilder fileContent = new StringBuilder();
        boolean userExists = false;

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (line.equals("Name: " + userName)) {
                    // User exists, update their information
                    fileContent.append(line).append("\n");
                    for (int i = 0; i < subjects.length; i++) {
                        fileContent.append(subjects[i] + ": " + studentAttend[i]).append("\n");
                        if (fileScanner.hasNextLine()) {
                            fileScanner.nextLine(); // Skip old line
                        }
                    }
                    fileContent.append("Grade: " + GPA).append("\n");
                    if (fileScanner.hasNextLine()) {
                        fileScanner.nextLine(); // Skip old line
                    }
                    fileContent.append("Result: " + result).append("\n\n");
                    if (fileScanner.hasNextLine()) {
                        fileScanner.nextLine(); // Skip old line
                    }
                    userExists = true;
                } else {
                    fileContent.append(line).append("\n");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        if (!userExists) {
            // User doesn't exist, add their information
            fileContent.append("Name: ").append(userName).append("\n");
            for (int i = 0; i < subjects.length; i++) {
                fileContent.append(subjects[i]).append(": ").append(studentAttend[i]).append("\n");
            }
            fileContent.append("Grade: ").append(GPA).append("\n");
            fileContent.append("Result: ").append(result).append("\n\n");
        }

        try (FileWriter writer = new FileWriter("students.txt")) {
            writer.write(fileContent.toString());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        myObj.close();

        System.out.println("\n**  **	      **  ********       ****\n"+
                            "**  ****      **  **          **      **\n"+
                            "**  **  **    **  ****      **          **\n"+
                            "**  **    **  **  **        **          **\n"+
                            "**  **      ****  **          **      **\n"+
                            "**  **        **  **             ****");

        System.out.println("\nStudent Information");
        System.out.println("Name: " + userName);
        
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " Attendance: " + studentAttend[i] + " days");
        }

        System.out.println("Grade: " + GPA + "\n");
        System.out.println("Result: " + result);


    }
}
