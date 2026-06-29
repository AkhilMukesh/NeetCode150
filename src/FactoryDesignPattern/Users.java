package FactoryDesignPattern;

public class Users {
	public static void main(String args[]) {
		
		NotificationSystem system = NotificationFactory.sendNotification("sms");
		system.sendMessage("Hello sms");
		
		NotificationSystem callSystem = NotificationFactory.sendNotification("call");
		system.sendMessage("Hello call");
	}
}
