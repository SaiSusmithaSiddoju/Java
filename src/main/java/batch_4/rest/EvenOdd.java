package batch_4.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/addsub")
public class EvenOdd {

	@GET
	@Path("/evenodd/{n}")
	public String evenodd(@PathParam("n")String n) {
		String s[] = n.split(",");
		int sum = 0;
		for(int i=0;i<s.length;i++) {
			int x = Integer.parseInt(s[i]);
			if(x%2==0) {
				sum+=x;
			}
			else{
				sum-=x;
			}
		}
		return sum+"";
		
	}
}
