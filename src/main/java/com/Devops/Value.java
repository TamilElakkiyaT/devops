package com.Devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Value {
@GetMapping(value="/get")
public String name() {
	return "devops project succefully created";
}
}
