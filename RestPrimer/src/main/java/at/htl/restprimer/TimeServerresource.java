package at.htl.restprimer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Path("time")
public class TimeServerresource {
    @GET
    public String time(){
        return "Time: " + LocalDateTime
                .now()
                .format(DateTimeFormatter.ofPattern("dd. MMMM yyyy, hh:mm:ss"));
    }
}
