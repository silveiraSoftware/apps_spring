package br.com.adalberto.prjava.exemplo1apprest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicalController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/hello1")
	public String hello1(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
}
