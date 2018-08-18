package _01.formParam;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/person-formParam")
public class PersonResourceFormParam {
	
	@POST
	@Path("/person")
	public String createPerson(@FormParam("name")String name,@FormParam("surname")String surname) {
		return "insert!"+ name + " , "+ surname;
	}
}


//formdan gönderilmiþ olan datayý bind ediyoruz
//POSTMAN programýný açýp istegi POST ayarladýk
//http://localhost:8080/RESTEasyWeek02v2/root-path/person-formParam/person     linkini yazdýk
//body kýsmýna name ali     surname turk          bilgileri girildi ve send yapýldý. sonuc olarak girilen veriler geldi.