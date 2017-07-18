//Eric Guan, 9/2/14, period 3
public class MultAdd

{
   public static void main(String[] args) {
   	
   	//Test multadd
      System.out.println (multadd(1.0, 2.0, 3.0));  	
      double w1 = Math.cos(Math.PI/4.0);
      double x1 = 1.0/2.0;
      double y1 = Math.sin(Math.PI/4.0);
      System.out.println(multadd (w1, x1, y1));
   
   	
      double w2 = 1.0;
      double x2 = Math.log(10);
      double y2 = Math.log(20);
      System.out.println(multadd(w2, x2, y2));
   
   }//main
  
   public static double multadd(double a, double b, double c) {
      double result = a*b + c;
      return result;
   }//multadd
	
   public double yikes(double n) {
      double w = n;
      double x = Math.exp(-n); 
      double y = Math.sqrt(1.0 - x);
      return multadd(w, x, y);
   }//yikes

}//multadd
 /*   ----jGRASP exec: java MultAdd    
 5.0
 1.0606601717798212
 5.298317366548037
 
  ----jGRASP: operation complete.*/
