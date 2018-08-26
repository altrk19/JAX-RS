package service.register;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/root-path") // OK
public class RegisterApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public RegisterApplication() {

	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
