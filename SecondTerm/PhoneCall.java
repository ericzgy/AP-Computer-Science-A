//Eric Guan, Period 3
public abstract class PhoneCall
{
private int duration;
public PhoneCall(int duration)
{
this.duration = duration;
}
public int getDuration()
{
return duration;
}
public abstract double getRate();
public int totalcost()
{
return (int)(getDuration() * getRate());
}
public String toString()
{
return "Duration:" + getDuration() + " " + "Rate: " + getRate() +  " " + "Total: " + totalcost();
}
}