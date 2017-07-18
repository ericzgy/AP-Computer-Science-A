//Eric Guan, Period 3
public class Prep extends Warrior
{
   private int iq, strength;
   public Prep(String name, char type)
   {
      super(name, type);
      super.setiq(iq);
      super.setStrength(strength);
   }
   public void generateStats()
   {
   
      iq = (int)(Math.random() * 61 + 90);
      strength = (int)(Math.random() * 51 + 40);
   
   }
 
}