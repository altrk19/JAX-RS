package service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import controller.RestMessageController;

@ApplicationPath("/")        //		/root-path kullanabilirsin        ../root-path/messages/greeting           �eklinde eri�ebiliriz.
// 			/* kullanma
//          /root-path/*          kullanma
public class RegisterApplication extends Application{

	private Set<Object> singletons = new HashSet<Object>();
	
	public RegisterApplication () {
		singletons.add(new RestMessageController());		//constructor da yeni bir messagecontroller s�n�f� ekleniyor
	}
	
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
// rest service siniflari ,. singleton ya da her istek kar�l�g�nda olabilir.
//singleton : b�t�n istekler i�in sadece 1 tane obje olusacak. servlet mant�g�nda oldugu gibi. servlet yaklas�m� da asl�nda restfull yakla��m�d�r
