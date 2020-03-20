package br.com.acta.portal.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.acta.portal.dao.ConvenioDao;
import br.com.acta.portal.dao.ProcedureAvonInterface;
import br.com.acta.portal.entity.Cliente;

@Component
public class ConvenioAvonDaoImpl implements ConvenioDao{

	@Autowired
	private ProcedureAvonInterface repository;

	@Override
	public Boolean insert(Cliente cliente) {
		return repository.insertClientAvon(cliente.getCpf(), cliente.getCtrlCpf(), cliente.getFilial(),
				cliente.getParceiro());
	}

}
