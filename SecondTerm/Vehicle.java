//Eric Guan, 11/20/14, 3rd Period
import java.util.Scanner;
public class Vehicle
{
   private String name;
   private int cylinders;
   private Person owner;
   public Vehicle() 
   {
      name = "Honda";
      cylinders = 3;
      owner = new Person("George", 24);
   }
   public Vehicle(String name, int cylinders, Person owner)
   {
      this.name = name;
      this.cylinders = cylinders;
      this.owner = owner;
   }
   public String getName()
   {
      return name;
   }
   public void setName(String a)
   {
      name = a;
   }
   public int getCylinders()
   {
      return cylinders;
   }
   public void setCylinders(int a)
   {
      cylinders = a;
   }
   public void setOwner(Person a)
   {
      owner = a;
   }
   public String getNameofPerson()
   {
      return owner.getName();
   }
   public int getAgeofPerson()
   {
      return owner.getAge();
   }
   public String toString()
   {
      return owner + "\nCar: " + name + "\nCylinders: " + cylinders;
   }
   public boolean equals (Vehicle other)
   {
      return this.name.equals(other.name) && this.cylinders == other.cylinders && this.owner.equals(other.owner);
   }
}
