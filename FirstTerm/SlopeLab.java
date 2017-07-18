//Eric Guan, 10/4/14, period 3
import java.util.Scanner;
import java.text.DecimalFormat;
public class SlopeLab

{
   public static void main (String [] args)
   {
      Scanner console = new Scanner (System.in);
      System.out.print("Enter the coordinates of point 1 (x, y): ");
      int a = console.nextInt(), b = console.nextInt();
      System.out.print("Enter the coordinates of point 2 (x, y): ");
      int c = console.nextInt(), d = console.nextInt();
      if (a == c && b == d){
         System.out.println("Alert! These are the same point");
      }
      else if (b == d){
         System.out.println("Alert! The line is horizontal");
      }
      else if (a == c){
         System.out.println("Alert! The line is vertical");
      } 
      else if (a != c && b !=d){
         double k = (double) (d-b)/(c-a);
      
         System.out.print(k);
        
      }
                  
   }
}
/**************
----jGRASP exec: java SlopeLab
 
 Enter the coordinates of point 1 (x, y): 3 6
 Enter the coordinates of point 2 (x, y): 2 6
 Alert! The line is horizontal
 
  ----jGRASP: operation complete.
  ----jGRASP exec: java SlopeLab
 
 Enter the coordinates of point 1 (x, y): 1 4
 Enter the coordinates of point 2 (x, y): 1 3
 Alert! The line is vertical
 
  ----jGRASP: operation complete.
   ----jGRASP exec: java SlopeLab
 
 Enter the coordinates of point 1 (x, y): 3 6
 Enter the coordinates of point 2 (x, y): 3 6
 Alert! These are the same point
 
  ----jGRASP: operation complete.
----jGRASP exec: java SlopeLab
 
 Enter the coordinates of point 1 (x, y): 2 1
 Enter the coordinates of point 2 (x, y): 4 4
 1.5
  ----jGRASP: operation complete.


  ***********************/
