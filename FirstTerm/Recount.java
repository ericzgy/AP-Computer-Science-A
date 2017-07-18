//Oakton CS Club
import java.util.*;
public class Recount{
   public static void main(String args[]){
      ArrayList<String> cand = new ArrayList<String>();
      int k = 0;
      while(true)
      {
         Scanner console = new Scanner(System.in);
         String a = console.next();
         if(a.equals("***")){
            break;
         }
         cand.add(a);
         k++;
         if(k==100001){
            break;
         }
      }
      System.out.println(doIt(cand));
   }
   public static String doIt (ArrayList<String> a){
      int max = 0;
      String answer = "";
      int count=0;
      String temp = "";
     /*for(int k = 0;k<1;k++)
      {
         count=0;
        //temp = a.get(k);*/
         for(int j=0;j<a.size();j++)
         {
           //p
           // count=0;
            temp = a.get(j);
            if(j>0 && (!(a.get(j).equals(a.get(j-1)))))
            {
               count=0;
            }
            if(temp.equals(a.get(j)))
               count++;
            if(count==max)
               answer="Runoff!";
            if(count>max)
            {
               max=count;
               answer=temp;
               //count=0;
            }
         }
      //}
      return answer;
   }
}