package com.notification.system.service;
import org.springframework.stereotype.Component;

@Component
public class WhatsAppNotification implements NotificationClient {
	public void sendNotification() {
		System.out.println("Whatsaap Notification has been sent");
	}

}
