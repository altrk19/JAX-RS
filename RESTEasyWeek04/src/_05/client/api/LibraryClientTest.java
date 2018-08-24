package _05.client.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class LibraryClientTest {

	public static void main(String[] args) {
		String URI="http://localhost:8080/RESTEasyWeek04/root-path/library-client-api/welcome";
		
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target(URI);
		Invocation.Builder builder=target.request();
		Response response=builder.get();
		
		//1. yöntem														//console'a string yazdýrma
		String message=response.readEntity(String.class);
		System.out.println(message);
		
		//2. yöntem
		
		String message2=builder.get(String.class);
		System.out.println("##way 2##");
		System.out.println("Response Status:"+response.getStatus());
		System.out.println(message2);
	}
}
