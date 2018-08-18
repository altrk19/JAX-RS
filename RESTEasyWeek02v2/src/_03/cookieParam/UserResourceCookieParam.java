package _03.cookieParam;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/user-cookieParam")
public class UserResourceCookieParam {
	
	@GET
	@Path("/create")
	//http://localhost:8080/RESTEasyWeek02v2/root-path/user-cookieParam/create            //cookie olusturuldu
	public Response createCookie() {
		ResponseBuilder builder=Response.ok("cookie added!");
		builder.cookie(new NewCookie("cookieName","cookieValue"));
		
		return builder.build();
	}


	@GET
	@Path("/cookie")
	//http://localhost:8080/RESTEasyWeek02v2/root-path/user-cookieParam/cookie           //eklenen cookie okundu
	public Response getCookie(@CookieParam("cookieName")String cookie) {
		ResponseBuilder builder=Response.ok("Cookie found! "+cookie);
		return builder.build();
	}
	
}