package _01.http.response;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/http-response")
public class HttpResponseResource {
	
	@GET
	@Path("/response200")
	//http://localhost:8080/RESTEasyWeek04/root-path/http-response/response200                    //F12->Network->Response200
	public String response200() {
		return "hello response200";
	}
	
	@GET
	@Path("/responseNull")
	//http://localhost:8080/RESTEasyWeek04/root-path/http-response/responseNull
	//d�n�� null sa ya da metot void ise bu durumda HTTP 204 kodu d�ner. No Content
	public String responseNull() {
		return null;
	}
	
	@POST
	@Path("/response405")				//405 hatas� method not allowed : POST ile gidilmesi gereken yere GET ile gidersek bu hatay� al�r�z
	//http://localhost:8080/RESTEasyWeek04/root-path/http-response/response405
	public String response405() {
		return "response405 is invoked";
	}
}
