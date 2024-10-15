package com.notification.system.service;
import org.springframework.stereotype.Component;

@Component
public class MobileNotification implements NotificationClient {
	public void sendNotification() {
		System.out.println("Mobile Notification has been sent");
	}

}
