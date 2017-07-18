//Eric Guan
import java.util.*;
public class ACSLIntermediatesecond
{
public static void main (String [] args)
{
ask();
}
public static void goForOneOutofFive(String s)
{
System.out.print("hi");
}
public static void ask()
{
Scanner console = new Scanner(System.in);
System.out.print("'(");
String a = console.next();
System.out.print(")");
goForOneOutofFive(a);
String b = console.next();
goForOneOutofFive(b);
String c = console.next();
goForOneOutofFive(c);
String d = console.next();
goForOneOutofFive(d);
String e = console.next();
goForOneOutofFive(e);
}
}