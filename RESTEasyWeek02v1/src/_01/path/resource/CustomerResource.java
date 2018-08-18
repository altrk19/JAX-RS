package _01.path.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/customer-path")
public class CustomerResource {
	
	@GET
	//http://localhost:8080/RESTEasyWeek02v1/root-path/customer-path
	public String helloMessage() {
		return "Hello Message";
	}
	
	
//	@GET
//	public String helloMessage2() {       		//default olarak path vermeden 2. kez metot tan�mlarsak 1. �al�s�r warning verir. path vermemiz laz�m
//		return "Hello Message";
//	}
	
	@GET
	@Path("/hello.message2")
	//http://localhost:8080/RESTEasyWeek02v1/root-path/customer-path/hello.message2
	public String helloMessage2() {
		return "Hello Message2";
	}
	
	@POST
	@Path("/hello.message2")            //post oldugu i�in ayn� adres olabilir
	public String helloMessage3Post() {
		return "Hello Message2 POST!";
	}
}



//create amac� : post
//update amac� : put