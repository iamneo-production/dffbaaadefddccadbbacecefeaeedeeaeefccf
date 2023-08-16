package com.example.day_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Class1 {
	@GetMapping("disp")
	public String display()
	{
		return "Hello World";
	}
}
