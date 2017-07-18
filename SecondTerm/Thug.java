//Eric Guan, Period 3
public class Thug extends Warrior
{
   private int iq, strength;
   public Thug(String name, char type)
   {
      super(name, type);
      super.setiq(iq);
      super.setStrength(strength);
   }
   public void generateStats()
   {
   
      iq = (int)(Math.random() * 71 + 20);
      strength = (int)(Math.random() * 21 + 80);
   
   }

}