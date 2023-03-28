package batch_4.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/employee")
public class Employee {
	
	@GET
	@Path("/annualsal/{id},{name},{sal}")
	public String annualSal(@PathParam("id")int id,@PathParam("name")String name,@PathParam("sal")int sal) {
		int annualsalary = (sal*12);    
		String s=String.valueOf(annualsalary);    
		return "Annual Salary is "+s;
	}

}
