package batch_4.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/998")
public class NineNineEight {
	@GET
	@Path("/value/{s}")
	@Produces(MediaType.TEXT_HTML)
	public String value(@PathParam("s") String s) {
		String str=s;
		char st[] = str.toCharArray();
		String a1 = "abcdefghi";
		String a2 = "jklmnopqr";
		String a3 = new String(new char[]{'s','t','u','v','w','x','y','z'});
		String res="";
		
		for(int i = 0;i<st.length;i++) {
			if(a1.contains(st[i]+"")) {
				res+="1"+(a1.indexOf(st[i])+1);
			}
			else if(a2.contains(st[i]+"")) {
				res+="2"+(a2.indexOf(st[i])+1);
			}
			else if(a3.contains(st[i]+"")) {
				res+="3"+(a3.indexOf(st[i])+1);
			}
			
		}
		return res;
	}
	
}
