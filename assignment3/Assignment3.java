
package assignment3;

/**
 *1.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
 * Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
 * @author SHUBHAM
 */
 class Student{
  String name;
  int roll_no;
}
public class Assignment3 {
    public static void main(String[] args) {
        
    Student s = new Student();
    s.name = "John";
    s.roll_no = 2;
    System.out.println("Name is "+s.name+" and roll number is "+s.roll_no);
  }
  }
    

