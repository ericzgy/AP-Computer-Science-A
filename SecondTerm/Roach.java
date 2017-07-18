//Eric Guan, 11/18/14, 3rd Period
import java.util.Scanner;
public class Roach
{
   private double population;
   private double x;
   public Roach (int a)
   {
      this.population = a;
   }
   public double spray()
   {
      population -=(0.1*population);
      return population;
   }
   public double waitForDoubling()
   {
      population = population*2;
      return population;
   }
   public double getRoaches()
   {
      return population;
   }
   public String toString()
   {
      return "\nThe Population is: " + population;
   }
   public static void main (String [] args)
   {
      Roach  kitchen = new Roach(10);
   
           // repeat 3 times the following
      for (int  k = 1; k <= 3; k++)
      {
         kitchen.waitForDoubling();
         kitchen.spray();
         System.out.println (kitchen);
      }
   }  // main
}  // TestRoach

/********
 ----jGRASP exec: java Roach
 
 
 The Population is: 18.0
 
 The Population is: 32.4
 
 The Population is: 58.31999999999999
 
  ----jGRASP: operation complete.
 ******/