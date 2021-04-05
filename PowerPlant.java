/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ECMA;

import java.util.Scanner;

/**
 *
 * @author Mr
 */
public class PowerPlant implements IPowerPlant {
double profitamount;
double totalpowercapacity;
double productioncostper;
double totalEBill;
Scanner input = new Scanner(System.in);

    @Override
    public void setPowerplant() {
     System.out.println("Enter Total Power Capacity:");
     totalpowercapacity = input.nextDouble();
     System.out.println("Enter Total Production Cost:");
     productioncostper = input.nextDouble();
     System.out.println("Enter Total Bill For CUstomer:");
     totalEBill = input.nextDouble();
     input.nextLine();
  
    }

    @Override
    public void PrintPowerplant() {
        profitamount= totalpowercapacity*productioncostper- totalEBill;
             System.out.println("Profit Amount =:"+profitamount);

    }
    
}
