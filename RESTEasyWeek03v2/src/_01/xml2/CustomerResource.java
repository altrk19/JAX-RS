//HAS-A iliþkisi varsa aþaðýdaki gibi yazdýk

package _01.xml2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer-xml")
public class CustomerResource {

	@GET
	@Path("/customer")
	@Produces(MediaType.APPLICATION_XML)
	//http://localhost:8080/RESTEasyWeek03v2/root-path/customer-xml/customer
	public Customer customer() {
		Customer customer = new Customer();
		customer.setId(100);
		customer.setName("ali");
		//

		Address address = new Address();
		address.setCity("kocaeli");
		address.setZip("41000");

		customer.setAddress(address);

		return customer;

	}

}
