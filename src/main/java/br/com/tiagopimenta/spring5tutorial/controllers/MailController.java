package br.com.tiagopimenta.spring5tutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiagopimenta.spring5tutorial.mail.MailSender;
import br.com.tiagopimenta.spring5tutorial.mail.MockMailSender;

@RestController
public class MailController {

	private MailSender mailSender = new MockMailSender();

	@RequestMapping("/mail")
	public String mail() {
		
		mailSender.send("mail@example.com", "A test mail", "Body of the test mail");
		
		return "Mail sent";
		
	}

}
