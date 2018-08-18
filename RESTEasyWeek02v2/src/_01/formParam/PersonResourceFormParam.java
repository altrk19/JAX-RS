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


//formdan g�nderilmi� olan datay� bind ediyoruz
//POSTMAN program�n� a��p istegi POST ayarlad�k
//http://localhost:8080/RESTEasyWeek02v2/root-path/person-formParam/person     linkini yazd�k
//body k�sm�na name ali     surname turk          bilgileri girildi ve send yap�ld�. sonuc olarak girilen veriler geldi.