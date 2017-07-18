//Eric Guan, 9/2/14, 3rd Period
import java.util.Scanner;

public class Average

{
   public static void main(String args[])
   {
      Scanner console = new Scanner (System.in);
     
      int one = console.nextInt();
      int two = console.nextInt();
      int three = console.nextInt();
      int average;
      System.out.print("Average: ");
      System.out.println((one+two+three)/3.0);
        } 
}
 
  /*----jGRASP exec: java Average
 
 3
 5
 6
 Average: 4.666666666666667
 
  ----jGRASP: operation complete.*/
 