package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageService {

	@GET
	@Path("/greeting")

	// http://localhost:8080/JerseyWeek01/jersey/messages/greeting
	public String getMessage() {
		return "Hello Jersey world!!";
	}
}
