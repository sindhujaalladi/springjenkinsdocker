package com.springjenkinsdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/docker")
public class SpringJenkinsDockerController {

	
	@GetMapping("/print")
	public String printmessage() {
		return "hello welcome to jenkins docker";
	}

}
