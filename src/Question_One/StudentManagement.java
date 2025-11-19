//ST10281011 Akhilesh Parshotam
package Question_One;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ST10281011 Akhilesh Parshotam
 */

public class StudentManagement
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> Students = new ArrayList<>();

        // New object called application created.
        Student application = new Student();

        // Displaying the title for the application.
        System.out.println("*******************************");
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("*******************************");

        while (true)
        {
            // Displaying the main menu.
            System.out.println("Enter 1 to launch menu or any other key to exit application");
            System.out.println("------------------------------------------------------------");
            String mainmenu = scan.nextLine();

            int choice;

            // Checks if the user enterd '1' to open the secondary menu.
            if (mainmenu.equals("1"))
            {
                do
                {
                    // Displaying the main menu.
                    System.out.println("Please select one of the menu options:");
                    System.out.println("1 - Capture a new student.");
                    System.out.println("2 - Search for a student.");
                    System.out.println("3 - Delete a student.");
                    System.out.println("4 - Update student details.");
                    System.out.println("5 - Print student report.");
                    System.out.println("6 - Exit Application.");

                    choice = Integer.parseInt(scan.nextLine());

                    /*
                    Switch statements thats asks the user if they want to Capture a new student, Search for a student, 
                    Delete a student, Update student details, Print student report or Exit the Application.
                     */
                    switch (choice)
                    {
                        case 1:
                            System.out.println("**********************");
                            System.out.println("CAPTURE A NEW STUDENT");
                            System.out.println("**********************");

                            // Calling the captureStudent method from the Student Class using the object.
                            application.captureStudent(Students);
                            break;

                        case 2:
                            // Calling the searchStudent method from the Student Class using the object.
                            application.searchStudent(Students);
                            break;

                        case 3:
                            // Calling the deleteStudent method from the Student Class using the object.
                            application.deleteStudent(Students);
                            break;

                        case 4:
                            // Calling the updateStudent method from the Student Class using the object.
                            application.updateStudent(Students);
                            break;

                        case 5:
                            // Calling the printStudentReport method from the Student Class using the object.
                            application.printStudentReport(Students);
                            break;

                        case 6:
                            System.out.println("Returning to main menu. \n");
                            break;

                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                } 
                // Will only return to the main menu when '6' is selected.
                while (choice != 6);
            } 
            else
            {
                // Calling the printStudentReport method from the Student Class using the object.
                application.ExitStudentApplication();
                break;
            }
        }
    }
}
//ST10281011 Akhilesh Parshotam
