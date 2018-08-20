package _01.xml;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.jboss.resteasy.annotations.providers.jaxb.JAXBConfig;
import org.jboss.resteasy.annotations.providers.jaxb.Wrapped;

@Path("/persons-xml")
public class PersonResource {
	
	//1. yöntem
	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_XML)
	//http://localhost:8080/RESTEasyWeek03v2/root-path/persons-xml/person
	public Person personById() {
		Person person=new Person(1,"ali","bey");
		return person;
	}
	
	
	//XML dönmek için 2. yöntemmiz
	@GET
	@Path("/personWithJAXBContent")
	@Produces(MediaType.APPLICATION_XML)
	//http://localhost:8080/RESTEasyWeek03v2/root-path/persons-xml/personWithJAXBContent
	public String personByIdJAXB() throws JAXBException {
		Person person=new Person(2,"umut","can");
		JAXBContext context=JAXBContext.newInstance(Person.class);
		
		StringWriter writer=new StringWriter();
		context.createMarshaller().marshal(person, writer);
		return writer.toString();
	}
	
	
	//Geriye Liste dönmek istersek
	@GET
	@Path("/persons")
	@Produces(MediaType.APPLICATION_XML)
	@Wrapped(element = "list", namespace = "http://foo.org", prefix = "foo")                  //xml'de collection yazýsýný degistirdik.
	// Only for RESTEasy
	//http://localhost:8080/RESTEasyWeek03v2/root-path/persons-xml/persons
	public List<Person> persons(){
		Person person=new Person(1,"ali","bey");
		Person person2=new Person(2,"umut","can");
		Person person3=new Person(3,"ata","kan");
		
		List<Person> personList=new ArrayList<Person>();
		personList.add(person);
		personList.add(person2);
		personList.add(person3);
		
		return personList;
	}
	
	
	@GET
	@Path("/personsArray")
	@Produces(MediaType.APPLICATION_XML)
	@Wrapped(element = "list", namespace = "http://foo.org", prefix = "foo")
	// Only for RESTEasy
	// http://localhost:8080/RESTEasyWeek03v2/root-path/persons-xml/personsArray
	public Person[] personsArray() {
		Person person1 = new Person(1, "ali", "bey");
		Person person2 = new Person(2, "name1", "surname1");
		Person person3 = new Person(3, "name2", "surname2");

		Person[] persons = new Person[] { person1, person2, person3 };
		return persons;
	}
}
