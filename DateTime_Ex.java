import java.time.ZoneId;
import java.time.ZonedDateTime;


public class DateTime_Ex
{
    public static void main(String args[])
    {
        // Program to display the different time zones
        System.out.println("Time Zones using joda API & ZoneId class");
        
        // zone selection
        ZoneId ind = ZoneId.of("Asia/Kolkata");
        ZoneId usa = ZoneId.of("America/New_York");
        System.out.println(ZonedDateTime.now(ind));
        System.out.println(ZonedDateTime.now(usa));
         //ZonedDateTime zt =  ZonedDateTime.now(ind);
    }
}