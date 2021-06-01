package Interfaces;

public class Utils {
	//static yaparsak new yapmaya gerek kalmaz. ama bellek i�in zararl�d�r o y�zden her yerde kullan�lmaz.
	//�ok kulland���m�z yerlerde kullan�r�z
	public static void RunLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
