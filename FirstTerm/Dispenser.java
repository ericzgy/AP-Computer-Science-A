//Eric Guan, 9/13/14, 3rd Period
import java.util.Scanner;

public class Dispenser

{
   public static void main(String args[])
   {
      Scanner console = new Scanner (System.in);
     
      System.out.println("Enter price of item");
      int one = console.nextInt();
      System.out.println();
      System.out.println("You bought an item for " + one + " cents and gave me a dollar,");
      System.out.println("so your change is:");
      System.out.println();
      System.out.println(one/25 + " quarters,");
      System.out.println(one%25/10 + " dimes, and");
      System.out.println(one%25%10/5 + " nickel(s).");
      
     
      
          
 /*Enter price of item
 90
 
 You bought an item for 90 cents and gave me a dollar,
 so your change is:
 
 3 quarters,
 1 dimes, and
 1 nickel(s).*/
 
 /*Enter price of item
 100
 
 You bought an item for 100 cents and gave me a dollar,
 so your change is:
 
 4 quarters,
 0 dimes, and
 0 nickel(s).*/
 
 /*Enter price of item
 10
 
 You bought an item for 10 cents and gave me a dollar,
 so your change is:
 
 0 quarters,
 1 dimes, and
 0 nickel(s).*/
 /*Enter price of item
 0
 
 You bought an item for 0 cents and gave me a dollar,
 so your change is:
 
 0 quarters,
 0 dimes, and
 0 nickel(s).*/
/*Enter price of item
 5
 
 You bought an item for 5 cents and gave me a dollar,
 so your change is:
 
 0 quarters,
 0 dimes, and
 1 nickel(s).*/
  /*Enter price of item
 25
 
 You bought an item for 25 cents and gave me a dollar,
 so your change is:
 
 1 quarters,
 0 dimes, and
 0 nickel(s).*/
   } 
}
