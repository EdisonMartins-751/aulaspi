package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IdexController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Chamou o método index");
		return "home";
	}
	
}