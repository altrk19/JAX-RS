package _02.headerParam;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

@Path("/login-headerParam")
public class LoginResourceHeaderParam {

	@GET
	@Path("/header")
	//@HeaderParam annotation'ý HTTP request parametresini inject eder.
	//http://localhost:8080/RESTEasyWeek02v2/root-path/login-headerParam/header
	public String userAgent(@HeaderParam("user-agent")String userAgent) {
		return userAgent;
	}
	
	@GET
	@Path("/header2")            //POSTMAN ile header ekledik         //name alanýna header1 value alanýna key1 yazdýk.
	//http://localhost:8080/RESTEasyWeek02v2/root-path/login-headerParam/header2            //burdaki tarayýcýda header ekleyemiyoruz ama postmanda header1 bilgisini ekledik(name header1 value key1)  ve key1 verisini okuduk
	public String userAgent2(@HeaderParam("user-agent")String userAgent, @HeaderParam("header1")String header1) {
		return userAgent + " , "+ header1;
	}
}

