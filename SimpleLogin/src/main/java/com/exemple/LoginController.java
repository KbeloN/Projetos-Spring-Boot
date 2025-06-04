package com.exemple;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.entities.User;

@RestController
public class LoginController {
	
	@PostMapping("/login")
	public Map<String, String> loginCheck(@RequestBody User request){
		String username = request.getName();
		String password = request.getPassword();
		
		if("admin".equals(username) && "1234".equals(password)){
			return Map.of("message", "Welcome, admin!");
		} else {
			return Map.of("message", "Username or password is incorrect");
		}
	}
}
