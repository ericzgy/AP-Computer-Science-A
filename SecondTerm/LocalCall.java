//Eric Guan
public class LocalCall extends PhoneCall
{
private double rate;
public LocalCall(int a, int b)
{
super(b);
rate = a;
}
public double getRate()
{
return rate;
}
public int totalcost()
{
return super.totalcost();
}
public String toString()
{
return super.toString() + " LC";
}
}