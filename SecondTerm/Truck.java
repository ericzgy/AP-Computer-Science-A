//Eric Guan, 11/20/14, 3rd Period
import java.util.Scanner;
public class Truck extends Vehicle
{
   private double loadCapacity;
   private int towingCapacity;
   public Truck()
   {
      super();
      setName("Ford");
      setCylinders(6);
      setOwner(new Person("Lau", 28));
      loadCapacity = 12;
      towingCapacity = 21;
   }
   public Truck(String a, int b, Person c, double d, int e)
   {
      super();
      setName(a);
      setCylinders(b);
      setOwner(c);
      loadCapacity = d;
      towingCapacity = e;
   }
   public double getLoadCapacity()
   {
      return loadCapacity;
   }
   public int getTowingCapacity()
   {
      return towingCapacity;
   }
   public String toString()
   {
      return super.toString() + "\nLoad Capacity: " + loadCapacity + "\nTowing Capacity: " + towingCapacity;
   }
   public boolean equals(Truck other)
   {
      return super.equals(other) && this.loadCapacity == other.loadCapacity && this.towingCapacity == other.towingCapacity;
   }
   public static void main (String [] args)
   {
      Truck joe = new Truck("Chevy", 8, new Person("Batman", 29), 12.5, 90);
      System.out.println(joe); 
      Truck hi = new Truck(); 
      System.out.println(joe.equals(hi));
      System.out.println();      
      Vehicle test = new Vehicle();
      Vehicle test2 = new Vehicle("Mazda", 5, new Person("Eric", 15));
      Vehicle test3 = new Vehicle("Mazda", 5, new Person("Eric", 15));
      System.out.println(test2);
      System.out.println(test.equals(test2));
      System.out.println(test2 == test3);
      System.out.println(test2.equals(test3));
   } 

}
/*

  ----jGRASP exec: java Truck
 
 Name: Batman
 Age: 29
 Car: Chevy
 Cylinders: 8
 Load Capacity: 12.5
 Towing Capacity: 90
 false
 
 Name: Eric
 Age: 15
 Car: Mazda
 Cylinders: 5
 false
 false
 true
 
  ----jGRASP: operation complete.
*/