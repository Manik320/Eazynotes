package com.MyNotesmanik.eazynotes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	@GetMapping("/version")
	public String getVersion() {
		return "Application is up and running with version";
	}
}
