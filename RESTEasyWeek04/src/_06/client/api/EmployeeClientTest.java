package _06.client.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class EmployeeClientTest {

	public static void main(String[] args) {
		String URI = "http://localhost:8080/RESTEasyWeek04/root-path/employee-client-api/addEmployee";
		//
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URI);

		Entity<Employee> jsonEntity = Entity.json(new Employee(1, "ali", "bey"));

		Invocation.Builder builder = target.request();

		Response message = builder.post(jsonEntity);

		System.out.println(message.readEntity(String.class));

	}
}
