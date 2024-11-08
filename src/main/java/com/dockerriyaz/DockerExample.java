package com.dockerriyaz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerExample {
	@GetMapping(value="/getMap")
	public String getMap() {
		return "HAI RIYAZ";
	}
}