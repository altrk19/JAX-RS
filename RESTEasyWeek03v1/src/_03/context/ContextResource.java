package _03.context;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Path("/context")
public class ContextResource {
	
//	 @Context annotation’ini asagidaki tiplere ait objeleri inject etmek icin kullanabiliriz. 
//	 Onceki orneklerimizde HttpHeaders ve UriInfo icin @Context annotation’ini kullandik.
	// javax.ws.rs.core.HttpHeaders
	// javax.ws.rs.core.UriInfo
	// javax.ws.rs.core.Request
	// javax.servlet.http.HttpServletRequest
	// javax.servlet.http.HttpServletResponse
	// javax.servlet.ServletConfig
	// javax.servlet.ServletContext
	// javax.ws.rs.core.SecurityContext

	@GET
	@Path("/servletContext")
	// http://localhost:8080/RESTEasyWeek03v1/root-path/context/servletContext
	public String injectServletContext(@Context ServletContext context) {

		String contextPath = context.getContextPath();
		return contextPath;
	}

	@GET
	@Path("/request")
	// http://localhost:8080/RESTEasyWeek03v1/root-path/context/request
	public String injectHttpServletRequest(@Context HttpServletRequest request) {
		String pathInfo = request.getPathInfo();
		return pathInfo;
	}
}


//NOT : Java Build Path'den Tomcat silinir ve pom.xml'e aþaðýdaki dependecy eklenirse sorunsuz çalýþýr
//<dependency>
//<groupId>javax.servlet</groupId>
//<artifactId>javax.servlet-api</artifactId>
//<version>4.0.0</version>
//</dependency>