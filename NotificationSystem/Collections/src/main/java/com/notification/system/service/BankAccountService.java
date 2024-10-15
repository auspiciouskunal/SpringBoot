package com.notification.system.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BankAccountService {
	
	private NotificationClient mobileNotification;
	private NotificationClient emailNotification;
	private NotificationClient whatsappNotification;
	private NotificationClient mobileAppNotification;
	
	public BankAccountService(MobileNotification mobileNotification, EmailNotification emailNotification,
			WhatsAppNotification whatsappNotification, MobileAppNotification mobileAppNotification) {
		super();
		this.mobileNotification = mobileNotification;
		this.emailNotification = emailNotification;
		this.whatsappNotification = whatsappNotification;
		this.mobileAppNotification = mobileAppNotification;
	}

	public void accountTransaction() {
		System.out.println("Account debit/credit transactions are successfully sent");
		this.mobileNotification.sendNotification();
		this.emailNotification.sendNotification();
		
		
	}

	public void accountStatement() {
		System.out.println("Account Monthly Statement details are Successfully sent to email and whatsaap");
		this.emailNotification.sendNotification();
		this.whatsappNotification.sendNotification();
		this.mobileAppNotification.sendNotification(); 
		
	}
}
