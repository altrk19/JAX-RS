package _05.client.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

public class LibraryClientTest3 {

	public static void main(String[] args) {
		String URI="http://localhost:8080/RESTEasyWeek04/root-path/library-client-api/bookXML";
		
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target(URI);
		Invocation.Builder builder=target.request();
		
		
		//1. y�ntem											//string format�nda yazar
     	Response response=builder.get();
		Book book=response.readEntity(Book.class);	
		System.out.println(book);
	
		
		
//		//2. y�ntem											//string format�nda yazar
//		Response response2=builder.get();
//		Book book2=response2.readEntity(new GenericType<Book>(){});
//		System.out.println(book2);
		
		
		
		//3. y�ntem                                        //xml format�nda console'a yazar
		Response response3=builder.get();
		String xmlData=response3.readEntity(String.class);
		System.out.println("XML Format : "+xmlData);
	}
}
