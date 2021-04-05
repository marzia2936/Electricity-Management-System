package ECMA;
import java.util.Scanner;

public class Employee implements IEmployee {
Scanner input = new Scanner(System.in);
  String id;
  String name;
  String location;
  String powerplantName;


    @Override
    public void setEmployee() {
     System.out.println("Enter Employee ID:");
    id= input.nextLine();
    System.out.println("Enter  Employee Name:");
    name = input.nextLine();    
    System.out.println("Enter Employee Location:");
    location = input.nextLine();
    System.out.println("Enter Employee Powerplant Name where she/he Work:");
    powerplantName = input.nextLine();   
    }

    @Override
    public void PrintEmployee() {
        System.out.println("Employee ID="+id);
    System.out.println("Employee Name="+name);
    System.out.println("Employee Location="+location);
    System.out.println("Consumer powerplant Name Where she/he work="+powerplantName);
        
        
    }
    
}
