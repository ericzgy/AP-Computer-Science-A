//Eric Guan, Period 3
public class Freak extends Warrior
{
   private int iq, strength;
   public Freak(String name, char type)
   {
      super(name, type);
      super.setiq(iq);
      super.setStrength(strength);
   }
   public void generateStats()
   {
   
      iq = (int)(Math.random() * 121 + 60);
      strength = (int)(Math.random() * 100 + 1);
   
   }
 
}