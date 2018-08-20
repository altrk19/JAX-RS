package _01.defaultValue;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/car-defaultValue")
public class CarResourceDefaultValue {

	@GET
	@Path("/car")
	// http://localhost:8080/RESTEasyWeek03v1/root-path/car-defaultValue/car				//deger verilmedigi zaman hata vermemesi için default deger verildi
	//http://localhost:8080/RESTEasyWeek03v1/root-path/car-defaultValue/car?id=250
	public String getCarById(@DefaultValue("1000") @QueryParam("id") int id) {
		return "getCarById : " + id;
	}
}

//@DefaultValue is a parameter annotation that can be combined with any of the other
//@*Param annotations to define a default value when the HTTP request item does not exist.

//bu degerler icin kullilabilir;
//javax.ws.rs.PathParam
//javax.ws.rs.QueryParam
//javax.ws.rs.MatrixParam
//javax.ws.rs.CookieParam
//javax.ws.rs.FormParam
//javax.ws.rs.HeaderParam
