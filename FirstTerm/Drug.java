//Eric Guan, 10/4/14, period 3
import java.util.Scanner;
public class Drug

{
   public static void main (String [] args)
   {
      Scanner console = new Scanner (System.in);
      System.out.print("Enter the effectiveness of the drug in the first month: ");
      double a = console.nextDouble();
      findEffectiveness(a);
   }
   public static void findEffectiveness (double n){
      int k = 0;
      while (n > 50.0)
      {
         System.out.print("month: " + k + "    ");
         System.out.println("effectiveness: " + n);
         n-=(0.04*n);
         k++;
      }
      System.out.print("month: " + k + "    ");
      System.out.println("effectiveness: " + n + " DISCARDED");
   
   }
}

/******************************
----jGRASP exec: java Drug
 
 Enter the effectiveness of the drug in the first month: 100.0
 month: 0    effectiveness: 100.0
 month: 1    effectiveness: 96.0
 month: 2    effectiveness: 92.16
 month: 3    effectiveness: 88.47359999999999
 month: 4    effectiveness: 84.93465599999999
 month: 5    effectiveness: 81.53726975999999
 month: 6    effectiveness: 78.27577896959998
 month: 7    effectiveness: 75.14474781081599
 month: 8    effectiveness: 72.13895789838335
 month: 9    effectiveness: 69.25339958244803
 month: 10    effectiveness: 66.4832635991501
 month: 11    effectiveness: 63.8239330551841
 month: 12    effectiveness: 61.27097573297674
 month: 13    effectiveness: 58.82013670365767
 month: 14    effectiveness: 56.46733123551136
 month: 15    effectiveness: 54.208637986090906
 month: 16    effectiveness: 52.04029246664727
 month: 17    effectiveness: 49.958680767981384 DISCARDED
 
  ----jGRASP: operation complete.
 ----jGRASP exec: java Drug
 
 Enter the effectiveness of the drug in the first month: 92.0
 month: 0    effectiveness: 92.0
 month: 1    effectiveness: 88.32
 month: 2    effectiveness: 84.7872
 month: 3    effectiveness: 81.395712
 month: 4    effectiveness: 78.13988352
 month: 5    effectiveness: 75.0142881792
 month: 6    effectiveness: 72.01371665203199
 month: 7    effectiveness: 69.1331679859507
 month: 8    effectiveness: 66.36784126651268
 month: 9    effectiveness: 63.71312761585218
 month: 10    effectiveness: 61.16460251121809
 month: 11    effectiveness: 58.71801841076937
 month: 12    effectiveness: 56.36929767433859
 month: 13    effectiveness: 54.114525767365045
 month: 14    effectiveness: 51.949944736670446
 month: 15    effectiveness: 49.871946947203625 DISCARDED
 
  ----jGRASP: operation complete.
----jGRASP exec: java Drug
 
 Enter the effectiveness of the drug in the first month: 86.254
 month: 0    effectiveness: 86.254
 month: 1    effectiveness: 82.80384000000001
 month: 2    effectiveness: 79.4916864
 month: 3    effectiveness: 76.312018944
 month: 4    effectiveness: 73.25953818624001
 month: 5    effectiveness: 70.32915665879041
 month: 6    effectiveness: 67.5159903924388
 month: 7    effectiveness: 64.81535077674124
 month: 8    effectiveness: 62.22273674567159
 month: 9    effectiveness: 59.733827275844725
 month: 10    effectiveness: 57.344474184810935
 month: 11    effectiveness: 55.0506952174185
 month: 12    effectiveness: 52.84866740872176
 month: 13    effectiveness: 50.73472071237289
 month: 14    effectiveness: 48.705331883877975 DISCARDED
 
  ----jGRASP: operation complete.
 
   ******************************/