//Eric Guan, Period 3
public class TestForPartTwo
{
   public static void main (String [] args)
   {
      Warrior [] fighters = new Warrior[5];
      fighters[0] = new Nerd("lau", 'N');
      fighters[1] = new Jock("pete", 'J');
      fighters[2] = new Prep("tiffany", 'P');
      fighters[3] = new Thug("demarcus", 'T');
      fighters[4] = new Freak("bob", 'F');
      int k = (int)(Math.random()*5);
      int a = (int)(Math.random() * 5);
      if(a == k)
      {
         for(int j = 1;j>0;j++)
            a = (int)(Math.random() * 5);
      }
      System.out.println(fighters[k]);
      System.out.println(fighters[a]);
      fighters[k].fight(fighters[a]);
   }
}

/****
----jGRASP exec: java TestForPartTwo
 
 Name: tiffany Clique: P IQ: 93 Strength: 65
 Name: demarcus Clique: T IQ: 90 Strength: 83
 demarcus wins on strength
 
  ----jGRASP: operation complete.
   
  ----jGRASP exec: java TestForPartTwo
 
 Name: demarcus Clique: T IQ: 37 Strength: 92
 Name: lau Clique: N IQ: 161 Strength: 60
 lau wins by IQ
 
  ----jGRASP: operation complete.
  ----jGRASP exec: java TestForPartTwo
 
 Name: demarcus Clique: T IQ: 54 Strength: 86
 Name: bob Clique: F IQ: 112 Strength: 32
 bob wins by IQ
 
  ----jGRASP: operation complete.
     ----jGRASP exec: java TestForPartTwo
 
 Name: bob Clique: F IQ: 158 Strength: 9
 Name: lau Clique: N IQ: 167 Strength: 73
 lau wins on strength
 
  ----jGRASP: operation complete.
       ----jGRASP exec: java TestForPartTwo
 
 Name: demarcus Clique: T IQ: 84 Strength: 90
 Name: pete Clique: J IQ: 98 Strength: 55
 demarcus wins on strength
 
  ----jGRASP: operation complete.
****/