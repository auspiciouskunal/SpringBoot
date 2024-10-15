package com.notification.system.service;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements NotificationClient {
	
	public void sendNotification() {
		System.out.println("Email Notification has been sent");
	}

}
