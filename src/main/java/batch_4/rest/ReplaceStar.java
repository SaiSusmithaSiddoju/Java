package batch_4.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
@Path("/star")
public class ReplaceStar {
	
	@GET
	@Path("/replacestar/{s1},{s2}")
	public String replaceChar(@PathParam("s1")String s1,@PathParam("s2")String s2) {
		char ch[] = s2.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(s1.contains(ch[i]+"")){
				s2=s2.replace(ch[i], '*');
			}
		}
		return s2+"";
		
		
	}

}
