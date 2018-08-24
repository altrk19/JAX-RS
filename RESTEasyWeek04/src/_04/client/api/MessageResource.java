package _04.client.api;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/message-client-api")
public class MessageResource {
	
	@GET
	@Path("/message")
	//http://localhost:8080/RESTEasyWeek04/root-path/message-client-api/message
	public String getMessage() {
		return "Hello Client";
	}
	
	
	@GET
	@Path("/messages")
	@Produces(MediaType.APPLICATION_JSON)
	//http://localhost:8080/RESTEasyWeek04/root-path/message-client-api/messages
	public List<String> getMessages() {
		return Arrays.asList("Message1","Message2","Message3","Message4");
	}
}
