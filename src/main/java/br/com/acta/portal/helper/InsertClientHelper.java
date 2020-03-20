package br.com.acta.portal.helper;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.acta.portal.entity.Cliente;

@Component
public class InsertClientHelper {
	
	public void insert(List<Cliente> listClient) {
		listClient.stream().forEach(cliente -> ConvenioEnum.getConvenioPorParceiro(cliente.getParceiro()).insert(cliente));
	}
	
}
