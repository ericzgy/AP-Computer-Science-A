//Eric Guan, Period 3
public class ReducedRateCall extends LongDistanceCall
{
public ReducedRateCall(int a)
{
super(a);
}
public double getRate()
{
return 3.0;
}
public int totalcost()
{
return super.totalcost();
}
public String toString()
{
return super.toString() + "RR";
}
}