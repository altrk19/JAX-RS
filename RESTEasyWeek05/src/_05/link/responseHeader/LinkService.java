package _05.link.responseHeader;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;

//response'un header alanına link ekledik.(ilk yöntem)

@Path("/link-path")
public class LinkService {

	@GET
	@Path("/test1")
	// http://localhost:8080/RESTEasyWeek05/root-path/link-path/test1
	public Response test1LinkMethod() {
		// rel : relation
		// https://tools.ietf.org/html/rfc5988
		Link link1 = Link.fromUri("http://localhost/root/customers/all").rel("section").type("text/plain").build();						
		//burada link objesi olusturduk. Link bilgisi response header'da yer alacak.

		Link link2 = Link.fromUri("http://{host}/root/customers/{id}").rel("self").type("text/plain").build("localhost",
				"1234");
		//link1 ve link2 ; link olusturmak için kullanılan yöntemler
		
		System.out.println(link1.toString());
		System.out.println(link2.toString());

		Response response = Response.ok("Check Response Header!").links(link1, link2).build();
		return response;
	}
}


//linki cevaba 2 şekilde ekleyebiliyoruz. 1.si response'a header olarak ekleyebiliyoruz.
//ya da 2. yöntem olan xml içerisine linkleri gömebiliriz.
//biz burada ilk yöntemi yaptık. 
//F12->Network       response header alanına bakılırsa link eklendigi görülür.