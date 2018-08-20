package _02.encoded;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.ws.rs.Encoded;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/employee-encoded")
public class EmployeeResource {
	
	/*
	 URI template, matrix, query, and form parameters hepsi HTTP specification'una g�re encode edilmesi gerekiyor
	 Varsay�lan olarak JAX-RS bunlar� decode ediyor ve ilgili java  tiplerine d�n��t�r�r. 
	*/
	
	/*
	 The @javax.ws.rs.Encoded annotation can be used on a class, method, or param. 
	 By default, inject @PathParam and @QueryParams are decoded. 
	 */


	@GET
	@Path("/getEmployeeNameEncoded")
	// http://localhost:8080/RESTEasyWeek03v1/root-path/employee-encoded/getEmployeeNameEncoded?name=[%27ali%20bey%27]
	
	//@Encoded kullanarak raw formatinda datayi alabiliriz.
	public String getEmployeeNameEncoded(@Encoded @QueryParam("name") String name) throws UnsupportedEncodingException {
		String decoded = URLDecoder.decode(name,"UTF-8");
		return "decoded : "+ decoded + " encoded : " + name;
	}

	@GET
	@Path("/getEmployeeName")
	// %5B%27ali%20bey%27%5D
	
	// http://localhost:8080/RESTEasyWeek03v1/root-path/employee-encoded/getEmployeeName?name=['ali bey']
	// http://localhost:8080/RESTEasyWeek03v1/root-path/employee-encoded/getEmployeeName?name=%5B%27ali%20bey%27%5D
	public String getEmployeeName(@QueryParam("name") String name) {                      //@Encoded kullan�lmadan da kendisi decode ediyor. raw format�nda veri almak i�in @Encoded kullan�l�yor
		return name;
	}

}

//@Encoded annotation ini otomatik olarak parametrenin degerinin decode edilmesine engel olur.