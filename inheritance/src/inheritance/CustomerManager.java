package inheritance;

public class CustomerManager {
//	public void add(IndividualCustomer customer) {
//		System.out.println(customer.customerNumber+" kaydedildi!");
//	}
//	public void add(CorporateCustomer customer) {
//		System.out.println(customer.customerNumber+" kaydedildi!");
//	}
	//bunlarýn yerine direk olarak custormer da kullanabiliriz
	
	public void add(Customer customer) {
		System.out.println(customer.customerNumber+" kaydedildi!");
	}
	public void multipleAdd(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}

}
