package _02.pathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;          //!!!!!!!dogru pkaeti ekle

@Path("/customer-pathParam")
public class CustomerResourcePathParam {
	
	@GET
	@Path("/customer/{id}")
	//@PathParam   -> JAX-RS
	//PathVariable ->SpringMVC
	
	//http://localhost:8080/RESTEasyWeek02v1/root-path/customer-pathParam/customer/100
	public String customerById(@PathParam("id") String customerid) {        //aman yanlýs paketteki pathParam'ý ekleme.     jawax.ws olaný ekle!!!!
		
		return "customerById: "+customerid;
	}
}
