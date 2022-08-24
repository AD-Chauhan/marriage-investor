package com.marriage.investors.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarriageInvesterController {
	
	@GetMapping("/find/user")
	public String getUser() {
		return "AD";
	}

}
