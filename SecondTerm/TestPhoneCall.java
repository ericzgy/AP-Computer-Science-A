//Eric Guan, Period 3
public class TestPhoneCall
{
   public static void main (String [] args)
   {
      PhoneCall [] calls = new PhoneCall[4];
   
      calls[0] = new LocalCall(10, 2);
      calls[1] = new LongDistanceCall(3);
      calls[2] = new ReducedRateCall(8);
   
      for(PhoneCall call:calls)
         System.out.println(call);
   }
}
/*
 ----jGRASP exec: java TestPhoneCall
 
 Duration:2 Rate: 10.0 Total: 20 LC
 Duration:3 Rate: 6.0 Total: 18 LD
 Duration:8 Rate: 3.0 Total: 24 LDRR
 null
 
  ----jGRASP: operation complete.
 
*/