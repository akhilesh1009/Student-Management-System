//ST10281011 Akhilesh Parshotam
package Question_One;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ST10281011 Akhilesh Parshotam
 */
public class Student
{
    ///Variable Declaration
    int studentId;
    String studentName;
    int studentAge;
    String studentGender;
    String studentPhoneNum;
    String studentEmail;
    String studentCourse;

//**********************************************************************************************************************************
    //Attribution for ArrayLists https://www.w3schools.com/java/java_arraylist.asp
    
    /*
    This method is used to get the student ID and ensures that it is exaclty 5 digits long and ends with a 0.
    It checks to see if a entered student ID is already in use, and will return the valid student ID.
    */
    public static int getStudentId(ArrayList<Student> studentList)
    {
        Scanner scan = new Scanner(System.in);
        
        int ID = -1; // Initilising the ID to -1.

        while (ID == -1)
        {
            System.out.print("Enter the student id (5 digits long and ends with a 0): ");
            String inputId = scan.nextLine();
 
            if (inputId.matches("\\d{4}0")) // Checks to see if student ID is 5 digits long and ends with a 0.
            {
                ID = Integer.parseInt(inputId);

                // Checks to see if the student ID is already in use and primpts the user a different student ID.
                for (Student student : studentList)
                {
                    if (student.studentId == ID)
                    {
                        System.out.println("Student ID is already taken. Please choose a different ID.");
                        ID = -1;
                        break;
                    }
                }
            } else
            {
                System.out.println("Invalid student ID. Please make sure it is 5 digits long and ends with 0.");
            }
        }
        // Returns the valid student ID.
        return ID;
    }

//**********************************************************************************************************************************
    
    /*
    This method is used to get the students full name and ensures that the first name is greater then 5 characters long 
    and the last name is greater then 7 characters long. It will return the students Full name if both values are valid.
    */
    public static String getStudentFullName(ArrayList<Student> studentList)
    {
        Scanner scanner = new Scanner(System.in);

        String firstName = ""; // Initilising firstname as a empty string.
        String lastName = ""; // Initilising lastname as a empty string.

        while (true)
        {
            if (firstName.isEmpty() || lastName.isEmpty())
            {
                if (firstName.isEmpty())
                {
                    System.out.print("Enter the student first name (5 Canaracters long):");
                    firstName = scanner.nextLine();

                    if (firstName.length() < 5) // Checks to see if the first name is greater then 5 characters.
                    {
                        System.out.println("Invalid first name. Please make sure the first name is at least 5 characters long.");
                        firstName = "";
                        continue;
                    }
                }

                if (lastName.isEmpty())
                {
                    System.out.print("Enter the student last name (7 characters long): ");
                    lastName = scanner.nextLine();

                    if (lastName.length() < 7) // Checks to see if the last name is greater then 7 characters.
                    {
                        System.out.println("Invalid last name. Please make sure the last name is at least 7 characters long");
                        lastName = "";
                    }
                }
            } else
                
            {
                break;
            }
        }
        
        //Returns a valid student firstname and lastname.
        return firstName + " " + lastName;
    }

//**********************************************************************************************************************************
    
    /*
    This method is used to get the students age and ensures that is greater then equal to 16. 
    It will return the students age if valid.
    */
    public static int getStudentAge(ArrayList<Student> studentList)
    {
        Scanner scanner = new Scanner(System.in);
        
        int age = 0; // Initilising age to 0.

        while (true)
        {
            System.out.print("Enter the student age (Greater than or equal to 16): ");
            String input = scanner.nextLine();

            if (input.matches("\\d+")) // Ensures that the input is numeric.
            {
                age = Integer.parseInt(input);
                if (age >= 16) // Checks to see if the studets age is greater then equal to 16. 
                {
                    break;
                } else
                    
                {
                    System.out.println("Invalid student age. Please make sure the student age is greater than or equal to 16.");
                }
            } else
                
            {
                System.out.println("Invalid input. Please enter numeric digits only.");
            }
        }
        // Returns a valid stydent age
        return age;
    }

//**********************************************************************************************************************************
    
    /*
    This method is used to get the students gender and ensires that it is either M or F.
    It will return the students gender if valid.
    */
    public static String getStudentGender(ArrayList<Student> studentList)
    {
        Scanner scanner = new Scanner(System.in);
        
        String gender = ""; // Initilising gender as a empty string.

        while (!gender.equals("M") && !gender.equals("F"))
        {
            System.out.print("Enter the student gender (M or F): ");
            gender = scanner.nextLine().toUpperCase();

            if (!gender.equals("M") && !gender.equals("F")) // Checks to see if the studets gender is either M or F.
            {
                System.out.println("Invalid gender. Please enter 'M' for male or 'F' for female.");
            }
        }
        // Returns a valid student gender.
        return gender;
    }

//**********************************************************************************************************************************
    
    /*
    This method is used to get the students email and ensures that it follows name.surname@vcconnect.co.za)
    It will return the students gender if valid.
    */
    public static String getStudentEmail(ArrayList<Student> studentList)
    {
        Scanner scanner = new Scanner(System.in);
        
        String email = ""; // Initilising email as a empty string.

        while (true)
        {
            System.out.print("Enter the student email (name.surname@vcconnect.co.za): ");
            email = scanner.nextLine();

            if (email.matches("[A-Za-z]+\\.[A-Za-z]+@vcconnect\\.co\\.za")) //Checks to see if email follows the following requirment (name.surname@vcconnect.co.za).
            {
                break;
            } else
                
            {
                System.out.println("Invalid email. Please enter in the format: name.surname@vcconnect.co.za");
            }
        }
        
        // Returns a valid student email.
        return email;
    }

//**********************************************************************************************************************************
    
    /*
    This method is used to get the students phone number and ensures that it is 10 digits long.
    It will return the students gender if valid.
    */
    public static String getStudentPhoneNumber(ArrayList<Student> studentList)
    {
        Scanner scanner = new Scanner(System.in);
        
        String phoneNumber = "0"; // Initilising phoneNumber as a empty string.


        System.out.print("Enter the student phone number (10 digits): ");
        phoneNumber = scanner.nextLine();

        // Checks to see if the phone number is 10 digits long and only contains numeric digits.
        while (phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) 
        {
            System.out.print("Invalid phone number. Please enter a 10-digit number: ");
            phoneNumber = scanner.nextLine();
        }
        // Returns a valid student phone Number.
        return phoneNumber;
    }

//**********************************************************************************************************************************

    /*
    This method is used to get the students Course and ensures that it is 4 characters long all in uppercase.
    It will return the students gender if valid.
    */
    public static String getStudentCourse(ArrayList<Student> studentList)
    {
        Scanner scanner = new Scanner(System.in);
        
        String course = "";  // Initilising course as a empty string.

        while (true)
        {
            System.out.print("Enter the student course (four-letter code in all caps): ");
            course = scanner.nextLine();

            if (course.matches("[A-Z]{4}")) //Checks to see if the course is 4 chaeacters long and is all Uppercase.
            {
                break; 
            } else
                
            {
                System.out.println("Invalid course format. Please enter a four-letter code in all caps.");
            }
        }
        // Returns a valid student course.
        return course;
    }

//**********************************************************************************************************************************    
    
    //Attribution for Adding to a Array List https://www.geeksforgeeks.org/java-util-arraylist-add-method-java/
    
    //This Method captures the student details and adds it to the ArrayList.
    public void captureStudent(ArrayList<Student> studentList)
    {
        
        //Retriving the students ID, fullname, age, gender, email, phonenumber and course.     
        int ID = getStudentId(studentList);
        String fullName = getStudentFullName(studentList);
        int age = getStudentAge(studentList);
        String gender = getStudentGender(studentList);
        String email = getStudentEmail(studentList);
        String phoneNumber = getStudentPhoneNumber(studentList);
        String course = getStudentCourse(studentList);

        // New object called newStudent is created with the captured student details.
        Student newStudent = new Student();
        
        newStudent.studentId = ID;
        newStudent.studentName = fullName;
        newStudent.studentAge = age;
        newStudent.studentGender = gender;
        newStudent.studentEmail = email;
        newStudent.studentPhoneNum = phoneNumber;
        newStudent.studentCourse = course;
        
        // Adds the newStudent object to the ArrayList.
        studentList.add(newStudent);
        
        System.out.println("Student details have been successfully saved.\n");
    }

//**********************************************************************************************************************************
    
    // This method seraches for a student by their ID and displays their details.
    public void searchStudent(ArrayList<Student> studentList)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter the student ID to search: ");
            int searchId = Integer.parseInt(scanner.nextLine());
            System.out.println("------------------------------------");

            Student foundStudent = null;
            
            // Iterates through the studentList to find a student that matches the searched ID.
            for (Student student : studentList)
            {
                if (student.studentId == searchId)
                {
                    foundStudent = student;
                    break;
                }
            }

            if (foundStudent != null)
            {
                // Displays the student's details from the corresponding student ID.
                System.out.println("STUDENT ID: " + foundStudent.studentId);
                System.out.println("STUDENT FULL NAME: " + foundStudent.studentName);
                System.out.println("STUDENT AGE: " + foundStudent.studentAge);
                System.out.println("STUDENT GENDER: " + foundStudent.studentGender);
                System.out.println("STUDENT EMAIL: " + foundStudent.studentEmail);
                System.out.println("STUDENT PHONE NUMBER: " + foundStudent.studentPhoneNum);
                System.out.println("STUDENT COURSE: " + foundStudent.studentCourse + "\n");
                
                return;
                
            } else
                
            {
                // Displays when student ID can not be found.
                System.out.println("Student with Student ID: " + searchId + " was not found!");
                System.out.println("-------------------------------------");
            }
        }
    }

//********************************************************************************************************************************** 
    
    // This method updates student name, email, phone number and course by specifying a student's ID.
    public void updateStudent(ArrayList<Student> studentList)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter the student ID to update: ");
            int updateId = Integer.parseInt(scanner.nextLine());
            System.out.println("---------------------------------");

            Student foundStudent = null;
            
            // Iterates through the studentList to find a student that matches the searched ID.
            for (Student student : studentList)
            {
                if (student.studentId == updateId)
                {
                    foundStudent = student;
                    break;
                }
            }

            if (foundStudent != null)
            {
                System.out.println("Updating student details for Student ID: " + foundStudent.studentId);

                while (true)
                {
                    // Displays a menu that allows the user to choose what student details they would like to update.
                    System.out.println("Which details would you like to update?");
                    System.out.println("1 - Full Name");
                    System.out.println("2 -  Email");
                    System.out.println("3 - Phone Number");
                    System.out.println("4 - Course");
                    System.out.println("5 - Done updating");
                    int choice = Integer.parseInt(scanner.nextLine());

                    switch (choice)
                    {
                        case 1:
                            // Updates the students name.
                            String fullName = getStudentFullName(studentList);
                            foundStudent.studentName = fullName;
                            break;
                            
                        case 2:
                            // Updates the students email.
                            String email = getStudentEmail(studentList);
                            foundStudent.studentEmail = email;
                            break;
                            
                        case 3:
                            // Updates the students phone number.
                            String phoneNumber = getStudentPhoneNumber(studentList);
                            foundStudent.studentPhoneNum = phoneNumber;
                            break;
                            
                        case 4:
                            // Updates the students course.
                            String course = getStudentCourse(studentList);
                            foundStudent.studentCourse = course;
                            break;
                            
                        case 5:
                            System.out.println("Student details have been successfully updated.\n");
                            return;
                            
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                }
            } else
                
            {
                // Displays when student ID can not be found.
                System.out.println("Student with Student ID: " + updateId + " was not found!");
                System.out.println("------------------------------");
            }
        }
    }

//**********************************************************************************************************************************
    
    //Attribution for Removing from a Array List https://www.geeksforgeeks.org/remove-element-arraylist-java/
    
    // This method deletes a student by their student ID. 
    public void deleteStudent(ArrayList<Student> studentList)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter the student ID to delete: ");
            int deleteId = Integer.parseInt(scanner.nextLine());
            System.out.println("------------------------------");

            Student foundStudent = null;
            
            // Iterates through the studentList to find a student that matches the searched ID.
            for (Student student : studentList)
            {
                if (student.studentId == deleteId)
                {
                    foundStudent = student;
                    break;
                }
            }

            if (foundStudent != null)
            {
                System.out.print("Are you sure you want to delete student " + foundStudent.studentId + " from the system? (Y/N): ");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Y"))
                {
                    // Removes the found student from the ArrayList.
                    studentList.remove(foundStudent);
                    System.out.println("Student with Student Id: " + foundStudent.studentId + " was deleted! \n");
                } else
                    
                {
                    System.out.println("Delete operation canceled.");
                }
                return;
                
            } else
                
            {
                // Displays when student ID can not be found.
                System.out.println("Student with Student ID: " + deleteId + " was not found!");
                System.out.println("----------------------------------");
            }
        }
    }

//**********************************************************************************************************************************
    
    // This method prints all the students in the ArrayList.
    public void printStudentReport(ArrayList<Student> studentList)
    {
        System.out.println("------------------------------");
        System.out.println("STUDENT REPORT");
        System.out.println("------------------------------");
        
        // Iterates through the studentList and displays each students details.
        for (int i = 0; i < studentList.size(); i++)
        {
            Student student = studentList.get(i);
            System.out.println("STUDENT " + (i + 1) + ":");
            System.out.println("------------------------------");
            System.out.println("STUDENT ID: " + student.studentId);
            System.out.println("STUDENT FULL NAME: " + student.studentName);
            System.out.println("STUDENT AGE: " + student.studentAge);
            System.out.println("STUDENT GENDER: " + student.studentGender);
            System.out.println("STUDENT EMAIL: " + student.studentEmail);
            System.out.println("STUDENT PHONE NUMBER:" + student.studentPhoneNum);
            System.out.println("STUDENT COURSE: " + student.studentCourse);
            System.out.println("------------------------------\n");
        }
    }

//**********************************************************************************************************************************
    
    // This method exits the student application.
    public void ExitStudentApplication()
    {
        System.out.println("Exiting Student Application. Goodbye.");
        
        // Terminates the application.
        System.exit(0);
    }
}
//ST10281011 Akhilesh Parshotam