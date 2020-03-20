package br.com.acta.portal.helper;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.acta.portal.dao.ConvenioDao;
import br.com.acta.portal.daoImpl.ConvenioAvonDaoImpl;

@Component
public enum ConvenioEnum {

	AVON(0, new ConvenioAvonDaoImpl()), PRIME(1, new ConvenioAvonDaoImpl());

	private Integer parceiro;
	private ConvenioDao convenio;

	private ConvenioEnum(Integer parceiro, ConvenioDao convenio) {
		this.parceiro = parceiro;
		this.convenio = convenio;
	}

	public Integer getParceiro() {
		return this.parceiro;
	}
	
	public ConvenioDao getConvenio() {
		return this.convenio;
	}
	
	public ConvenioDao getConvenioPorParceiro(Integer parceiro) {
		ConvenioEnum convenioCliente = null;
		List<ConvenioEnum> list = Arrays.asList(ConvenioEnum.values());

		for(ConvenioEnum convenio : list) {
			if(convenio.getParceiro().equals(parceiro)) {
				convenioCliente = convenio;
			}
		}

		return convenioCliente.getConvenio();
	}

}
