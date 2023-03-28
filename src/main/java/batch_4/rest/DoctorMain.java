package batch_4.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/doctor")
public class DoctorMain {
	@GET
	@Path("/main")
	@Produces(MediaType.TEXT_HTML)
	public String main() {
	
	Cardio c = new Cardio();
	return c.heartcheck() + "<br>"+c.bpcheck();
	}

}
