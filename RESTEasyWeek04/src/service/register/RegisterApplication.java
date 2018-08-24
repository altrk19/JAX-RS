package service.register;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//import _01.http.response.HttpResponseResource;
//import _02.response.PersonResource;
//import _03.exception.CustomerResource;
//import _04.exception.mapper.CustomerResourceMapper;
//import _05.client.api.MessageResource;
//import _06.client.api.LibraryResource;
//import _07.client.api.EmployeeResource;


@ApplicationPath("/root-path") // OK
public class RegisterApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public RegisterApplication() {
//		singletons.add(new HttpResponseResource());
//		singletons.add(new PersonResource());										//bunlarý eklemeye gerek yok
//		singletons.add(new CustomerResource());
//		singletons.add(new CustomerResourceMapper());
//		singletons.add(new MessageResource());
//		singletons.add(new LibraryResource());
//		singletons.add(new EmployeeResource());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
