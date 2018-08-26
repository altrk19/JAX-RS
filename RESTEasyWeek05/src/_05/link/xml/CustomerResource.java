package _05.link.xml;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

//2. yöntemi yaptýk. linki response olarak  xml içerisine gömdük

@Path("/customer-link")
public class CustomerResource {

	@GET
	@Path("/customer/{id}")
	@Produces(MediaType.APPLICATION_XML)
	// http://localhost:8080/RESTEasyWeek05/root-path/customer-link/customer/1
	public Customer getCustomer(@PathParam("id") int id) {

		Customer customer = new Customer();
		customer.setId(id);
		customer.setFirstName("levent");
		customer.setLastName("erguder");

		UriBuilder builder = UriBuilder.fromResource(CustomerResource.class).path(CustomerResource.class,      //updateCustomer metotunun linkini al diyoruz. yarýn birgün link'i deðiþtirsek bile burdan dinamik olarak çektigimiz için linki sorun olmayacak.
				"updateCustomer");																				//aþaðýda tanýmladýk bu metotu

		Link updateLink = Link.fromUri(builder.build()).rel("update").build();

		//
		builder = UriBuilder.fromResource(CustomerResource.class).path(CustomerResource.class, "deleteCustomer");	//aþaðýda tanýmladýk bu metotu
		Link deleteLink = Link.fromUri(builder.build()).rel("delete").build();

		//
		List<Link> links = new ArrayList<Link>();

		links.add(updateLink);
		links.add(deleteLink);

		customer.setLinks(links);           //linkler setlendi
		return customer;
	}

	@PUT
	@Path("/customer.update")
	@Consumes(MediaType.APPLICATION_XML)
	public void updateCustomer(Customer customer) {
		// update method
	}

	@DELETE
	@Path("/customer.delete")
	public void deleteCustomer(int id) {
		// update method
	}

}
