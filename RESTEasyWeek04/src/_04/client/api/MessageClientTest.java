package _04.client.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;

public class MessageClientTest {
	public static void main(String[] args) {
		String URI="http://localhost:8080/RESTEasyWeek04/root-path/message-client-api/message";
		
		Client client=ClientBuilder.newClient();
		//newClient yeni bir  Client objesi olusturur
		
		WebTarget target=client.target(URI);
		//WebTarget objesi olusturmak i�in client objesinden yararlan�r�z.
		//WebTarget arabirimi, belirttigimiz URI adresini cagirmamizi saglar.WebTarget objemizi olusturduktan sonra artik request metodu yardimiyla ilgili URI adresine istekte bulunabiliriz/cagirabiliriz/invoke
		Invocation.Builder builder=target.request();
		
		String message=builder.get(String.class);
		
		System.out.println(message);
	}
}


//Client arabirimi , JAX-RS client API'nin giri� noktas�d�r.'
//Client objeleri, socket connection y�netmekten sorumludur
//Client objelerini ClientBuilder abstract class yard�m�yla olustururuz.