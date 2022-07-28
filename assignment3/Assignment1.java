
package assignment3;

/**
 *2.Assign and print the roll number, phone number and address of two students having names "Sam" and "John"
 * respectively by creating two objects of class 'Student'.
 * @author SHUBHAM
 */
 class Student1{
  String name;
  int roll_no;
  long phone_no;
  String address;
}
public class Assignment1 {
    public static void main(String[] args) {
        
    Student1 s1 = new Student1();
    Student1 s2 = new Student1();
    s1.name = "Sam";
    s1.roll_no = 2;
    s1.phone_no = 999445601;
    s1.address = "Pune";
    
     s2.name = "John";
    s2.roll_no = 5;
    s2.phone_no = 88932901;
    s2.address="Nashik";
    
    System.out.println("Name is "+s1.name+" roll number is "+s1.roll_no+" whose phone number is "+s1.phone_no+" and address is "+s1.address+" ..!");    
    System.out.println("Name is "+s2.name+" roll number is "+s2.roll_no+" whose phone number is "+s2.phone_no+" and address is "+s2.address+" ..!");
  }
  }
    
