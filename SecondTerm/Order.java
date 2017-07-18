//Eric Guan, 11/20/14, 3rd Period
import java.util.Scanner;
public class Order
{
   private String name;
   private int number, quantity;
   private double price;
   public Order (String name, int number, int quantity, double price)
   {
      this.name = name;
      this.number = number;
      this.quantity = quantity;
      this.price = price; 
   }
   public String getName()
   {
      return name;
   }
   public int getNumber()
   {
      return number;
   }
   public int getQuantity()
   {
      return quantity;
   }
   public double getPrice()
   {
      return price;
   }
   public double computePrice()
   {
      return quantity * price;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public void setNumber(int number)
   {
      this.number = number;
   }
   public void setQuantity(int quantity)
   {
      this.quantity = quantity;
   }
   public void setPrice(double price)
   {
      this.price = price;
   }
   public String toString()
   {
      return "\nName: " + name + "\nCustomer Number: " + number + "\nQuantity: " + quantity + "\nPrice: " + price;
   }
   public boolean equals (Order other)
   {
      return name.equals(other.name) && number == other.number && quantity == other.quantity && price == other.price;
   }
   public static class ExtraChargeOrder extends Order
   {
      public ExtraChargeOrder(String name, int number, int quantity, double price)
      {
         super(name, number, quantity, price);
      }
      public double computePrice()
      {
         return super.computePrice() + 4;
      }
   }
   public static void main (String [] args)
   {
      Order smallOrder = new Order ("Tom", 123, 20, 12.99);
      Order secondOrder = new Order ("Tom", 123, 20, 12.99);
      ExtraChargeOrder largeOrder = new ExtraChargeOrder ("John", 456, 1000, 25.99);
      System.out.println (smallOrder.computePrice());
      System.out.println (largeOrder.computePrice());
      System.out.println (smallOrder);
      System.out.println (largeOrder);
      System.out.println (smallOrder == secondOrder);
      System.out.println (smallOrder.equals(secondOrder)); 
   } 
}
/*
----jGRASP exec: java Order
 
 259.8
 25994.0
 
 Name: Tom
 Customer Number: 123
 Quantity: 20
 Price: 12.99
 
 Name: John
 Customer Number: 456
 Quantity: 1000
 Price: 25.99
 false
 true
 
  ----jGRASP: operation complete.
 */