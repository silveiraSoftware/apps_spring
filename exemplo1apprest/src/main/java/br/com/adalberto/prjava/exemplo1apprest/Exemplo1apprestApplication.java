package br.com.adalberto.prjava.exemplo1apprest;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class Exemplo1apprestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Exemplo1apprestApplication.class, args);
		//System.out.println("Hello");
	}
	
	
	 @PostConstruct
	private void initDb() {
		
		// System.out.println("Hello");
		 //Pais br=paisRepository.save(new Pais("1111","Brasil"));
		//Pais pr=paisRepository.save(new Pais("2222","Paraguai"));
		
		//estadoRepository.save(new Estado("1", "Paraná", "PR",br));
		//estadoRepository.save(new Estado("2", "Santa Catarina", "PR",pr));
		
		//cursoRepository.save(new Curso("2","Curso2"));
		//cursoRepository.save(new Curso("3","Curso3"));
		
		
	}
	 /*
	 */
	 
	/*
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
	*/

}
