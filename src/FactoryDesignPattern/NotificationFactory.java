package FactoryDesignPattern;

public class NotificationFactory {
	
	public static NotificationSystem sendNotification(String type) {
		return switch(type) {
		case "sms" -> new SMS();
		case "call" -> new call();
		default -> throw new IllegalArgumentException("No Notification");
		};
		
	}

}
