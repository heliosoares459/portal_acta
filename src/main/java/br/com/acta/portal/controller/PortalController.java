package br.com.acta.portal.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acta.portal.entity.Cliente;
import br.com.acta.portal.helper.InsertClientHelper;

@RestController
public class PortalController {

	@Autowired
	InsertClientHelper insertHelper;
	
	@RequestMapping("/")
	public String index() {
		return "pagina index!";
	}
	
	@PostMapping("/inserirCliente")
	public String insertClient(Cliente cliente) {
		insertHelper.insert(Arrays.asList(cliente));
		return "pagina de sucesso!";
	}
	
}
