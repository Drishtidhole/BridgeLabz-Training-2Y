package Built_in_functions;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class timezone  {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current Time in GMT: " + gmtTime);


        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST: " + istTime);

        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current Time in PST: " + pstTime);
    }
}

