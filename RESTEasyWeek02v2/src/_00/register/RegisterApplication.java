package _00.register;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/root-path")
public class RegisterApplication extends Application {
//!!!!!Burada resource s�n�flar�n� register etmemiz gerekir.
	//Bu s�n�flar singleton ya da her istek sonras�nda olu�an yap�da olabilir. Bizim dizayn�m�za kalm��.
	//singleton : b�t�n istekelre kar��l�k sadece bir tane ilgili service s�n�f� objesi olusmas�
	//Servletler ve Spring Bean'ler singleton yap�ya �rnektir.
	
	//Biz de bu �rnegimizde singleton tan�ml�yoruz
	
	private Set<Object> singletons=new HashSet<Object>();
	
	//Constructor tan�ml�yoruz
	public RegisterApplication() {
//		singletons.add(new CustomerResource());                    //buraya eklemeler yapacag�z
//		singletons.add(new CustomerResourcePathParam());            //bu s�n�flara ait istek gelince tek obje olusturur
		//yenilik sayesinde diger s�n�flar� buraya yazmad�k otomatik halletti.
	}
	@Override
	public Set<Object> getSingletons() {
		// TODO Auto-generated method stub
		return super.getSingletons();
	//register ettigimiz s�n�flar� geriye d�n�yoruz.Bunun i�in Set veri yap�s� kullan�yoruz
	
	}
	
}
