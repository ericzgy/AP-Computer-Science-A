//Eric Guan, 10/4/14, period 3
import java.util.Scanner;
public class Credit

{
   public static void main (String [] args)
   {
      Scanner console = new Scanner (System.in);
      System.out.print("Enter the monthly payment: ");
      double a = console.nextDouble();
      System.out.print("What is the interest rate? ");
      double j = console.nextDouble();
      System.out.print("What is the payment amount? ");
      double u = console.nextDouble();
      findBalance(a, j, u);
   }
   public static void findBalance (double n, double e, double x){
      Scanner a = new Scanner (System.in);
      int k = 1;
      double s;
      double t;
      double total = 0.0;
      while (x > 0.0)
      {
         System.out.print("month: " + k + "    ");
         t = x*e;
         s = (x-n) + t;
         total += n;
         System.out.print("balance: " + s);
         System.out.println("   " + "total payments: " + total);
         x = s;
         k++;
      }
   
   }

}
/**********************************************

  ----jGRASP exec: java Credit
 
 Enter the monthly payment: 100
 What is the interest rate? .015
 What is the payment amount? 1000
 month: 1    balance: 915.0   total payments: 100.0
 month: 2    balance: 828.725   total payments: 200.0
 month: 3    balance: 741.155875   total payments: 300.0
 month: 4    balance: 652.273213125   total payments: 400.0
 month: 5    balance: 562.057311321875   total payments: 500.0
 month: 6    balance: 470.4881709917031   total payments: 600.0
 month: 7    balance: 377.54549355657866   total payments: 700.0
 month: 8    balance: 283.20867595992735   total payments: 800.0
 month: 9    balance: 187.45680609932626   total payments: 900.0
 month: 10    balance: 90.26865819081615   total payments: 1000.0
 month: 11    balance: -8.377311936321604   total payments: 1100.0
 
  ----jGRASP: operation complete.
  
   ----jGRASP exec: java Credit
 
 Enter the monthly payment: 200
 What is the interest rate? .023
 What is the payment amount? 2000
 month: 1    balance: 1846.0   total payments: 200.0
 month: 2    balance: 1688.458   total payments: 400.0
 month: 3    balance: 1527.2925340000002   total payments: 600.0
 month: 4    balance: 1362.420262282   total payments: 800.0
 month: 5    balance: 1193.755928314486   total payments: 1000.0
 month: 6    balance: 1021.2123146657192   total payments: 1200.0
 month: 7    balance: 844.7001979030307   total payments: 1400.0
 month: 8    balance: 664.1283024548004   total payments: 1600.0
 month: 9    balance: 479.40325341126083   total payments: 1800.0
 month: 10    balance: 290.42952823971984   total payments: 2000.0
 month: 11    balance: 97.1094073892334   total payments: 2200.0
 month: 12    balance: -100.65707624081423   total payments: 2400.0
 
  ----jGRASP: operation complete.

  ******************************************/