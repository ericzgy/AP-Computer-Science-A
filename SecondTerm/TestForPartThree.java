//Eric Guan, Period 3
import java.util.*;
public class TestForPartThree
{
   public static void main (String [] args)
   {
      ArrayList<Warrior> list = new ArrayList<Warrior>();
      list.add(new Nerd("lau", 'N'));
      list.add(new Jock("pete", 'J'));
      list.add(new Prep("tiffany", 'P'));
      list.add(new Thug("demarcus", 'T'));
      list.add(new Freak("bob", 'F'));
      for(int k = list.size() - 1;k>0;k--)
      {
         int a = (int)(Math.random() * list.size());
         if(a != 0)
         {
            if(list.get(a).fight(list.get(a-1)).equals(list.get(a)))
               list.remove(a-1);
            else 
               list.remove(a);
         }
         else if(list.get(a).fight(list.get(a+1)).equals(list.get(a)))
            list.remove(a+1);
         else 
            list.remove(a);
               
      }
      System.out.println(list);
   }
}


/***
  ----jGRASP exec: java TestForPartThree
 
 [Name: bob Clique: F IQ: 150 Strength: 69]
 
  ----jGRASP: operation complete.
  ----jGRASP exec: java TestForPartThree
 
 [Name: lau Clique: N IQ: 173 Strength: 72]
 
  ----jGRASP: operation complete.
  ----jGRASP exec: java TestForPartThree
 
 [Name: tiffany Clique: P IQ: 134 Strength: 60]
 
  ----jGRASP: operation complete.
  ----jGRASP exec: java TestForPartThree
 
 [Name: pete Clique: J IQ: 119 Strength: 97]
 
  ----jGRASP: operation complete.
***/