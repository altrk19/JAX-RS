package _01.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement( name="person_data")            //ismini degistirip yeni isim verdik
public class Person {

	@XmlElement(name = "person_id")                    //alanlarýn adýnýu degistirmek için kullanýyoruz ve XmlAccessorType yazmamýz lazým
	private int id;
	@XmlElement(name = "person_name")
	private String name;
	@XmlElement(name = "person_surname")
	private String surname;

	public Person() {
		super();
		// default constructor zorunlu !!  yoksa aþagýdaki hatayý veriyor
		
		// com.sun.xml.bind.v2.runtime.IllegalAnnotationsException: 1 counts of
		// IllegalAnnotationExceptions _05.xml.Person does not have a no-arg
		// default constructor. this problem is related to the following
		// location: at _01.xml.Person
	}

	public Person(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
