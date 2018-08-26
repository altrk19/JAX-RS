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
	
	
	
	//POSTMAN'de header alanýna istedigimiz tipi yazýyoruz ve istenilen sonucu alýyoruz. ayný istekle birden fazla veri tipi elde ediyoruz. Client hangisini isterse o tipte alýyor.
	//POSTMAN'de key alanýna Accept   value alanýna application/json , application/xml veya text/html yazýyoruz
	
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
	
	
	
	
	//POSTMAN'de key alanýna Accept   value alanýna application/json  veya application/xml yazýyoruz
	@GET
	@Path("/customerFormat")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})					//biz bunu kullanýyoruz. tek istekle iki veri tipine response ediyoruz
	//http://localhost:8080/RESTEasyWeek05/root-path/customer-root/customerFormat
	public Customer getCustomerFormat() {
		System.out.println("getCustomerFormat");
		return new Customer(1, "ali");
	}
}
