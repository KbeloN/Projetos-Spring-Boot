package com.exemple;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AgeCheckerController {

	@PostMapping("/agechecker")
	public Map<String, String> ageChecker(@RequestBody User user) {
		String message;
		
		if(user.getAge() < 18) {
			message = user.getName() + ", you can't enter because you are under age.";
		} else {
			message = user.getName() + ", you can pass";
		}
		
		Map<String, String> response = new HashMap<>();
		response.put("message", message);
		return response;
	}
	
}
