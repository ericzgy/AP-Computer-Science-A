//Eric Guan, 11/14/14, 3rd Period
import java.util.Scanner;
public class Dice
{
   private  int side;
   public Dice()
   {
      side = (int)(Math.random() * 6+1);
   }
   public int getSide()
   {
      return side;
   }
   public void roll()
   {
      side = (int)(Math.random() * 6+1);
   }
   public static void main (String [] args)
   {
      Dice   d = new Dice ();
   
      System.out.println (d.getSide());  // display the side 
                                                  // facing upward
      for (int   k = 1; k <= 5; k++)
      {
         d.roll();                          // simulate rolling a dice
         System.out.println ("\nCurrent side:  " + d.getSide());
      }
   }  // main

}
/*******************
 ----jGRASP exec: java Dice
 
 3
 
 Current side:  2
 
 Current side:  6
 
 Current side:  4
 
 Current side:  5
 
 Current side:  5
 
  ----jGRASP: operation complete.

**************************/