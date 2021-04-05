
 
package ECMA;

import java.util.Scanner;

 
 
public class Main {

     
    public static void main(String[] args) {
        PowerPlant obj3 = new PowerPlant();
        obj3.setPowerplant();
        obj3.PrintPowerplant();
    Consumer  obj1 = new Consumer();
obj1.setConsumer();
System.out.println("Enter Consumer type-For Monthly=1 press & For Yearly=2 Press");
Scanner input = new Scanner(System.in);
int type = input.nextInt();
obj1.MonthPowerUnit(type);
obj1.CalculateTaka();
obj1.printConsumer();
System.out.println("Employee Information who related for obj1");
Employee obj2 = new Employee();
obj2.setEmployee();
obj2.PrintEmployee();
    
        
    }
    
}
