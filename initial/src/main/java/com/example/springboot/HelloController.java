package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "<div style=\"font-size: 1.5rem; background-color: black;\">Greetings from Spring Boot!</div>"; // hmm would be better to send html document.
	}

}
