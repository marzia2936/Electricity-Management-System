package ECMA;
import java.util.Scanner;
 public class Consumer implements IConsumer {
Scanner input = new Scanner(System.in);

  String id;
  String name;
  String location;
  String powerplantName;
  double MonthUpowerUnit;
  double TotalBill;
  double taka;
  
    @Override
    public void setConsumer() {
    System.out.println("Enter Consumer ID:");
    id= input.nextLine();
    System.out.println("Enter  Consumer Name:");
    name = input.nextLine();    
    System.out.println("Enter Consumer Location:");
    location = input.nextLine();
    System.out.println("Enter Consumer Powerplant Name:");
    powerplantName = input.nextLine();
    System.out.println("Enter Consumer Monthly Used Power Unit:");
    MonthUpowerUnit = input.nextDouble();
    }

    @Override
    public void printConsumer() {
    System.out.println("Consumer ID="+id);
    System.out.println("Consumer Name="+name);
    System.out.println("Consumer Location="+location);
    System.out.println("Consumer powerplant Name="+powerplantName);
    System.out.println("Consumer Uses Monthly Power Unit="+MonthUpowerUnit);
    System.out.println("Consumer  Total Electricity Bill="+taka);

        
    }
     
         
      

    
    public double MonthPowerUnit( int Type) {
    int typeConsumer = 0;
          if(typeConsumer==1)
                   {
                 MonthUpowerUnit=(MonthUpowerUnit*2)/100;
         }
              else{
                  MonthUpowerUnit = (MonthUpowerUnit*3)/100;
              }
             return MonthUpowerUnit;  
    }

    public double CalculateTaka(){
         taka = MonthUpowerUnit*80;
    return taka;
        
    } 
}
