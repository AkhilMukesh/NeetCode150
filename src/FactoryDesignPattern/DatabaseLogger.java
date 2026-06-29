package FactoryDesignPattern;

public class DatabaseLogger implements Logger{
	
	public void getMessage(String message) {
		System.out.println("Database Logger: "+message);
	}
	

}
