package com.seo.Digital;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/Welcome")
	public String display() {
		return "Hello Welcome";
		
		
	}

}
