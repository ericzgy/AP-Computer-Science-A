   import java.util.Scanner;
   public class Mia
   {
      public static void main (String args [])
      {
           
         Scanner console = new Scanner (System.in);
      
         for (int q =1; q>0;q++)
         {
            int k = 0;
            int a = console.nextInt();
            int a2 = console.nextInt();
            int b = console.nextInt();
            int b2 = console.nextInt();
            
            while ((a <= 0 || a2 <=0 || b <= 0 || b2 <= 0) || (a > 6 || a2 > 6 || b >6 || b2 >6 ))
            {
               if ( a == 0 && a2 == 0 && b == 0 && b2 == 0)
               {
                  break;
               }
               
               else
               {
                  a = console.nextInt();
                  a2 = console.nextInt();
                  b = console.nextInt();
                  b2 = console.nextInt();
               }
            }
            if ( a == 0 && a2 == 0 && b == 0 && b2 == 0)
            {
               break;
            }
            if (a == 1 && a2 == 2 && b == 2 && b2 == 1)
            {
               System.out.println("Tie.");
               k++;
            }
            else if(a == 2 && a2 == 1 && b == 1 && b2 == 2)
            {
               System.out.println("Tie.");
               k++;
            }
            if ((a < a2) && (a > 0 && a2 > 0 && b > 0 && b2 > 0)) 
            {
               int temp= a2; 
               a2 = a;
               a = temp;
            }
            if ((b < b2) && (a > 0 && a2 > 0 && b > 0 && b2 > 0))
            {
               int temp= b2; 
               b2 = b;
               b = temp;
            }
            if ((a ==2 && a2 == 1) && (b+b2 != 3 && b != 2) && (a > 0 && a2 > 0 && b > 0 && b2 > 0))
            {
               System.out.println("Player 1 wins.");
               k++;
            }
            else if((b ==2 && b2 == 1) && (a+a2 != 3 && a != 2) && (a > 0 && a2 > 0 && b > 0 && b2 > 0))
            {
               System.out.println("Player 2 wins.");
               k++;
            }
            if(((a != a2) && (a + a2 != 3 )) && (b != b2 && (b+b2 != 3 )) && (a > 0 && a2 > 0 && b > 0 && b2 > 0))
            {
               if ((a > b) && (a > 0 && a2 > 0 && b > 0 && b2 > 0))
               {
                  System.out.println("Player 1 wins.");
                  k++;
               }
               else if (( b > a) && (a > 0 && a2 > 0 && b > 0 && b2 > 0))
               {
                  System.out.println("Player 2 wins.");
                  k++;
               }
            }
            if ((a == b && a2 == b2) && (a > 0 && a2 > 0 && b > 0 && b2 > 0) && k == 0)
            {
               System.out.println("Tie.");
               k++;
            }
          
            if(( a == a2 && b == b2) && (a > 0 && a2 > 0 && b > 0 && b2 > 0))
            {
               if(a + a2 > b+ b2)
               {
                  System.out.println("Player 1 wins.");
                  k++;
               }
               else               
               {
                  System.out.println("Player 2 wins.");
                  k++;
               }
            }
            if ((a == a2 && b != b2) && (k == 0) && (a > 0 && a2 > 0 && b > 0 && b2 > 0))
            {
               System.out.println("Player 1 wins.");
               k++;
            }
            if ((b == b2 && a != a2) && (k == 0) && (a > 0 && a2 > 0 && b > 0 && b2 > 0))
            {
               System.out.println("Player 2 wins.");
               k++;
            }
         
         }
      }
   }