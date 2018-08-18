package _04.pathSegment;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.PathSegment;

@Path("/car-pathSegment")
public class CarResourcePathSegment {

	@Path("/car/{search : criteria}")
	@GET
	//http://localhost:8080/RESTEasyWeek02v1/root-path/car-pathSegment/car/criteria;brand=samsung;color=red,white,blue
	//http://localhost:8080/RESTEasyWeek02v1/root-path/car-pathSegment/car/criteria;brand=samsung;color=red;color=white
	public String searchCar(@PathParam("search") PathSegment pathSegment) {
		List<String> colors=pathSegment.getMatrixParameters().get("color");	      //key vercez geriye liste dönüyor
		String brand=pathSegment.getMatrixParameters().getFirst("brand");	
		return "brand : "+brand+" , colors"+colors;
	
	}
}
//pathSegment yerine matrixParam kullanmak daha kolay
//pathSegment ile de parametrelere eriþim saglanabiliyor. pathParam ve queryParam ile daha kolay olabiliyor