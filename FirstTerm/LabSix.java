//Eric Guan, 9/2/14, period 3
public class LabSix

{
   public static void main(String args[])
   {
      System.out.println(printAmerican("Saturday", "September", 20, 2014));
      System.out.println();
      System.out.println(printEuropean("Saturday", "September", 20, 2014));
   }
    
   public static String printAmerican(String day, String month, int date, int year){
   
      System.out.println("American Format:");
      String result = day + "," + " " + month + " " + date + "," + " " + year;
      return result;
   
   }
   public static String printEuropean(String day, String month, int date, int year) {
      System.out.println("European Format:");
      String rezult = day + ' ' + date + ' ' + month + ", " + year;
      return rezult;
   }
  

}
/*----jGRASP exec: java LabSix    
 American Format:
 Saturday, September 20, 2014
 
 European Format:
 Saturday 20 September, 2014
 
  ----jGRASP: operation complete.*/