//Eric Guan
import java.util.Arrays;
import java.util.*;
import java.text.DecimalFormat;
public class ACSLIntermediate
{
   public static void main (String [] args)
   {
      Scanner console = new Scanner(System.in);
      for(int k = 1;k<=5;k++)
      {
         String a = console.next();
         String b = console.next();
         String c = console.next();
         String d = console.next();
         double e = console.nextDouble();
         output(a, b, c, d, e);
      }
   }
   public static void output(String a, String b, String c, String d, double e)
   {
      DecimalFormat money = new DecimalFormat("$0.00");
      a = a.replace(",", "");
      b = b.replace(",", "");
      c = c.replace(",", "");
      d = d.replace(",", "");
      int finalMiles;
      double finalPrice = 0;
      int hours = 0;
      double minutes = 0;
      double minutes3 = 0;
      int minutes2 = 0;
      String alphabet = "ABCDEFG";
      int [] miles = {450, 140, 120, 320, 250, 80};
      int index = alphabet.indexOf(a);
      int index2 = alphabet.indexOf(b);
      int subtract = index2 - index;
      int sum = 0;
      for(int k = 0;k < index2 - index;k++)
      {
         sum += miles[index + k];
      }
      finalMiles = sum;
      
      if(d.equals("I"))
      {
         hours = finalMiles/65;
         minutes = (finalMiles/65.0-hours)*60;
         
      } 
      else if(d.equals("H"))
      {
         hours = finalMiles/60;
         minutes = (finalMiles/60.0-hours)*60;
        
      }
      else if(d.equals("M"))
      {
         hours = finalMiles/55;
         minutes = (finalMiles/55.0-hours)*60;
         
      }
      else if(d.equals("S"))
      {
         hours = finalMiles/45;
         minutes = (finalMiles/45.0-hours)*60;
         
      }
      minutes3 = minutes%.01*1000;
      minutes2 = (int)(minutes);
      if(minutes3>=5)
         minutes2 += 1;
      double temp;
      if(c.equals("C"))
      {
         temp = finalMiles/28.0;
         finalPrice = temp * e;
      }
      if(c.equals("M"))
      {
         temp = finalMiles/25.0;
         finalPrice = temp * e;
      }
      if(c.equals("F"))
      {
         temp = finalMiles/22.0;
         finalPrice = temp * e;
      }
      if(c.equals("V"))
      {
         temp = finalMiles/20.0;
         finalPrice = temp * e;
      }
      System.out.print(finalMiles + ", ");
      if(minutes2 < 10)
      {
         if(10-hours >= 0)
            System.out.print("0" + hours + ":" + "0" + minutes2 + ", ");
         else System.out.print(hours + ":" + "0" + minutes2 + ", ");
      }
      else if(minutes2 >=10)
      {
         if(10-hours>=0)
            System.out.print("0" + hours + ":" + minutes2 + ", ");
         else 
            System.out.print(hours + ":" + minutes2 + ", ");
      }
      System.out.println(money.format(finalPrice));
   }
  
}