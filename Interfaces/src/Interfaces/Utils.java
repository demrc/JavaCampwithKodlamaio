package Interfaces;

public class Utils {
	//static yaparsak new yapmaya gerek kalmaz. ama bellek için zararlýdýr o yüzden her yerde kullanýlmaz.
	//çok kullandýðýmýz yerlerde kullanýrýz
	public static void RunLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
