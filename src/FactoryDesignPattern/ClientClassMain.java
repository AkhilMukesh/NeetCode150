package FactoryDesignPattern;

public class ClientClassMain {
	
	public static void main(String args[]) {
		LoggerFactory loggerFactory = new LoggerFactory();
		Logger logger  = loggerFactory.getFactoryType("database");
		logger.getMessage("logging into database");
		
		Logger fileLogger = loggerFactory.getFactoryType("file");
		fileLogger.getMessage("File logging");
		
		
		Logger consoleLogger = loggerFactory.getFactoryType("console");
		consoleLogger.getMessage("console logging");
		
		
	}

}
