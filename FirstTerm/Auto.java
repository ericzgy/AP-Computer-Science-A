//Eric Guan, 10/25/14, period 3
import java.util.Scanner;
public class Auto

{
   public static void main (String [] args)
   {
      Scanner console = new Scanner (System.in);
      System.out.print("How many gallons in the tank? ");
      double gas = console.nextDouble();
      System.out.println("All right, here we go.");
      System.out.println();
      maintenance(gas);
   }
   public static void maintenance(double n)
   {
      Scanner a = new Scanner (System.in);
      int d = (int) n;
      if(n-d != 0)
      {
         System.out.println(n + " gallons remain.");
      }
      else
      {
         System.out.println(d + " gallons remain.");
      }
      System.out.print("How many miles to travel? ");
      int k = a.nextInt();
      while (k <= 0)
      {
         System.out.print("How many miles to travel? ");
         k = a.nextInt();
      }
      while (n > 0)
      {
         System.out.println();
         double x = k/12.0;
         n = n-x;
         if (n <= 0)
         {
            System.out.println();
            System.out.print("Out of gas! ");
            break;
         }
         int j = (int) n;
         if(n-j != 0)
         {
            System.out.print(n + " gallon(s) remain. ");
         }
         else
         {
            System.out.print(j + " gallon(s) remain. ");
         }
         if(n <= 5)
         {
            System.out.println("Time to refuel!");
         }
         else
         {
            System.out.println();
         }
         System.out.print("How many miles to travel? ");
         k = a.nextInt();
         while (k <= 0)
         {
            System.out.print("How many miles to travel? ");
            k = a.nextInt();
         }
      
      }
   }
}



/**********
----jGRASP exec: java Auto
 
 How many gallons in the tank? 10
 All right, here we go.
 
 10 gallons remain.
 How many miles to travel? 12
 
 9 gallon(s) remain. 
 How many miles to travel? -100
 How many miles to travel? 0
 How many miles to travel? 54
 
 4.5 gallon(s) remain. Time to refuel!
 How many miles to travel? 12
 
 3.5 gallon(s) remain. Time to refuel!
 How many miles to travel? 60
 
 
 Out of gas! 
  ----jGRASP: operation complete.
  
  ----jGRASP exec: java Auto
 
 How many gallons in the tank? 5
 All right, here we go.
 
 5 gallons remain.
 How many miles to travel? 36
 
 2 gallon(s) remain. Time to refuel!
 How many miles to travel? 12
 
 1 gallon(s) remain. Time to refuel!
 How many miles to travel? 12
 
 
 Out of gas! 
  ----jGRASP: operation complete.
 ----jGRASP exec: java Auto
 
 How many gallons in the tank? 15
 All right, here we go.
 
 15 gallons remain.
 How many miles to travel? 66
 
 9.5 gallon(s) remain. 
 How many miles to travel? 66
 
 4 gallon(s) remain. Time to refuel!
 How many miles to travel? 48
 
 
 Out of gas! 
  ----jGRASP: operation complete.
      ----jGRASP exec: java Auto
 
 How many gallons in the tank? 14.2
 All right, here we go.
 
 14.2 gallons remain.
 How many miles to travel? 72
 
 8.2 gallon(s) remain. 
 How many miles to travel? 66
 
 2.6999999999999993 gallon(s) remain. Time to refuel!
 How many miles to travel? 48
 
 
 Out of gas! 
  ----jGRASP: operation complete.
**********/