//Eric Guan, Period 3
public class Nerd extends Warrior
{
   private int iq, strength;
   public Nerd(String name, char type)
   {
      super(name, type);
      super.setiq(iq);
      super.setStrength(strength);
   
   }
   public void generateStats()
   { 
      iq = (int)(Math.random() * 61 + 120);
      strength = (int)(Math.random() * 61 + 20);
   }


}