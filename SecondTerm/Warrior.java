//Eric Guan, Period 3
public abstract class Warrior
{
   private String name;
   private char type;
   private int iq, strength;
   public Warrior(String name, char type)
   {
      this.name = name;
      this.type = type;
      generateStats();
   }
   public int getiq()
   {
      return iq;
   }
   public String getName()
   {
      return name;
   }
   public int getStrength()
   {
      return strength;
   }
   public char getType()
   {
      return type;
   }
   public void setiq(int other)
   {
      iq = other;
   }
   public void setStrength(int strength2)
   {
      strength = strength2;
   }
   public abstract void generateStats();
 
   public boolean equals(Warrior other)
   {
      if(getName().equals(other.getName()))
      {
         if(getType() == other.getType())
         {
            if(getiq() == other.getiq())
            {
               if(getStrength() == other.getStrength())
               {
                  return true;
               }
            }
         }
      }
      return false; 
   }
  
   public String toString()
   {
      return "Name: " + getName() + " Clique: " + getType() + " IQ: " + getiq() + " Strength: " + getStrength();
   }
   
   public Warrior fight(Warrior other)
   {
      if(getiq() - other.getiq() >= 20)
      {
         return this;
      }
      else if(other.getiq() - getiq() >= 20)
      {
         return other;
      }
      else if(getStrength() > other.getStrength())
      {
         return this;
      }
      else
         return other;
   }
}