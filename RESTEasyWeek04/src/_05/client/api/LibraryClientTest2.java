package _05.client.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

public class LibraryClientTest2 {

	public static void main(String[] args) {
		String URI="http://localhost:8080/RESTEasyWeek04/root-path/library-client-api/book/{isbn}";
		
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target(URI).resolveTemplate("isbn", 200);         //pathparam vermek için kullanýrýz.
		Invocation.Builder builder=target.request();
		Response response=builder.get();
		
		//1. yöntem
		Book book=response.readEntity(Book.class);
		System.out.println(book);
		
		//2. yöntem
		Response response2=builder.get();
		Book book2=response2.readEntity(new GenericType<Book>(){});
		//System.out.println(book2);
		
		//3. yöntem                  //JSON formatýnda console'a yazdýrma
		Response response3=builder.get();
		String jsonData=response3.readEntity(String.class);
		System.out.println("JSON Format : "+jsonData);
	}
}
