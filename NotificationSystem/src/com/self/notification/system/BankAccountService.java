package com.self.notification.system;

public class BankAccountService {
	
	private MobileNotification mobileNotification;
	private EmailNotification emailNotification;
	private WhatsAppNotification whatsappNotification;
	private MobileAppNotification mobileAppNotification;
	
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
