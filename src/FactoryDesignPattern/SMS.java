package FactoryDesignPattern;

public class SMS implements NotificationSystem{
	
	public void sendMessage(String message) {
		System.out.println("SMS notification sent:" + message);
	}

}
