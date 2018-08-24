package _02.response;



import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/person-resource")
public class PersonResource {

	@GET
	@Path("/name")
	//http://localhost:8080/RESTEasyWeek04/root-path/person-resource/name
	public Response getPersonName() {
		String name="ali";
		ResponseBuilder builder=Response.ok(name);			//ok  HTTP 200'e karsýlýk geliyor
		
		builder.header("myHeader", "value");              //ResponseBuilder ile header ekleyebiliyorz
		builder.cookie(new NewCookie("myCookie","cookieValue"));		//cookie de eklenir
		
		return builder.build();         //metodumuz geriye javax.ws.rs.core.Response tipinde donmektedir.
	}
	
	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_JSON)
	//http://localhost:8080/RESTEasyWeek04/root-path/person-resource/person
	public Response getPersonById() {
		Person person = new Person(100, "Ali", "Bey");
		Person person2 = new Person(101, "Umut", "Can");
		Person person3 = new Person(102, "James", "Gosling");
		
		List<Person> persons=Arrays.asList(person,person2,person3);
		return Response.ok(persons).build();        //builder'a denk geliyor
	}
	//Geçen hafta liste geriye dönmüþtük. bu hafta response nesnesi üzerinden dönüþ yapýtýk. ikisi de legaldir.
	//genericEntity yapýsý da kullanýlabilir.
	// GenericEntity<List<Person>> genericEntity = new GenericEntity<List<Person>>(persons) {};
    // return Response.ok(genericEntity).build();              //40. satýra yazýlmalý
}
