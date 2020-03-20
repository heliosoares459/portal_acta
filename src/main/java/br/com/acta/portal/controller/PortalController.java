package br.com.acta.portal.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acta.portal.entity.Cliente;
import br.com.acta.portal.helper.InsertClientHelper;

@RestController
public class PortalController {

	
	@RequestMapping("/")
	public String index() {
		return "pagina index!";
	}
	
	@GetMapping("/inserirCliente")
	public String insertClient(Cliente cliente) {
		InsertClientHelper insertHelper = new InsertClientHelper();
		insertHelper.insert(Arrays.asList(cliente));
		return "pagina de sucesso!";
	}
	
}
