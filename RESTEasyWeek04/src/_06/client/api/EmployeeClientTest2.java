package _06.client.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class EmployeeClientTest2 {

	public static void main(String[] args) {
		String URI = "http://localhost:8080/RESTEasyWeek04/root-path/employee-client-api/addEmployeeXML";
		//
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URI);

		Entity<Employee> xmlEntity = Entity.xml(new Employee(1, "umut", "can"));

		Invocation.Builder builder = target.request();

		Response message = builder.post(xmlEntity);

		System.out.println(message.readEntity(String.class));

	}
}
