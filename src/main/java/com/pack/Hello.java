package com.pack;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
@Path("/hello")
public class Hello {
	
	@GET
	@Path("/name") 
	public String name(@Context HttpServletRequest req) {
		String s = req.getParameter("user_name");
		return "Hello "+s;
	}
	@GET
	@Path("/place")
	@Produces(MediaType.TEXT_HTML)
	public String place(@Context HttpServletRequest rq) {
		String s =rq.getParameter("place");
		return "Sai stays in "+s;
	}
	
}
