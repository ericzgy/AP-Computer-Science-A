import java.util.*;
public class Sentence 
{
   public static void main (String [] args)
   {
      Scanner console = new Scanner (System.in); 
      String s;
      s = console.nextLine();
      System.out.println("Length of the sentence: " + findLength(s));
      System.out.println("Number of words: " + findWords(s));
      System.out.println("Average word length: " + findAverageLength(s));
      
   
   }
   public static int findWords(String s)
   {
      return findSpaces(s)+1;
   }
   public static int findSpaces(String s)
   {
      int k = 0;
      for (int i = 0; i< s.length(); i++)
      {
         if (s.substring(i, i+1).equals(" "))
            k++;
      }
      return k;
   }
   public static int findLength(String s)
   {
      int k = s.length();
      return k;
   }
   public static double findAverageLength(String s)
   {
      return (double)(findLength(s) - findSpaces(s))/(findWords(s));
   }
}
/*
 ----jGRASP exec: java Sentence
 
 edmund lau
 Length of the sentence: 10
 Number of words: 2
 Average word length: 4.5
 
  ----jGRASP: operation complete.
   ----jGRASP exec: java Sentence
 
 hello my name is eric
 Length of the sentence: 21
 Number of words: 5
 Average word length: 3.4
 
  ----jGRASP: operation complete.
     ----jGRASP exec: java Sentence
 
 racecar is a palindrome
 Length of the sentence: 23
 Number of words: 4
 Average word length: 5.0
 
  ----jGRASP: operation complete.
 
*/