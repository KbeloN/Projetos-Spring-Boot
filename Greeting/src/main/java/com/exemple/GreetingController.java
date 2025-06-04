package com.exemple;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@PostMapping("/greet")
	public String greet(@RequestBody UserRequest request) {
		return "Greetings, " + request.getName();
	}
}
