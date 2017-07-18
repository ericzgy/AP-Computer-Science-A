//Eric Guan
import java.util.*;
public class StudentBody
{
   private Student [] first = new Student [3];
   public StudentBody()
   {
      first[0] = new Student("eric", 1542700, 4.3);
      first[1] = new Student("eric", 1542700, 4.2);
      first[2] = new Student("eric", 1542700, 4.4);
   }
   public void init()
   {
      Scanner console = new Scanner(System.in);
      for(int k=0;k<first.length;k++)
      {
         System.out.print("Name? ");
         String a = console.next();
         first[k].setName(a);
         System.out.print(" id? ");
         int b = console.nextInt();
         first[k].setID(b);
         System.out.print(" GPA ");
         double c = console.nextDouble();
         first[k].setGPA(c);
      }
   }
   public String toString()
   {
      return  first[0] + " " + first[1] + " " + first[2];
   }
   public Student search(int id)
   {
      boolean check = false;
      for(int k = 0;k<first.length;k++)
      {
         if(first[k].getid() == id)
         {
            check = true;
            return first[k];
         }
      }
      return null;
   }
   public static void main (String [] args)
   {
      StudentBody students = new StudentBody();
      students.init();
      Scanner console = new Scanner(System.in);
      System.out.println("Enter the id of the student you are looking for: ");
      int studentID = console.nextInt();
      Student target = students.search(studentID);
      if(target != null)
         System.out.println(target);
      else 
         System.out.println("Student not found ... ");
      System.out.println("Student Body Information: " + students);
   }
}

/******
Name? Jay
  id? 1
  GPA 5.0
 Name? John
  id? 2
  GPA 3.46
 Name? James
  id? 3
  GPA 3.12
 Enter the id of the student you are looking for: 
 1
 
 Name: Jay
 ID: 1
 GPA: 5.0
 Student Body Information: 
 Name: Jay
 ID: 1
 GPA: 5.0 
 Name: John
 ID: 2
 GPA: 3.46 
 Name: James
 ID: 3
 GPA: 3.12

Name? Jay
  id? 1
  GPA 5.0
 Name? John
  id? 2
  GPA 3.4
 Name? James
  id? 3
  GPA 3.1
 Enter the id of the student you are looking for: 
 4
 Student not found ... 
 Student Body Information: 
 Name: Jay
 ID: 1
 GPA: 5.0 
 Name: John
 ID: 2
 GPA: 3.4 
 Name: James
 ID: 3
 GPA: 3.1
*****/