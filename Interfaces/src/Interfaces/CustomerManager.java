package Interfaces;
//burada deðikenlere yani log lara baðlý olmamak için aþaðýda yazmýyoruz da buraya yazýyoruz private olarak



public class CustomerManager {
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		this.loggers=loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi: "+customer.getFirstName());
		Utils.RunLoggers(loggers, customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi: "+customer.getFirstName());
		Utils.RunLoggers(loggers, customer.getFirstName());
	}
	
	}
