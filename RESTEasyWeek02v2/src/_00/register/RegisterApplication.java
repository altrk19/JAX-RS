package _00.register;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/root-path")
public class RegisterApplication extends Application {
//!!!!!Burada resource sýnýflarýný register etmemiz gerekir.
	//Bu sýnýflar singleton ya da her istek sonrasýnda oluþan yapýda olabilir. Bizim dizaynýmýza kalmýþ.
	//singleton : bütün istekelre karþýlýk sadece bir tane ilgili service sýnýfý objesi olusmasý
	//Servletler ve Spring Bean'ler singleton yapýya örnektir.
	
	//Biz de bu örnegimizde singleton tanýmlýyoruz
	
	private Set<Object> singletons=new HashSet<Object>();
	
	//Constructor tanýmlýyoruz
	public RegisterApplication() {
//		singletons.add(new CustomerResource());                    //buraya eklemeler yapacagýz
//		singletons.add(new CustomerResourcePathParam());            //bu sýnýflara ait istek gelince tek obje olusturur
		//yenilik sayesinde diger sýnýflarý buraya yazmadýk otomatik halletti.
	}
	@Override
	public Set<Object> getSingletons() {
		// TODO Auto-generated method stub
		return super.getSingletons();
	//register ettigimiz sýnýflarý geriye dönüyoruz.Bunun için Set veri yapýsý kullanýyoruz
	
	}
	
}
