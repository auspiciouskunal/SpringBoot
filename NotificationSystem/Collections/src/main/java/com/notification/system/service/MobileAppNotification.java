package com.notification.system.service;
import org.springframework.stereotype.Component;

@Component
public class MobileAppNotification implements NotificationClient {
	public void sendNotification() {
		System.out.println("MobileApp Notification has been sent");
	}

}
