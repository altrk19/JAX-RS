package _03.queryParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/library-queryParam")
public class LibraryResourceQueryParam {

	@GET
	@Path("/book")
	
	//SpringMVC -> @RequestParam
	//JAX-RS    ->@QueryParam
	//http://localhost:8080/RESTEasyWeek02v1/root-path/library-queryParam/book?ISBN=854752ASD2
	public String bookById(@QueryParam("ISBN")String id) {
		return "bookById : "+ id;
	}
	
	@GET
	@Path("book/price")
	//http://localhost:8080/RESTEasyWeek02v1/root-path/library-queryParam/book/price?lowPrice=100&highPrice=750
	public String booksByPrice(@QueryParam("lowPrice")int lowPrice, @QueryParam("highPrice") int highPrice) {
		return "bookById : "+lowPrice+", "+highPrice; 
	}
}
