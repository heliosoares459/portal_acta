package br.com.acta.portal.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.acta.portal.dao.ConvenioDao;
import br.com.acta.portal.dao.ProcedurePrimeInterface;
import br.com.acta.portal.entity.Cliente;

@Component
public class ConvenioPrimeDaoImpl implements ConvenioDao{
	@Autowired
	private ProcedurePrimeInterface repository;

	@Override
	public Boolean insert(Cliente cliente) {
		return repository.insertClientPrime(cliente.getCpf(), cliente.getCtrlCpf(), cliente.getFilial(),
				cliente.getParceiro());
	}
	
}
