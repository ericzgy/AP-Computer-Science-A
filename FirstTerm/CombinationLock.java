//Eric Guan, 10/4/14, period 3
import java.util.Scanner;
import java.text.DecimalFormat;
public class CombinationLock

{
   public static void main (String [] args)
   {
   
      int first,second, third;
      first = (int)(Math.random() * 50 +1);
      second = (int)(Math.random() * 50 +1);
      third = (int)(Math.random() * 50 +1);
      System.out.println(first + "," + second  + "," + third);
      System.out.println("It is " + theLockIsOpen (first, second, third) + " that the lock is open.");
   
   }
   public static boolean theLockIsOpen (int num1, int num2, int num3 )
   {
      Scanner console = new Scanner (System.in);
      boolean third = false;
      boolean second = false;
      boolean first = false;
      System.out.print("Enter the first guess: ");
      int a = console.nextInt();
      System.out.print("Enter the second guess: ");
      int b = console.nextInt();
      System.out.print("Enter the third guess: ");
      int c = console.nextInt();
      if(Math.abs(a-num1)<=3)
      
         first =  true;
     
      
      if(Math.abs(b-num2)<=3)
      
         second = true;
      
   
      
      if( Math.abs(c-num3)<=3)
      
         third = true;
      if(first == true && second == true && third == true)
         return true;
      return false;
      
   }
}

/*********
  ----jGRASP exec: java CombinationLock
 
 8,8,29
 Enter the first guess: 8
 Enter the second guess: 8
 Enter the third guess: 25
 It is false that the lock is open.
 
  ----jGRASP: operation complete.
   ----jGRASP exec: java CombinationLock
 
 18,21,12
 Enter the first guess: 18
 Enter the second guess: 18
 Enter the third guess: 15
 It is true that the lock is open.
 
  ----jGRASP: operation complete.
----jGRASP exec: java CombinationLock
 
 7,12,13
 Enter the first guess: 4
 Enter the second guess: 15
 Enter the third guess: 10
 It is true that the lock is open.
 
  ----jGRASP: operation complete.
 
  **********/
