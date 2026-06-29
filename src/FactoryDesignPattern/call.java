package FactoryDesignPattern;

public class call implements NotificationSystem{
	
	public void sendMessage(String message) {
		System.out.println("Call notification sent: "+message);
	}
}
