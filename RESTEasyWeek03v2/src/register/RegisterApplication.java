package register;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/root-path")
public class RegisterApplication extends Application {
	
	private Set<Object> singletons=new HashSet<Object>();
	
	public RegisterApplication() {
		//servis s�n��flar�n� eklemiyoruz. kendi otomatik eliyor.
	}
	@Override
	public Set<Object> getSingletons() {
		return super.getSingletons();
	
	}
	
}
