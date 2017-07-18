//Eric Guan, 11/2/14, 3rd Period
import java.util.Scanner;

public class Student
{
   private int id;
   private double gpa;
   private String studentName;
   public Student(String a, int b, double c)
   {
      id = b;
      studentName = a;
      gpa = c;
   }
   public String toString()
   {
      return "\nName: " + studentName + "\nID: " + id + "\nGPA: " + gpa;
   }
   public String getName()
   {
      return studentName;
   }
   public int getid()
   {
      return id;
   }
   public double getGPA()
   {
      return gpa;
   }
   public void setName(String a)
   {
      studentName = a;
   }
   public void setID(int a)
   {
      id = a;
   }
   public void setGPA(double a)
   {
      gpa = a;
   }
}


