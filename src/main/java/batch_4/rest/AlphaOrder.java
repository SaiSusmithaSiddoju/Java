package batch_4.rest;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/alphaorder")
public class AlphaOrder {
	
	@GET
	@Path("/order/{s}")
	public String order(@PathParam("s")String s) {
		String str = s;
		String p="";
		str=str.toLowerCase();
		char a[] = str.toCharArray();
		Arrays.sort(a);
		//p+=a;
		return (new String(a));
		
	}

}
