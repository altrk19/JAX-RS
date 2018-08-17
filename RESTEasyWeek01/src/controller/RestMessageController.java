package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class RestMessageController {

	@GET
	@Path("/greeting")
	
	// http://localhost:8080/RESTEasyWeek01/messages/greeting						->	web1.xml              (xml yaklas�m�)
	// http://localhost:8080/RESTEasyWeek01/resteasy/messages/greeting			 	->	web2.xml    			(xml yaklas�m�)
	// http://localhost:8080/RESTEasyWeek01/filter/messages/greeting				->web.xml                  (filter yaklas�m�)
	public String getMessage() {
		return "Hello RESTEasy world!!";
	}
}

//Bu tarz class'lar root classlar�m�z oluyor. Bunlar�n konf�g�rasyonu i�in �eitli yakla��mlar var. 
//1)xml 2)annotation 3)filter             Bu 3 y�ntemi inceleyelim. web.xml �zerinden konf�g�rasyon ayarl�yoruz

