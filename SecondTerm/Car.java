//Eric Guan, 11/12/14, 3rd Period
import java.util.Scanner;
public class Car
{
   private String make;
   private int year;
   private double mileage, cost;
   public Car ()
   {
      this.make = "Honda";
      this.year = 2014; 
      this.mileage = 200.0;
      this.cost = 25000.0;
   }
   public Car(String a, int b, double c, double d)
   {
      this.make = a;
      this.year = b;
      this.mileage = c;
      this.cost = d;
   }
   public String toString()
   {
      return "\nMake: " + make + "\nYear: " + year + "\nMileage: " + mileage + "\nCost: " + cost;
   }
   public static void main (String [] args)
   {
      Car joe = new Car();
      Car desk = new Car("Chevy", 1962, 0, 100000);
      System.out.println(joe);
      System.out.println(desk);
   
   }
}

/****************
 ----jGRASP exec: java Car
 
 
 Make: Honda
 Year: 2014
 Mileage: 200.0
 Cost: 25000.0
 
 Make: Chevy
 Year: 1962
 Mileage: 0.0
 Cost: 100000.0
 
  ----jGRASP: operation complete.
 ****************/