//Oakton CS Club  
import java.util.*;
public class Sum{
public static void main(String args[]){
   Scanner console = new Scanner(System.in);
   while(true){
   int a = console.nextInt();
   int b = console.nextInt();
   if(a==0 && b==0){
   break;
   }
   else
   System.out.println(a+b);
}
}
}