//Eric Guan, 9/2/14, period 3
import java.util.Scanner;
import java.text.DecimalFormat;
public class LoanProgram

{
   static Scanner console = new Scanner (System.in);
   public static void main (String [] args)
   {
      int years; 
      double amount, rate, payment, month, percent;
      amount = getAmount();
      rate = getRate();
      years = getYears();
      payment = findPayment(amount, rate, years);
      displayPayment(payment);
   }
   public static double getAmount()
   {
      System.out.print ("Enter the amount to be borrowed: ");
      double a = console.nextDouble();
      if (a < 0 || a > 100000)
      {
         System.out.print ("invalid. Enter Amount: ");
         a = console.nextDouble();
      }
      return a;
   }
   public static double getRate()
   {
      System.out.print ("Enter the annual interest rate as a percent: ");
      double b = console.nextDouble();
      double i = b/1200.0;
      return i;
   }
   public static int getYears()
   {
      System.out.print ("Enter the length of the loan in years: ");
      int c = console.nextInt();
      return c;
   }
   public static double findPayment(double amount, double rate, int years)
   {
      double g = amount * rate * (Math.pow((rate + 1), (years * 12)))/(Math.pow((rate + 1), (years * 12)) -1); 
      return g;
   }
   public static void displayPayment (double payment)
   {
      System.out.println("Monthly payment: $" + payment);
   }
}
/*************
----jGRASP exec: java LoanProgram
 
 Enter the amount to be borrowed: 10500
 Enter the annual interest rate as a percent: 9.5
 Enter the length of the loan in years: 4
 Monthly payment: $263.7929350448275
 ----jGRASP exec: java LoanProgram
 
 Enter the amount to be borrowed: 50012
 Enter the annual interest rate as a percent: 3.2
 Enter the length of the loan in years: 5
 Monthly payment: $903.1019669852897
 
  ----jGRASP: operation complete.

 
  ----jGRASP: operation complete.************/
