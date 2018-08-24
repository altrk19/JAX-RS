package _04.client.api;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

public class MessageClientTest2 {

	public static void main(String[] args) {

		String URI="http://localhost:8080/RESTEasyWeek04/root-path/message-client-api/messages";
		
		Client client=ClientBuilder.newClient();
		
		WebTarget target = client.target(URI);
		Invocation.Builder builder = target.request();

		List<String> resultList = builder.get(new GenericType<List<String>>() {});

		System.out.println(resultList);

		client.close();

	}

}

//getMessages metodumuz geriye List ve JSON formatinda donmektedir.
//Jersey implementation icin burada GenericType‘i kullanabiliriz.