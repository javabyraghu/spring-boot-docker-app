package com.raghu.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	public WelcomeRestController() {
		logger.info("***** WelcomeRestController::Constructor *****");
	}

	@GetMapping
	public String welcomeMsg() {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = "Welcome to DevOps/AWS By Mr.RAGHU..!!";
		logger.info("***** welcomeMsg() execution end *****");
		return msg;
	}
	
	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable String name) {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = "WELCOME TO :: " + name;
		logger.info("***** welcomeMsg() execution end *****");
		return msg;
	}
}
