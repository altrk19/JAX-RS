package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class RestMessageController {

	@GET
	@Path("/greeting")
	
	// http://localhost:8080/RESTEasyWeek01/messages/greeting						->	web1.xml              (xml yaklasýmý)
	// http://localhost:8080/RESTEasyWeek01/resteasy/messages/greeting			 	->	web2.xml    			(xml yaklasýmý)
	// http://localhost:8080/RESTEasyWeek01/filter/messages/greeting				->web.xml                  (filter yaklasýmý)
	public String getMessage() {
		return "Hello RESTEasy world!!";
	}
}

//Bu tarz class'lar root classlarýmýz oluyor. Bunlarýn konfügürasyonu için çeitli yaklaþýmlar var. 
//1)xml 2)annotation 3)filter             Bu 3 yöntemi inceleyelim. web.xml üzerinden konfügürasyon ayarlýyoruz

