package _01.xml2;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {

	private String city;
	private String zip;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
}
