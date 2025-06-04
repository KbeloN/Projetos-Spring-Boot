package com.exemple;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class calculatorController {
	
	@GetMapping("/add")
	public String addNumbers(@RequestParam int a ,@RequestParam int b) {
		return "The sum is " + (a + b);
	}
	
}
