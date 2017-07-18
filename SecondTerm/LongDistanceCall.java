//Eric Guan, Period 3
public class  LongDistanceCall extends PhoneCall
{
public LongDistanceCall (int a)
{
super(a);
}
public double getRate()
{
return 6.0;
}
public int totalcost()
{
return super.totalcost();
}
public String toString()
{
 return super.toString() + " LD";
}
}