package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

//this is for use to j logger service,because we can not use j logger manager direct in our project
public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
	}
	
}
