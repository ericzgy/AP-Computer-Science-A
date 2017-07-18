import java.util.Arrays;
public class OneDimLab
{
   
   private int [] list;
   public OneDimLab (int [] array)
   {
      list = array;
   }
      // post condition: find and return the max element in list
   public int findMax()
   {
      int max = list[0];
      for(int k = 0;k<list.length;k++)
      {
         if(list[k] > max)
            max = list[k];
      }
      return max;
   }
      // post condition: find and return the index of the max element in list
   public int findMaxIndex()
   {
      int maxIndex = 0;
      for(int k = 0;k<list.length;k++)
      {
         if(list[k] > maxIndex)
            maxIndex = k;
      }
      return maxIndex;
   
   }
   
      // post condition: find and return the min element in list
   public int findMin()
   {
      int min = list[0];
      for(int k = 0;k<list.length;k++)
      {
         if(list[k] < min)
            min = list[k];
      }
      return min;
   }
      // post condition: find and return the index of the min element in a
   public int findMinIndex()
   {
      int minIndex = 0;
      int min = list[0];
      for(int k = 0;k<list.length;k++)
      {
         if(list[k] < min)
         {
            min = list[k];
            minIndex = k;
         }
      }
      return minIndex;
   }
   
      // post condition: check to see if target can be found in list or not.  If yes, returns
   //                             true; otherwise, returns false.
   public boolean find (int target)
   {
      boolean find = false;
      for(int k = 0;k<list.length;k++)
      {
         if(list[k] == target)
            find = true;
      }
      return find;
   }
   
      // post condition: put all the postitive numbers in  an array and return it
   public int [] posArray()
   {
      int count = 0;
      for(int i = 0;i<list.length;i++)
      {
         if(list[i]>0)
            count++;
      }
      int [] pos = new int [count];
      int r = 0;
      for(int k = 0; k<list.length; k++)
      {
         if(list[k]>0)
         {
            pos[r] = list[k];
            r++;
         }
      }
      return pos;
   }
   
      // post condition: put all the negative numbers in list in an array and return the array
   public int [] negArray()
   {
      int count = 0;
      for(int i = 0;i<list.length;i++)
      {
         if(list[i]<0)
            count++;
      }
      int [] neg = new int [count];
      int r = 0;
      for(int k = 0; k<list.length; k++)
      {
         if(list[k]<0)
         {
            neg[r] = list[k];
            r++;
         }
      }
      return neg;   }
   	
      // post condition: sum up all the numbers in list and return the sum
   public int sum ()
   {
      int sum = 0;
      for(int k = 0;k<list.length;k++)
      {
         sum += list[k];
      }
      return sum;
   }
      // post condition: find the average of all the numbers in list 
   public double average()
   {
      int sum = 0;
      for(int k = 0;k<list.length;k++)
      {
         sum += list[k];
      }
      return sum/(list.length-1);
   }
   	
      // post condition: put all the even numbers in list and return the array
   public  int [] evenMembers()
   {
      int count = 0;
      for(int i = 0;i<list.length;i++)
      {
         if(list[i]%2 == 0)
            count++;
      }
      int [] even = new int [count];
      int r = 0;
      for(int k = 0; k<list.length; k++)
      {
         if(list[k]%2 == 0)
         {
            even[r] = list[k];
            r++;
         }
      }
      return even; 	
   }
   	
      // post condition: put all the odd numbers in list  and return the array	 
   public  int [] oddMembers()
   {
      int count = 0;
      for(int i = 0;i<list.length;i++)
      {
         if(list[i]%2 != 0)
            count++;
      }
      int [] odd = new int [count];
      int r = 0;
      for(int k = 0; k<list.length; k++)
      {
         if(list[k]%2 != 0)
         {
            odd[r] = list[k];
            r++;
         }
      }
      return odd;
   }	
      // post condition: print all the elements in list onto the screen
   public String toString ()
   {
      String s = " ";
      for(int k =0;k<list.length;k++)
         s += list[k] + ",";
      return s;
   }
   
   /********************************************************/
   public static void main(String[] args)
   {
      int [] array = {15, -5, 25, 75, 9, -2, -80, -100, 99, 21, 23, 40, 45, 67,
                          100, 44, 28, 1, 3};
         
      OneDimLab obj = new OneDimLab (array);
      System.out.println ("Max: " + obj.findMax());
      System.out.println ("Min: " + obj.findMin());
      System.out.println ("Max index: " + obj.findMaxIndex());
      System.out.println ("Min index: " + obj.findMinIndex());
      System.out.println ("The fact that 3 is in the array is: " + obj.find (3));
      
      System.out.println("Contents of positive array: " + Arrays.toString(obj.posArray()));
      System.out.println("Contents of negative array: " + Arrays.toString(obj.negArray()));
      				   
      	
      System.out.println("Contents of even array: " + Arrays.toString(obj.evenMembers()));  
      System.out.println("Contents of odd number array: " + Arrays.toString(obj.oddMembers())); 			
         
      	      
      System.out.println("Sum : " + obj.sum());
      System.out.println("Avg : " + obj.average());
      
   }  // main
   
}
/*
----jGRASP exec: java OneDimLab
 
 Max: 100
 Min: -100
 Max index: 16
 Min index: 7
 The fact that 3 is in the array is: true
 Contents of positive array: [15, 25, 75, 9, 99, 21, 23, 40, 45, 67, 100, 44, 28, 1, 3]
 Contents of negative array: [-5, -2, -80, -100]
 Contents of even array: [-2, -80, -100, 40, 100, 44, 28]
 Contents of odd number array: [15, -5, 25, 75, 9, 99, 21, 23, 45, 67, 1, 3]
 Sum : 408
 Avg : 22.0
 
  ----jGRASP: operation complete.

*/