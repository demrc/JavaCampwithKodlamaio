package Interfaces;

public class main {

	public static void main(String[] args) {
		//göndereceðimiz logger
		Logger[] loggers = {new SmsLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer emre = new Customer(1,"emre","baba");
		customerManager.add(emre);
	}

}
