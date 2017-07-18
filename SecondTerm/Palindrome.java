import java.util.*;
public class Palindrome
{
   public static void main (String [] args)
   {
      Scanner console = new Scanner (System.in); 
      String s;
      String use;
      boolean isItPalindrome;
      for(int k = 1;k < 8; k++)
      {
         System.out.print("Enter a string: ");
         s = console.nextLine();
         use = removeSpaces(s);
         isItPalindrome = isPalindrome(use);
         if(isItPalindrome == true)
            System.out.println(s + " is a palindrome\n\n");
         else
            System.out.println(s + " is NOT a palindrome\n\n");
      }
   }
   public static String removeSpaces( String s )
   {  
      s = s.replace(" ", "");
      return s;
   }
   public static boolean isPalindrome(String s)
   {
      removeSpaces(s);
      if(isPalindrome(s, 0, s.length() - 1))
         return true;
      else
         return false;
   }
   public static boolean isPalindrome( String s, int start, int end )
   {
      boolean check = false;
      if(s.length() == 0 || s.length() == 1)
         return true;
      char first = s.charAt(start);
      char last = s.charAt(end);
      s = s.substring(1, end);
      if(first == last)
         check = isPalindrome(s, start, end - 2);
      if(check)
         return true;
      else
         return false;
   }
}
/*
 ----jGRASP exec: java PalindromeTwo
 
 Enter a string: dad
 dad is a palindrome
 
 
 Enter a string: 96069
 96069 is a palindrome
 
 
 Enter a string: redivider
 redivider is a palindrome
 
 
 Enter a string: a toyota
 a toyota is a palindrome
 
 
 Enter a string: able was i ere i saw elba
 able was i ere i saw elba is a palindrome
 
 
 Enter a string: not a palindrome
 not a palindrome is NOT a palindrome
 
 
 Enter a string: step on no pets
 step on no pets is a palindrome
 
 
 
  ----jGRASP: operation complete.
   
  ----jGRASP exec: java PalindromeTwo
 
 Enter a string: eva can i see bees in a cave
 eva can i see bees in a cave is a palindrome
 
 
 Enter a string: a
 a is a palindrome
 
 
 Enter a string: hello
 hello is NOT a palindrome
 
 
 Enter a string: definetely not a palindrome
 definetely not a palindrome is NOT a palindrome
 
 
 Enter a string: redivider
 redivider is a palindrome
 
 
 Enter a string: harvard
 harvard is NOT a palindrome
 
 
 Enter a string: I wish i could use trim
 I wish i could use trim is NOT a palindrome
 
 
 
  ----jGRASP: operation complete.
 
*/