
#### 2.2 Attendance with Grade System Algorithm

Before coding, plan the algorithm for managing attendance and grades:
- Prompt the user to input attendance for each subject and an excuse of absence if applicable.
- Calculate average attendance across subjects.
- Prompt the user to input grades for the semester.
- Determine whether the student passes or fails based on attendance and grade criteria.

#### 2.3 Coding the Attendance with Grade System

Start coding the Attendance with Grade System project:
- Create a Student class to represent student information, including attendance, grades, and methods for calculating success or failure.
- Implement the main application logic to handle user interactions, input, and output.
- Utilize conditional statements and looping constructs to manage attendance, grades, and determining student success or failure.
- Test the program with various inputs to ensure correctness and handle edge cases.


#### 2.4 Documentation and Sharing

Document your code with comments to explain functionality and logic. Create a README.md file to provide project instructions and overview. Share your project with the programming club for feedback and collaboration.


## Project Overview:

### Description

This Java project focuses on creating an Attendance with Grade System program to manage student attendance and grades for multiple subjects. The program allows users to input attendance, grades, and excuses of absence, and determines whether students pass or fail based on specified criteria.

### Requirements

1. **Attendance Tracking:**
   - Track attendance for each subject (math, physics, chemistry, programming) with specified requirements.
   - Allow users to input an excuse of absence, increasing absences if the excuse contains the word "hospital".

2. **Grade Input:**
   - Prompt users to input grades for the semester (out of 5).

3. **Success/Failure Determination:**
   - Calculate attendance across subjects and determine if it meets the minimum requirement.
   - Determine if the grade is above 3.5 (student success), below 3.5, or 3.5 (student failure).

4. **User Interaction:**
   - Implement a user-friendly interface to input attendance, grades, and excuses for absence.
   - Provide clear output indicating whether the student passes or fails.
5. **minimum attendance day**
   - math classes should be attended 44 days out of 50
   - physics classes should be attended 42 days out of 50
   - chemistry classes should be attended 40 days out of 50
   - programming classes should be attended 47 days out of 50
6. **excuse for absence**
   add to the program the option of the excuse of absence if the input contains the word hospital increases one absence from each class.

### Example Interaction
```Welcome to the Attendance and Grade System!
Enter student name: John Doe
Enter the attendance for each subject:
Math: 43
Physics: 41
Chemistry: 39
Programming: 46
Mark attendance for each subject (Enter excuse of absence): Went to hospital for a check-up
Enter grade for the semester (out of 5): 4.2

Student Information:
Name: John Doe
Math Attendance: 44 days
Physics Attendance: 42 days
Chemistry Attendance: 40 days
Programming Attendance: 47 days
Grade: 4.2

Result: Success
```

### Bonus

- Implement file I/O to read student information from a file and store results.
- Enhance the user interface with ASCII art or additional messages for better engagement.

## Submission Guidelines

- The app should be pushed to Github and a pull request should be created. You can check how to push your code to Github in section [2.1.2 Add Changes](https://github.com/Programming-Club-IAU/git-and-github#212-add-changes).
- The pull request title should be in the following format: `<your-name> - <project-name>`. You can check how to make a pull request in section [2.1.5. Create a pull request](ttps://github.com/Programming-Club-IAU/git-and-github#215-create-a-pull-request).
- The pull request description should contain the following:
  - A description of your project.
  - A screenshot of the app.
