//Eric Guan, 10/14/14, 3rd Period
import java.util.Scanner;

public class Euclid
{
   public static void main(String args[])
   {
      Scanner console = new Scanner (System.in);
      System.out.print("Enter the value of the first number: ");
      int a = console.nextInt();
      System.out.print("Enter the value of the first number: ");
      int b = console.nextInt();
      System.out.println();
      getGcd(a, b);
   }
   public static int getGcd(int x, int y)
   {
      while (y != 0) {
         final int r = x % y;
         System.out.println("The remainder is " + r);
         x = y;
         System.out.println("The new larger number is " + x);
         y = r;
         System.out.println("the new smaller number is "+ y);
         System.out.println();
      }
      System.out.print("The greatest common factor is " + x);
      return x;
   }


}

/***************************************
 ----jGRASP exec: java Euclid
 
 Enter the value of the first number: 20
 Enter the value of the first number: 50
 
 The remainder is 20
 The new larger number is 50
 the new smaller number is 20
 
 The remainder is 10
 The new larger number is 20
 the new smaller number is 10
 
 The remainder is 0
 The new larger number is 10
 the new smaller number is 0
 
 The greatest common factor is 10
  ----jGRASP: operation complete.
  ----jGRASP exec: java Euclid
 
 Enter the value of the first number: 30
 Enter the value of the first number: 61
 
 The remainder is 30
 The new larger number is 61
 the new smaller number is 30
 
 The remainder is 1
 The new larger number is 30
 the new smaller number is 1
 
 The remainder is 0
 The new larger number is 1
 the new smaller number is 0
 
 The greatest common factor is 1
  ----jGRASP: operation complete.
    ----jGRASP exec: java Euclid
 
 Enter the value of the first number: 90
 Enter the value of the first number: 60
 
 The remainder is 30
 The new larger number is 60
 the new smaller number is 30
 
 The remainder is 0
 The new larger number is 30
 the new smaller number is 0
 
 The greatest common factor is 30
  ----jGRASP: operation complete.
  **********************************/
