package br.com.oliver.Hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/teste")
	public String digaOla() {
		return " vamo bota Devttols pra trabalhar";
	}
	
	
	

}
