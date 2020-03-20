package br.com.acta.portal.dao;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ProcedurePrimeInterface {

	@Transactional
	@Procedure(procedureName = "pInsCadastroCPF_PRIME01")
	boolean insertClientPrime(@Param("cCpfCnpj") String cpf, @Param("cCtrlCpfCnpj") String ctrlCpf,
			@Param("cFlialCnpj") int filial, @Param("cSgmtoAbertCta") int parceiro);
	
}
