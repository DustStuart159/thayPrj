package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/sum")
	Integer sum(@RequestParam("a") Integer one,
					   @RequestParam("b") Integer two) {
		return one+two;
	}
}
