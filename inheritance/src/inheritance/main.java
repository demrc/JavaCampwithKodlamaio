package inheritance;

public class main {

	public static void main(String[] args) {
		IndividualCustomer emre = new IndividualCustomer();
		emre.customerNumber="852";
		
		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber="62963";
		
		CustomerManager customerManager = new CustomerManager();
		Customer[] customers={emre,hepsiburada};
		
		
		customerManager.multipleAdd(customers);
				
	}

}
