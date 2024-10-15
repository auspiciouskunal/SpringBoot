package com.notification.system.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notification.system.service.BankAccountService;

@RestController
@RequestMapping("/bank")
public class NotificationAPI {
	
	@Autowired
	private BankAccountService bankAccountService;
	
	@GetMapping("/transaction")
	public void accountTransaction() {
		this.bankAccountService.accountTransaction();
		
	}
	
	@GetMapping("/accountstatement")
	public void accountStatement() {
		this.bankAccountService.accountStatement();
		
	}

}
