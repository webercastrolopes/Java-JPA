package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoController {

	@GetMapping
	public String teste() {
		return "Compreendendo as camadas Java - Weber";
	}
}
