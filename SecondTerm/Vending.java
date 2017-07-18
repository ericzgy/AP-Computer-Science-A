//Eric Guan, 11/20/14, 3rd Period
import java.util.Scanner;
public class Vending
{
   private int sodaCanCount, tokenCount;
   public Vending()
   {
      sodaCanCount = 10;
      tokenCount = 0;
   }
   public Vending (int a)
   {
      sodaCanCount = a;
      tokenCount = 0;
   }
   public void insertToken()
   {
      tokenCount+=1;
      sodaCanCount -= 1;
   }
   public void addCans(int a)
   {
      sodaCanCount += a;
   }
   public String toString()
   {
      return "\nTokens: " + tokenCount + "\nCans: " + sodaCanCount;
   }
   public static void main (String [] args)
   {
      Vending machine = new Vending();
      Vending javaMachine = new Vending(20);
      machine.addCans(20);
      machine.insertToken();
      machine.insertToken();
      System.out.println(machine);
      System.out.println(javaMachine);
   }
}

/*

  ----jGRASP exec: java Vending
 
 
 Tokens: 2
 Cans: 28
 
 Tokens: 0
 Cans: 20
 
  ----jGRASP: operation complete.
  */
