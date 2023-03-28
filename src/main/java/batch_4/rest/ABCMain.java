package batch_4.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/abc")
public class ABCMain {
	@GET
	@Path("/display_id/{a}")
	@Produces(MediaType.TEXT_HTML)
	public String display(@PathParam("a")int a) {
		ABC ab = new ABC();
		ab.assignid(a);
		return ab.a+"";
	}
	
}
