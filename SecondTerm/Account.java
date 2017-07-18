//Eric Guan, 11/8/14, 3rd Period
import java.util.Scanner;
public class Account
{
   private double balance;
   public Account()
   {
      balance = 0;
   }
   public Account(int n)
   {
      balance = n;
   }
   public double getBalance()
   {
      System.out.print("The balance is: ");
      return balance;
   }
   public double getBalanceTwo()
   {
      return balance;
   }
   public void add(int k)
   {
      balance += k;
   }
   public void withdraw(int x)
   {
      if (x > balance)
      {
         System.out.println("You have been penalized");
         balance -= 4;
      }
      else
      {
         balance -= x;
      }
      if(balance <= 0)//prevents balance from going into negatives
      {
         balance = 0;
      }
   }
   public String toString ()
   { 
      return "\nBalance: " + balance;
   }
   public static void main (String [] args)
   {
      Scanner console = new Scanner (System.in);
      final int finish = 1;
      final int finish2 = 2;
      final int finish3 = 0;
      Account eric = new Account(20);   
      System.out.println(eric.getBalance());
      for(int y = 1; y > 0 ; y++)//for loop just in case the user wants to go through more than once
      {
         System.out.print("Adding or withdawing from the account? (1 for add, 2 for withdraw, enter 0 if finished): ");
         int input = console.nextInt();     
         if (input == finish)
         {
            System.out.println("How much do you wish to add? ");
            int a = console.nextInt();
            eric.add(a);
            System.out.println(eric.getBalance() + " ");
            System.out.println();
         }
         else if (input == finish2)
         {
            System.out.print("How much do you wish to withdraw? ");
            int w = console.nextInt();
            eric.withdraw(w);
            System.out.println(eric.getBalance() + " ");
            System.out.println();
         }
         else if (input == finish3)
         {
            System.out.println("The end balance is " + eric.getBalanceTwo());
            System.out.print("Thank you for banking with us");
            break;       
         }     
      }
   }
}



/*************************************
 ----jGRASP exec: java Account
 
 The balance is: 20.0
 Adding or withdawing from the account? (1 for add, 2 for withdraw, enter 0 if finished): 1
 How much do you wish to add? 
 123
 The balance is: 143.0 
 
 Adding or withdawing from the account? (1 for add, 2 for withdraw, enter 0 if finished): 1
 How much do you wish to add? 
 2
 The balance is: 145.0 
 
 Adding or withdawing from the account? (1 for add, 2 for withdraw, enter 0 if finished): 2
 How much do you wish to withdraw? 146
 You have been penalized
 The balance is: 141.0 
 
 Adding or withdawing from the account? (1 for add, 2 for withdraw, enter 0 if finished): 0
 The end balance is 141.0
 Thank you for banking with us
  ----jGRASP: operation complete.
   ----jGRASP exec: java Account
 
 The balance is: 20.0
 Adding or withdawing from the account? (1 for add, 2 for withdraw, enter 0 if finished): 1
 How much do you wish to add? 
 20
 The balance is: 40.0 
 
 Adding or withdawing from the account? (1 for add, 2 for withdraw, enter 0 if finished): 2
 How much do you wish to withdraw? 15
 The balance is: 25.0 
 
 Adding or withdawing from the account? (1 for add, 2 for withdraw, enter 0 if finished): 2
 How much do you wish to withdraw? 26
 You have been penalized
 The balance is: 21.0 
 
 Adding or withdawing from the account? (1 for add, 2 for withdraw, enter 0 if finished): 2
 How much do you wish to withdraw? 21
 The balance is: 0.0 
 
 Adding or withdawing from the account? (1 for add, 2 for withdraw, enter 0 if finished): 2
 How much do you wish to withdraw? 2
 You have been penalized
 The balance is: 0.0 
 
 Adding or withdawing from the account? (1 for add, 2 for withdraw, enter 0 if finished): 1
 How much do you wish to add? 
 251
 The balance is: 251.0 
 
 Adding or withdawing from the account? (1 for add, 2 for withdraw, enter 0 if finished): 0
 The end balance is 251.0
 Thank you for banking with us
  ----jGRASP: operation complete.
*************************************/