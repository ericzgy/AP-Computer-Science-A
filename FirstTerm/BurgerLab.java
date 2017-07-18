//Eric Guan, 10/11/14, 3rd Period
import java.util.Scanner;
import java.text.DecimalFormat;
public class BurgerLab

{
   public static void main(String args[])
   {
      DecimalFormat burg = new DecimalFormat("0.00");
      Scanner console = new Scanner (System.in);
      System.out.print("How many hours did you work in week 1? ");
      int a = console.nextInt();
      System.out.print("Your take-home pay is ");
      System.out.println(burg.format(getPayment(a)));
      System.out.print("How many hours did you work in week 2? ");
      int b = console.nextInt();
      System.out.print("Your take-home pay is ");
      System.out.println(burg.format(getPayment(b)));
      System.out.print("How many hours did you work in week 3? ");
      int c = console.nextInt();
      System.out.print("Your take-home pay is ");
      System.out.println(burg.format(getPayment(c)));
      System.out.print("How many hours did you work in week 4? ");
      int d = console.nextInt();
      System.out.print("Your take-home pay is ");
      System.out.println(burg.format(getPayment(d))); 
      double f = getPayment(a) + getPayment(b) + getPayment(c) + getPayment(d);
      System.out.println("Your total pay for the month is " + burg.format(f));
      System.out.println("Hope you enjoy working at Babbage Burgers.");
   }
   public static double getPayment(int k){
      final double wage = 0.7*5.15;
      double take = 0.0;
      for (int x = 0; x < k; x++)
         take += wage;
      return take;
   }

}
/*********************
 ----jGRASP exec: java BurgerLab
 
 How many hours did you work in week 1? 35
 Your take-home pay is 126.18
 How many hours did you work in week 2? 41
 Your take-home pay is 147.81
 How many hours did you work in week 3? 37
 Your take-home pay is 133.39
 How many hours did you work in week 4? 45
 Your take-home pay is 162.23
 Your total pay for the month is 569.61
 Hope you enjoy working at Babbage Burgers.
 
  ----jGRASP: operation complete.
    
  ----jGRASP exec: java BurgerLab
 
 How many hours did you work in week 1? 34
 Your take-home pay is 122.57
 How many hours did you work in week 2? 50
 Your take-home pay is 180.25
 How many hours did you work in week 3? 43
 Your take-home pay is 155.01
 How many hours did you work in week 4? 26
 Your take-home pay is 93.73
 Your total pay for the month is 551.56
 Hope you enjoy working at Babbage Burgers.
 
  ----jGRASP: operation complete.
    ----jGRASP exec: java BurgerLab
 
 How many hours did you work in week 1? 45
 Your take-home pay is 162.23
 How many hours did you work in week 2? 50
 Your take-home pay is 180.25
 How many hours did you work in week 3? 35
 Your take-home pay is 126.18
 How many hours did you work in week 4? 45
 Your take-home pay is 162.23
 Your total pay for the month is 630.88
 Hope you enjoy working at Babbage Burgers.
 
  ----jGRASP: operation complete.
   ----jGRASP exec: java BurgerLab
 
 How many hours did you work in week 1? -5
 Your take-home pay is 0.00
 How many hours did you work in week 2? -8
 Your take-home pay is 0.00
 How many hours did you work in week 3? -2
 Your take-home pay is 0.00
 How many hours did you work in week 4? -52
 Your take-home pay is 0.00
 Your total pay for the month is 0.00
 Hope you enjoy working at Babbage Burgers.
 
  ----jGRASP: operation complete.
*********************/
