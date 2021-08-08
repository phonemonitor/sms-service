package io.phonemonitor.smsservice.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.phonemonitor.smsservice.domain.SmsReceived;

@RestController
public class SmsController {

	//private static Log log = LogFactory.getLog(SmsController.class);
	private static final Logger log = LogManager.getLogger(SmsController.class);

	
	@PostMapping("/")
	public SmsReceived processSms(@RequestBody SmsReceived newSms) {
		if (log.isDebugEnabled()) {
			log.debug("Sms --> " + newSms);
		}
		
//		System.out.println("Sms --> " + newSms);
		
		return newSms;
	}
}
