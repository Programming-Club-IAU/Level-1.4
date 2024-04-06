# STUDENT SYSTEM READ ME FILE
________________________________________________________________________________________________________________________________
# PROJECT BRIFE INFORMATION

The Student System is a Project That Helps Students or Any User to Check Wheather They Are Successful or Failed from Student's 
Informations. The Informations are Student's name, and Attendence in the Four Courses (Math, Physics, Chemistry, and Programming).
As Well as Students Exceuse Incase of Student Abcence to Incerse it Attendence Day by One and it Grade out of 5.0. If The Student
Filfulled it Requirement, It will Display Student's Information with "Success" Message. Otherwise, It will Display the same 
Information with a "Fail" Message.
_________________________________________________________________________________________________________________________________
# THE STUDENT CLASS CONTENT

The Student Class Contain Numerus of Mehods with Constructor and Many Data Fields, and List Methods with Thier Purposes:
- pas(grade) : Decide which Message to Display After Checking the Requirements.
- display() : Display All Student's Information and it Message.
- mathChecker(math attendence) : Checks if the Math Attencdence Isn't Out of the Range (0 - 50).
- physChecker(physics attendence) : Checks if the Physics Attendence Isn't Out of the Range (0 - 50).
- chemChecker(chemistry attendence) : Checks if the Chemistry Attendence Isn't Out of the Range (0 - 50).
- progChecker(programming attendence) : Checks if the Programming Attendence Isn't Out of the Range (0 - 50).
- gradeChecker(grade) : Checks if the Grade Isn't Out of the Range (0.0 - 5.0).
- excChecker(excuse) : To Checks if the Student Entered an Excuse to Increase it Attendence or not.
- nameChecker(name) : To Check if the Student Entered it Name proply and Didn't enter any Number or Characters in their Name.
_________________________________________________________________________________________________________________________________
# MAIN CLASS CONTENT AND FLOW CONTROL

The Class May Contains the InputMismatch excpetion class imported to face input issue esspesally to the attendence input, and a 
Scanner Class for being able to have inputs take from the user. There are two object created to implement the classes Scanner and
Student class, with a user-friendly interface. Afterward, in each input that will be asked from the user-interface will be checked 
by it method , and if the checking is done successfully with any issues it will be taken to the Student class as data feild intialz.
Once all the data are inmported it will display all the information and disply a message that the system has finally processed 
everything. if there is any wrong input the system will stop the process ,and display an error message or an wrong input cuase it to 
stop. 
