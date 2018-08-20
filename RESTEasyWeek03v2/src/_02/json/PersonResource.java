package _02.json;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.providers.jaxb.Wrapped;

@Path("/persons-json")
public class PersonResource {

	@GET
	@Path("/person")
	// http://localhost:8080/RESTEasyWeek03v2/root-path/persons-json/person

	@Produces(MediaType.APPLICATION_JSON)
	public Person personById() {
		Person person = new Person(1, "ali", "bey");
		return person;
	}

	@GET
	@Path("/persons")
	@Produces(MediaType.APPLICATION_JSON)
	@Wrapped(element = "list", namespace = "http://foo.org", prefix = "foo")
	// Only for RESTEasy
	// http://localhost:8080/RESTEasyWeek03v2/root-path/persons-json/persons
	public List<Person> persons() {
		Person person1 = new Person(1, "ali", "bey");
		Person person2 = new Person(2, "umut", "can");
		Person person3 = new Person(3, "name2", "surname2");

		List<Person> persons = new ArrayList<>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);

		return persons;
	}

	@GET
	@Path("/personsArray")
	@Produces(MediaType.APPLICATION_JSON)
	@Wrapped(element = "list", namespace = "http://foo.org", prefix = "foo")
	// Only for RESTEasy
	// http://localhost:8080/RESTEasyWeek03v2/root-path/persons-json/personsArray
	public Person[] personsArray() {
		Person person1 = new Person(1, "ali", "bey");
		Person person2 = new Person(2, "name1", "surname1");
		Person person3 = new Person(3, "name2", "surname2");

		Person[] persons = new Person[] { person1, person2, person3 };
		return persons;
	}

}
