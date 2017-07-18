//Eric Guan, 10/1/14, period 3
import java.util.Scanner;
public class DivisionProgram

{
   public static void main (String [] args)
   {
      Scanner console = new Scanner (System.in);
      System.out.print("Enter the first number: ");
      int a = console.nextInt();
      System.out.print("Enter the second number: ");
      int b = console.nextInt();
      divide(a,b);
   
   }
   public static void divide (int x, int y)
   {
      if(x-y == 0){
         System.out.println("1");
      }
      else if (x-y<0)
      {
         System.out.println(y/x + " remainder of " + y%x);
      }
      else if (y-x<0)
      {
         System.out.println(x/y + " remainder of " + x%y);
      }
   }
}

 /***********
 ----jGRASP exec: java DivisionProgram
 
 Enter the first number: 80
 Enter the second number: 3
 26 remainder of 2
 
  ----jGRASP: operation complete.
   ----jGRASP exec: java DivisionProgram
 
 Enter the first number: 3
 Enter the second number: 80
 26 remainder of 2
 
  ----jGRASP: operation complete.

  ----jGRASP exec: java DivisionProgram
 
 Enter the first number: 2
 Enter the second number: 98
 49 remainder of 0
 
  ----jGRASP: operation complete.

  ****************************/
