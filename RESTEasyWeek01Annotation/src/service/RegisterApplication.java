package service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import controller.RestMessageController;

@ApplicationPath("/")        //		/root-path kullanabilirsin        ../root-path/messages/greeting           þeklinde eriþebiliriz.
// 			/* kullanma
//          /root-path/*          kullanma
public class RegisterApplication extends Application{

	private Set<Object> singletons = new HashSet<Object>();
	
	public RegisterApplication () {
		singletons.add(new RestMessageController());		//constructor da yeni bir messagecontroller sýnýfý ekleniyor
	}
	
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
// rest service siniflari ,. singleton ya da her istek karýlýgýnda olabilir.
//singleton : bütün istekler için sadece 1 tane obje olusacak. servlet mantýgýnda oldugu gibi. servlet yaklasýmý da aslýnda restfull yaklaþýmýdýr
