package _03.exception;

public class CustomerService {
	
	public Customer findCustomer(int id) {
		
		if(id==1) {
			return new Customer(1,"atakan");
		}
		else
			return null;
	}
}
