//Eric Guan, 11/20/14, 3rd Period
import java.util.Scanner;
public class Craps
{
   private static int sum, setPoint;
   public static int getSum(Dice a, Dice b)
   {
      sum = a.getSide() + b.getSide();
      return sum;
   }
   public static void main (String [] args)
   {
      Scanner console = new Scanner(System.in);
      System.out.println(" Welcome to our Craps game extraordinaire!");
      System.out.println("Here’s how you play.");
      System.out.println("A first roll of 7 or 11 wins.");
      System.out.println("A first roll of 2 or 12 loses.");
      System.out.println("Any other first roll becomes the set point.");
      System.out.println("Subsequent rolls of 7 or 11 lose.");
      System.out.println("On subsequent rolls the set point wins!");
      System.out.println("You are limited to 5 rolls max.");
      System.out.println("Here’s what happened for you!");
      Dice test = new Dice();
      Dice test2 = new Dice();
      test.roll();
      test2.roll();
      System.out.println("Roll #" + "1");
      System.out.println("You rolled a " + test.getSide() + " and a " + test2.getSide());
      if(getSum(test, test2) == 7 || getSum(test, test2) == 11)
      {
         System.out.println("Congratulations - you rolled a " + getSum(test, test2) + " first roll to win");
         System.out.println("Thanks for playing!");
         System.out.println();
         System.out.println("Game Over, you WON in 1 roll");
         System.out.println("Press any key to continue...");
         console.nextLine();
      } 
      else if (getSum(test, test2) == 2 || getSum(test, test2) == 12)
      {
         System.out.println("I am sorry - you rolled an " + getSum(test, test2) + " to lose");
         System.out.println("Thanks for playing!");
         System.out.println();
         System.out.println("Game Over, you WON in 1 roll");
         System.out.println("Press any key to continue...");
         console.nextLine();
      }
      else
      {
         setPoint = test.getSide() + test2.getSide(); 
         System.out.println("Your set point is " + setPoint + " ");
         System.out.println();
         for (int k = 2;k <= 5;k++)
         {
            test.roll();
            test2.roll();
            System.out.println("Roll #" + k);
            System.out.println("You rolled a " + test.getSide() + " and a " + test2.getSide());
            if (getSum(test, test2) == setPoint)
            {
               System.out.println("Congratulations - you rolled a " + getSum(test, test2) + " to win");
               System.out.println("Thanks for playing");
               System.out.println();
               System.out.println("Game Over, you WON in " + k + " rolls");
               System.out.println("Press any key to continue");
               console.nextLine();
               break;
            }
            else if (getSum(test, test2) == 7 || getSum(test, test2) == 11)
            {
               System.out.println("I am sorry - you rolled an " + getSum(test, test2) + " to lose");
               System.out.println("Thanks for playing!");
               System.out.println();
               System.out.println("GAME OVER, you LOST in " + k + " rolls");
               System.out.println("Press any key to continue ... ");
               String a = console.next();
               int length = a.length();
               if(length> 0)
               {
                  break;
               }
               else
               {
                  break;
               }
            }
            else
            {
               System.out.println("Press return to continue ... ");
               console.nextLine();
            }
         }
      }
   } 
}

/*
 ----jGRASP exec: java Craps
 
  Welcome to our Craps game extraordinaire!
 Here’s how you play.
 A first roll of 7 or 11 wins.
 A first roll of 2 or 12 loses.
 Any other first roll becomes the set point.
 Subsequent rolls of 7 or 11 lose.
 On subsequent rolls the set point wins!
 You are limited to 5 rolls max.
 Here’s what happened for you!
 Roll #1
 You rolled a 2 and a 6
 Your set point is 8 
 
 Roll #2
 You rolled a 2 and a 3
 Press return to continue ... 
 
 Roll #3
 You rolled a 5 and a 5
 Press return to continue ... 
 
 Roll #4
 You rolled a 1 and a 5
 Press return to continue ... 
 
 Roll #5
 You rolled a 6 and a 5
 I am sorry - you rolled an 11 to lose
 Thanks for playing!
 
 GAME OVER, you LOST in 5 rolls
 Press any key to continue ... 
 
 x
 
  ----jGRASP: operation complete.
     ----jGRASP exec: java Craps
 
  Welcome to our Craps game extraordinaire!
 Here’s how you play.
 A first roll of 7 or 11 wins.
 A first roll of 2 or 12 loses.
 Any other first roll becomes the set point.
 Subsequent rolls of 7 or 11 lose.
 On subsequent rolls the set point wins!
 You are limited to 5 rolls max.
 Here’s what happened for you!
 Roll #1
 You rolled a 6 and a 6
 I am sorry - you rolled an 12 to lose
 Thanks for playing!
 
 Game Over, you WON in 1 roll
 Press any key to continue...
  ----jGRASP exec: java Craps
 
  Welcome to our Craps game extraordinaire!
 Here’s how you play.
 A first roll of 7 or 11 wins.
 A first roll of 2 or 12 loses.
 Any other first roll becomes the set point.
 Subsequent rolls of 7 or 11 lose.
 On subsequent rolls the set point wins!
 You are limited to 5 rolls max.
 Here’s what happened for you!
 Roll #1
 You rolled a 1 and a 2
 Your set point is 3 
 
 Roll #2
 You rolled a 6 and a 3
 Press return to continue ... 
 
 Roll #3
 You rolled a 2 and a 2
 Press return to continue ... 
 
 Roll #4
 You rolled a 5 and a 2
 I am sorry - you rolled an 7 to lose
 Thanks for playing!
 
 GAME OVER, you LOST in 4 rolls
 Press any key to continue ... 
 3
 
  ----jGRASP: operation complete.
*/