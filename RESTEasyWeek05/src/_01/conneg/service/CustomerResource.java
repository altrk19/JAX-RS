package _01.conneg.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import _01.model.Customer;

@Path("/customer-root")
public class CustomerResource {

	@GET
	@Path("/hello")
	// http://localhost:8080/RESTEasyWeek05/root-path/customer-root/hello
	public String hello() {
		return "it is works!";
	}
	
	
	
	//POSTMAN'de header alan�na istedigimiz tipi yaz�yoruz ve istenilen sonucu al�yoruz. ayn� istekle birden fazla veri tipi elde ediyoruz. Client hangisini isterse o tipte al�yor.
	//POSTMAN'de key alan�na Accept   value alan�na application/json , application/xml veya text/html yaz�yoruz
	
	@GET
	@Path("/customer")
	@Produces(MediaType.TEXT_HTML)
	//http://localhost:8080/RESTEasyWeek05/root-path/customer-root/customer
	public String getCustomerText() {
		System.out.println("getCustomerText");
		return new Customer(1, "ali").toString();
	}

	@GET
	@Path("/customer")
	@Produces(MediaType.APPLICATION_JSON)
	//http://localhost:8080/RESTEasyWeek05/root-path/customer-root/customer
	public Customer getCustomerJSON() {
		System.out.println("getCustomerJSON");
		return new Customer(1, "ali");
	}

	@GET
	@Path("/customer")
	@Produces(MediaType.APPLICATION_XML)
	//http://localhost:8080/RESTEasyWeek05/root-path/customer-root/customer
	public Customer getCustomerXML() {
		System.out.println("getCustomerXML");
		return new Customer(1, "ali");
	}
	
	
	
	
	//POSTMAN'de key alan�na Accept   value alan�na application/json  veya application/xml yaz�yoruz
	@GET
	@Path("/customerFormat")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})					//biz bunu kullan�yoruz. tek istekle iki veri tipine response ediyoruz
	//http://localhost:8080/RESTEasyWeek05/root-path/customer-root/customerFormat
	public Customer getCustomerFormat() {
		System.out.println("getCustomerFormat");
		return new Customer(1, "ali");
	}
}
