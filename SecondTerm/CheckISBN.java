import java.util.*;
public class CheckISBN 
{
   public static void main (String [] args)
   {
      Scanner console = new Scanner(System.in);
      String k = console.nextLine();
      System.out.println(check(k));
   }
   public static boolean check(String isbn)
   {
      boolean check = false;
      int digit = getCheckDigit(isbn);
      if(digit == 10)
      {
         if(isbn.charAt(12) == 'x')
         {
            check = true;
         }
      }
      else if(isbn.charAt(12) == 'x')
      {
         check = false;
      }
      else
      {
         int a = Integer.parseInt(isbn.substring(12));
         if(digit == a)
         {
            check = true;
         }
      }
      return check;
   }
   public static int getCheckDigit(String isbn)
   {
      while(isbn.indexOf("-") != -1)
      {
         isbn = isbn.replace("-", "");
      }
               //Found the parse int method on oracle docs in the Integer api
               //the method converts Strings to integers
      int A = Integer.parseInt(isbn.substring(0, 1))*10;
      int B = Integer.parseInt(isbn.substring(1, 2))*9;
      int C = Integer.parseInt(isbn.substring(2, 3))*8;
      int D = Integer.parseInt(isbn.substring(3, 4))*7;
      int E = Integer.parseInt(isbn.substring(4, 5))*6;
      int F = Integer.parseInt(isbn.substring(5, 6))*5;
      int G = Integer.parseInt(isbn.substring(6, 7))*4;
      int H = Integer.parseInt(isbn.substring(7, 8))*3;
      int I = Integer.parseInt(isbn.substring(8, 9))*2;  
      int sum = A+B+C+D+E+F+G+H+I;
      int remainder = sum%11;
      return 11-remainder;
   }
}

/*
----jGRASP exec: java CheckISBN
 
 0-201-48558-3
 true
 
  ----jGRASP: operation complete.
  ----jGRASP exec: java CheckISBN
 
 0-670-03441-x
 true
 
  ----jGRASP: operation complete.
 ----jGRASP exec: java CheckISBN

0-670-03541-x
false

 ----jGRASP: operation complete. 
  ----jGRASP exec: java CheckISBN
 
 0-06-027900-1
 true
 
  ----jGRASP: operation complete.
  ----jGRASP exec: java CheckISBN
 
 1-85671-104-8
 true
 
  ----jGRASP: operation complete.
     ----jGRASP exec: java CheckISBN
 
 1-85671-114-8
 false
 
  ----jGRASP: operation complete.
*/