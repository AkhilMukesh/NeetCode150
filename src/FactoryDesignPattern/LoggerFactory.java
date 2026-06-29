package FactoryDesignPattern;

public class LoggerFactory {
	
	public Logger getFactoryType(String type) {
	
		if(type=="console") {
			System.out.println("Console logger");
			return new ConsoleLogger();
		}else if(type=="file") {
			return new FileLogger();
		}else {
			return new DatabaseLogger();
		}
		
	}
	

}
