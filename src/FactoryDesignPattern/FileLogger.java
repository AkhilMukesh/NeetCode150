package FactoryDesignPattern;

public class FileLogger implements Logger {
	
	public void getMessage(String message) {
		System.out.println("File Logger: "+ message);
	}
}
