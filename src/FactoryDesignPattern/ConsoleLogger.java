package FactoryDesignPattern;

public class ConsoleLogger implements Logger{
	
	public void getMessage(String message) {
		System.out.println("Console Logger: "+message);
	}
	

}
