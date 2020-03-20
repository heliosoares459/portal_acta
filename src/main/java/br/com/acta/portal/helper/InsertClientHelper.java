package br.com.acta.portal.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.acta.portal.entity.Cliente;

@Component
public class InsertClientHelper {
	
	@Autowired
	ConvenioEnum convenioEnum;
	
	public void insert(List<Cliente> listClient) {
		listClient.stream().forEach(cliente -> convenioEnum.getConvenioPorParceiro(cliente.getParceiro()).insert(cliente));
	}
	
}
