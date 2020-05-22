package br.com.adalberto.prjava.exemplo1apprest.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
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
	//@GetMapping("/hello2/{name}")
	@GetMapping(value = "/hello2/{name}")
	//public String hello2(@RequestParam(value = "name", defaultValue = "World") String name) {
	public String hello2(@PathVariable String name) {
	//public String hello2(@RequestParam String name) {
		return String.format("Hello %s!", name);
	}
	@PostMapping("/helloInsert")
	//public String helloInsert(@RequestParam(value = "name", defaultValue = "World") String name) {
	public String helloInsert(@RequestBody JSONObject oname) { 
	//public String helloInsert(@RequestParam(value = "name") String name) {
		return String.format("Hello %s!",oname.get("name"));
	}
}