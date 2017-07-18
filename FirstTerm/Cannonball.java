//Oakton CS Club
import java.util.Scanner;
public class Cannonball{
   public static void main(String args[]){
      Scanner console = new Scanner(System.in);
      int N = console.nextInt();
      for (int k=1;k<=N;k++)
      {
         float a = console.nextFloat();
         float b = console.nextFloat();
         float c = console.nextFloat();
         float d = console.nextFloat();
         float e = console.nextFloat();
         System.out.println(Calculate(a, b, c, d, e));
      }
   }
   public static String Calculate(float v, float theta, float x, float h1, float h2){
      float time = (float)((x)/(v * Math.cos(Math.toRadians(theta))));
      float height = (float)((v*time*Math.sin(Math.toRadians(theta)))-(0.5*9.8*(time*time)));
      if(height<h2-1 && height>h1+1){
         return "Safe";
      }
      else{
         return "Not Safe";
      }   
   }
}