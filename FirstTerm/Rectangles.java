//Eric Guan, 9/2/14, 3rd Period
import java.util.Scanner;

public class Rectangles

{
   public static void main(String args[])
   {
      Scanner console = new Scanner (System.in);
     
      int width = console.nextInt();
      int height = console.nextInt();
      //prompts user for height and width
      int area, perimeter; //creates area and perimeter
      System.out.print("The rectangle's area is ");
      System.out.println(width*height);
      System.out.print("The rectangle's perimeter is ");
      System.out.println((width*2) + (height*2));
   } 
}