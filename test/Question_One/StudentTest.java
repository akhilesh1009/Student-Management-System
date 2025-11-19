//ST10281011 Akhilesh Parshotam
package Question_One;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import org.junit.Before;

/**
 *
 * @author ST10281011 Akhilesh Parshotam
 */
public class StudentTest
{
    private ArrayList<Student> studentList;
    
//**********************************************************************************************************************************
    
    private Student createStudent(int studentId, String studentName, int studentAge, String studentGender, String studentEmail, 
                                    String studentPhoneNum, String studentCourse)
    {
        Student student = new Student();
        student.studentId = studentId;
        student.studentName = studentName;
        student.studentAge = studentAge;
        student.studentGender = studentGender;
        student.studentEmail = studentEmail;
        student.studentPhoneNum = studentPhoneNum;
        student.studentCourse = studentCourse;
        return student;
    }

//**********************************************************************************************************************************
    
    @Before
    public void setUp()
    {
        studentList = new ArrayList<>();
    }

//**********************************************************************************************************************************
    
    /**
     * Test of getStudentId method, of class Student.
     */
    @Test
    public void testGetStudentId()
    {
        String input = "12340\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int id = Student.getStudentId(studentList);
        System.setIn(System.in);
        assertEquals(12340, id);
    }
 
//**********************************************************************************************************************************
    
    /**
     * Test of getStudentFullName method, of class Student.
     */
    @Test
    public void testGetStudentFullName()
    {
        String inputFirstName = "Akhilesh\n";
        String inputLastName = "Parshotam\n";
        InputStream in = new ByteArrayInputStream((inputFirstName + inputLastName).getBytes());
        System.setIn(in);
        String fullName = Student.getStudentFullName(studentList);
        System.setIn(System.in);
        String expectedFullName = "Akhilesh Parshotam";
        assertEquals(expectedFullName, fullName);
    }
    
//**********************************************************************************************************************************
    
    /**
     * Test of getStudentAge method, of class Student.
     */
    @Test
    public void testStudentAgeValid()
    {
        String inputAge = "18\n";
        InputStream in = new ByteArrayInputStream(inputAge.getBytes());
        System.setIn(in);
        int age = Student.getStudentAge(studentList);
        System.setIn(System.in);
        assertEquals(18, age);
    }

//**********************************************************************************************************************************
    
    /**
     * Test of getStudentAge method, of class Student.
     */
    @Test
    public void testStudentAgeInvalid()
    {
        ByteArrayInputStream in = new ByteArrayInputStream("15\n20\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int age = Student.getStudentAge(new ArrayList<>());
        assertEquals(20, age);
    }

//**********************************************************************************************************************************
    
    /**
     * Test of getStudentAge method, of class Student.
     */
    @Test
    public void testStudentAgeInvalidCharacter()
    {
        ByteArrayInputStream in = new ByteArrayInputStream("one\n21\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int age = Student.getStudentAge(new ArrayList<>());
        assertEquals(21, age);
    }

//**********************************************************************************************************************************
    
    /**
     * Test of getStudentGender method, of class Student.
     */
    @Test
    public void testGetStudentGender()
    {
        String inputMale = "M\n";
        InputStream inMale = new ByteArrayInputStream(inputMale.getBytes());
        System.setIn(inMale);

        String genderMale = Student.getStudentGender(studentList);
        System.setIn(System.in);
        assertEquals("M", genderMale);
    }

//**********************************************************************************************************************************
    
    /**
     * Test of getStudentEmail method, of class Student.
     */
    @Test
    public void testGetStudentEmail()
    {
        String validEmail = "akhilesh.parshotam@vcconnect.co.za\n";
        InputStream inValidEmail = new ByteArrayInputStream(validEmail.getBytes());
        System.setIn(inValidEmail);

        String email = Student.getStudentEmail(studentList);
        System.setIn(System.in);
        assertEquals("akhilesh.parshotam@vcconnect.co.za", email);
    }

//**********************************************************************************************************************************
    
    /**
     * Test of getStudentPhoneNumber method, of class Student.
     */
    @Test
    public void testGetStudentPhoneNumber()
    {
        String validPhoneNumber = "1234567890\n";
        InputStream inValidPhoneNumber = new ByteArrayInputStream(validPhoneNumber.getBytes());
        System.setIn(inValidPhoneNumber);

        String phoneNumber = Student.getStudentPhoneNumber(studentList);
        System.setIn(System.in);
        assertEquals("1234567890", phoneNumber);
    }

//**********************************************************************************************************************************
    
    /**
     * Test of getStudentCourse method, of class Student.
     */
    @Test
    public void testGetStudentCourse()
    {
        String validCourse = "COMP\n";
        InputStream inValidCourse = new ByteArrayInputStream(validCourse.getBytes());
        System.setIn(inValidCourse);

        String course = Student.getStudentCourse(studentList);

        System.setIn(System.in);
        assertEquals("COMP", course);
    }
 
//**********************************************************************************************************************************
    
    /**
     * Test of searchStudent method, of class Student.
     */
    @Test
    public void testSearchStudent()
    {
        Student student = new Student();
        student.studentId = 12340;
        student.studentName = "Akhilesh Parshotam";
        studentList.add(student);
        String inputSearch = "12340\n";
        InputStream inSearch = new ByteArrayInputStream(inputSearch.getBytes());
        System.setIn(inSearch);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        Student studentInstance = new Student();
        studentInstance.searchStudent(studentList);
        System.setIn(System.in);
        System.setOut(originalOut);
        assertTrue(outContent.toString().contains("STUDENT ID: 12340"));
    }

//**********************************************************************************************************************************
    
    /**
     * Test of searchStudent method, of class Student.
     */
    @Test
    public void testSearchStudent_NotFound()
    {
        Student student1 = createStudent(10280, "Akhilesh Parshotam", 20, "M", "akhi.parshotam@vcconnect.co.za", "0678964324", "COMP");
        Student student2 = createStudent(10270, "Lee Macky", 25, "F", "Lee.Macky@vcconnect.co.za", "0734528765", "SCIC");
        studentList.add(student1);
        studentList.add(student2);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String input = "10280\n28730";
        InputStream fakeInput = new ByteArrayInputStream(input.getBytes());
        System.setIn(fakeInput);
        Student studentInstance = new Student();
        studentInstance.searchStudent(studentList);
        System.setIn(System.in);
        System.setOut(System.out);
    }

//**********************************************************************************************************************************
    
    /**
     * Test of deleteStudent method, of class Student.
     */
    @Test
    public void testDeleteStudent()
    {
        Student student = new Student();
        student.studentId = 12340;
        student.studentName = "Akhilesh Parshotam";
        studentList.add(student);

        String inputDelete = "12340\nY\n";
        InputStream inDelete = new ByteArrayInputStream(inputDelete.getBytes());
        System.setIn(inDelete);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        Student studentInstance = new Student();
        studentInstance.deleteStudent(studentList);
        System.setIn(System.in);
        System.setOut(originalOut);
        assertTrue(outContent.toString().contains("Student with Student Id: 12340 was deleted!"));
    }

//**********************************************************************************************************************************
    
    /**
     * Test of deleteStudent method, of class Student.
     */
    @Test
    public void testDelete_StudentNotFound()
    {

        Student student1 = createStudent(10280, "Akhi Parshotam", 20, "M", "akhi.parshotam@vcconnect.co.za", "0678964324", "COMP");
        Student student2 = createStudent(10270, "Lee Macky", 25, "F", "Lee.Macky@vcconnect.co.za", "0734528765", "SCIC");
        studentList.add(student1);
        studentList.add(student2);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String input = "10280\ny\n23450";
        InputStream fakeInput = new ByteArrayInputStream(input.getBytes());
        System.setIn(fakeInput);
        Student studentInstance = new Student();
        studentInstance.searchStudent(studentList);
        System.setIn(System.in);
        System.setOut(System.out);
    }
}
//ST10281011 Akhilesh Parshotam
