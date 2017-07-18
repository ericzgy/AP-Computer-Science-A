import java.util.*;
public class PalindromeTwo
{
   public static void main (String [] args)
   {
      Scanner console = new Scanner (System.in); 
      String s;
      boolean isPalindrome;
      for(int k = 1;k < 8; k++)
      {
         System.out.print("Enter a string: ");
         s = console.nextLine();
         String s2 = s;
         s = removeSpaces(s);
         isPalindrome = check(s);
         if(isPalindrome == true)
            System.out.println(s2 + " is a palindrome\n\n");
         else
            System.out.println(s2 + " is NOT a palindrome\n\n");
      }
   }
   public static String removeSpaces(String s)
   {   
      while(s.indexOf(" ") != -1)
      {
         s =  s.replace(" ", "");
      }
        
      return s;
   }
   public static boolean check(String s)
   {
      int length = s.length();
      int first = 0;
      int second = 1;
      int work = 0;
      String str = "";
      String finalCheck = "";
      for(int k = 1; k<=length;k++)
      {
         char a = s.charAt(first);
         char b = s.charAt(length - second);
         first++;
         second++;
         if (a == b)
         {
            work++;
         }
         else
         {
            str += "a";
         }
      }
      if(str.equals(finalCheck))
      {
         return true;
      }
      else 
         return false;
   }
}
/*
----jGRASP exec: java PalindromeTwo
 
 Enter a string: a
 a is a palindrome
 
 
 Enter a string: 747
 747 is a palindrome
 
 
 Enter a string: r ad ar
 radar is a palindrome
 
 
 Enter a string: racecar
 racecar is a palindrome
 
 
 Enter a string: ma dam im adam
 ma dam im adam is a palindrome
 
 
 Enter a string: not a palindrome
 not a palindrome is NOT a palindrome
 
 
 Enter a string: this time i did it by myself
 thistimeididitbymyself is NOT a palindrome
 
 
 
  ----jGRASP: operation complete.
     ----jGRASP exec: java PalindromeTwo
 
 Enter a string: redivider
 redivider is a palindrome
 
 
 Enter a string: lau
 lau is NOT a palindrome
 
 
 Enter a string: this lab was actually easy
 thislabwasactuallyeasy is NOT a palindrome
 
 
 Enter a string: eric c ire
 ericcire is a palindrome
 
 
 Enter a string: hello olleh
 helloolleh is a palindrome
 
 
 Enter a string: I enjoy codin g bnid oc yojne i
 Ienjoycodingbnidocyojnei is NOT a palindrome
 
 
 Enter a string: done
 done is NOT a palindrome
 
 
 
  ----jGRASP: operation complete.

*/