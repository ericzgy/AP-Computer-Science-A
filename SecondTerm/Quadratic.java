//Eric Guan, 11/14/14, 3rd Period
import java.util.Scanner;
public class Quadratic
{
   private int a, b, c;
   private double x, y, k;
   public Quadratic (int a, int b, int c)
   {
      this.a = a;
      this.b = b;
      this.c = c;
   }
   public double getSolution1()
   {
      k = Math.sqrt(b*b-4*a*c);
      x = (-b+k)/2*a;
      return x;
   }
   public double getSolution2()
   {
      k = Math.sqrt((b*b)-4*a*c);
      y = (-b-k)/2*a;
      return y;
   }
   public boolean noSolution()
   {
      double w = b*b-4*a*c;
      if(w < 0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   public boolean equalRoots(Quadratic a)
   {
      if(a.getSolution1() == a.getSolution2())
      
         return true;
      
      else
      
         return false;
      
   }
   public static void main (String [] args)
   {
      Scanner input = new Scanner (System.in);
   
      for (int k = 1; k <= 3; k++)
      {
         System.out.print("Enter a, b, and c: ");
         int  a = input.nextInt();
         int  b = input.nextInt();
         int  c = input.nextInt();
      
         Quadratic q = new Quadratic (a,b,c);
      
         if (q.noSolution() == true)
            System.out.println ("No real solutions.");
         else if (q.equalRoots(q) == true)
            System.out.println ("The only solution is: " +      
                                   q.getSolution1());
         else
         {
            System.out.println("The two real solutions are: ");
            System.out.println(q.getSolution1());
            System.out.println(q.getSolution2());
         }  // else
      } // for
   }  // main

}


/**************************************************************************
 ----jGRASP exec: java Quadratic
 
 Enter a, b, and c: 2
 5
 3
 The two real solutions are: 
 -4.0
 -6.0
 Enter a, b, and c: 5
 4
 3
 No real solutions.
 Enter a, b, and c: 1
 4
 4
 The only solution is: -2.0
 
  ----jGRASP: operation complete.
 **********************************************************************/