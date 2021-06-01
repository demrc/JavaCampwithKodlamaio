package Interfaces;
//burada de�ikenlere yani log lara ba�l� olmamak i�in a�a��da yazm�yoruz da buraya yaz�yoruz private olarak



public class CustomerManager {
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		this.loggers=loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("M��teri eklendi: "+customer.getFirstName());
		Utils.RunLoggers(loggers, customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("M��teri silindi: "+customer.getFirstName());
		Utils.RunLoggers(loggers, customer.getFirstName());
	}
	
	}
