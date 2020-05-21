package br.com.adalberto.prjava.exemplo1apprest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicalController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
