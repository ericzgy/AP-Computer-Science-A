import java.util.*;
public class Name 
{
   private String myName;
   public Name(String s)
   {
      myName = s;
   }
   public int length()
   {
      return myName.length();
   }
   public String prefix(int k)
   {
      if(k >= 0)
         if(k >= myName.length())
            return myName.substring(0);
         else 
            return myName.substring(0, k);
   }
   /*public String suffix(int k)
   {
    
   }
   public boolean isNickname(Name n)
   {
    
   }*/
}