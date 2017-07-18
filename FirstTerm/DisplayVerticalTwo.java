//Eric Guan, 9/2/14, 3rd Period
import java.util.Scanner;

public class DisplayVerticalTwo

{
   public static void main(String args[])
   {
      Scanner console = new Scanner (System.in);
     
      int one = console.nextInt();
      System.out.println(one/1000);
      System.out.println(one/100%10);
      System.out.println(one%100/10);
      System.out.println(one%10);
}
}
