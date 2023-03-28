package com.pack;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UnderScore")
public class UnderScore {
	@GET
	@Path("/keepunderscore/s/{n}")
	@Produces(MediaType.TEXT_HTML)
	public String keepUnderScore(@PathParam("s")String s,@PathParam("n")int n) {
	char a[] = s.toCharArray();
		char und='_';
		String str=" ";
		for(int i=0;i<a.length;i++) {
			if(i%n==0) {
				//a[n-1]=und;
				str+="_";
			}
			//if(i>a.length) {
				//a[a.length+1]=und;
			//}
			str+=s.charAt(i);
				
		}
		return (str);
		
	}
}
