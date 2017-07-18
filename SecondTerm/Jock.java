//Eric Guan, Period 3
public class Jock extends Warrior
{
   private int iq, strength;
   public Jock(String name, char type)
   {
      super(name, type);
      super.setiq(iq);
      super.setStrength(strength);
   }
   public void generateStats()
   {
   
      iq = (int)(Math.random() * 61 + 80);
      strength = (int)(Math.random() * 51 + 50);
   }
 
}