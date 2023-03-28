
package batch_4.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 @Path("/type")                                                         
public class Datatype {
	
	@GET
	@Path("/finddatatype/{n1}")
	@Produces(MediaType.TEXT_HTML)
	public String finddt(@PathParam("n1")String n) {
		
		try {
			int i = Integer.parseInt(n);
			return "Given "+i+" is Integer";
			
		} catch (Exception e) {
			// TODO: handle exception
			try {
				Double ff = Double.parseDouble(n);
				return "Given "+ff+" is double";
			} catch (Exception e2) {
				// TODO: handle exception
				return "Given "+n+" is String";
			}
			
		}
	}
}
