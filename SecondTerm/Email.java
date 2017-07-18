//Eric Guan, 11/20/14, 3rd Period
import java.util.Scanner;
public class Email
{
   private String myUserName, myHostName, myExtension;
   public Email(String address)
   {
      int k = address.indexOf("@");
      myUserName = address.substring(0, k);
      int a = address.indexOf(".", k);
      myHostName = address.substring(k + 1, a);
      myExtension = address.substring(a + 1);
   }
   public String getUserName()
   {
      return myUserName;
   }
   public String getHostName()
   {
      return myHostName;
   }
   public String getExtension()
   {
      return myExtension;
   }
   public String toString()
   {
      return "\nEmail Address: " + myUserName + "@" + myHostName + "." + myExtension;
   }
   public static void main (String [] args)
   {
      Email gmail = new Email("ericzgy2008@gmail.com");
      System.out.println(gmail.getUserName());
      System.out.println(gmail.getHostName());
      System.out.println(gmail.getExtension());
      System.out.println(gmail);
   }
}
/*----jGRASP exec: java Email
 
 ericzgy2008
 gmail
 com
 
 Email Address: ericzgy2008@gmail.com
 
  ----jGRASP: operation complete.

*/
