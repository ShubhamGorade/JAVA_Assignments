
package assignment3;

/**
 *Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'.
 * @author SHUBHAM
 */
 class Employee{
    private final String name;
    private final String address;
    private final int year;
    private final int salary;
  public Employee(String n, int y, int sal, String add){
    name = n;
    year = y;
    salary = sal;
    address = add;
  }
  public String getName(){
    return name;
  }
  public int getYear(){
    return year;
  }
  public int getSalary(){
    return salary;
  }
  public String getAddress(){
    return address;
  }
}

class Emp{
  public static void main(String[] args){
    Employee e1 = new Employee("Robert", 1994, 500000, "64C- WallsStreet");
    Employee e2 = new Employee("Sam", 2000, 740000, "68d- WallsStreet");
    Employee e3 = new Employee("John", 1999, 600000, "26B- WallsStreet");
    System.out.println("Name\tYear of joining\t\tSalary\t\t Address");
    System.out.println(e1.getName()+"\t\t"+e1.getYear()+"\t\t"+e1.getSalary()+"\t\t"+e1.getAddress());  
    System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t"+e2.getSalary()+"\t\t"+e2.getAddress());  
    System.out.println(e3.getName()+"\t\t"+e3.getYear()+"\t\t"+e3.getSalary()+"\t\t"+e3.getAddress());  
  }
} 

