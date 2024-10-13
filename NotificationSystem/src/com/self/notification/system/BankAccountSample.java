package com.self.notification.system;

public class BankAccountSample {
	public static void main(String[] args) {
		EmailNotification emailNotification = new EmailNotification();
		MobileNotification mobileNotification = new MobileNotification();
		WhatsAppNotification whatsAppNotification = new WhatsAppNotification();
		MobileAppNotification mobileAppNotification = new MobileAppNotification();
		
		BankAccountService bankAccountService = new BankAccountService(mobileNotification,emailNotification, whatsAppNotification,mobileAppNotification);
		
		bankAccountService.accountTransaction();
		bankAccountService.accountStatement();
	}

}
