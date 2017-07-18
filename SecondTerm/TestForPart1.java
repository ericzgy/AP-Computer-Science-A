//Eric Guan, Period 3
public class TestForPart1
{
public static void main(String [] args)
{
Warrior lau = new Warrior("lau", 'N');
Warrior pete = new Warrior("Peter", 'J');


System.out.println(lau);
System.out.println(pete);

lau.fight(pete);
}
}


/****
 ----jGRASP exec: java TestForPart1
 
 Name: lau Clique: N IQ: 145 Strength: 24
 Name: Peter Clique: J IQ: 113 Strength: 66
 lau wins  by IQ
 
  ----jGRASP: operation complete.
     ----jGRASP exec: java TestForPart1
 
 Name: lau Clique: N IQ: 144 Strength: 50
 Name: Peter Clique: J IQ: 130 Strength: 61
 Peter wins on strength
 
  ----jGRASP: operation complete.
****/