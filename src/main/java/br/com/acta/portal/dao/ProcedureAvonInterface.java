package br.com.acta.portal.dao;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ProcedureAvonInterface extends CrudRepository<Object, Long> {

	@Transactional
	@Procedure(procedureName = "pInsCadastroCPF_AVON01")
	boolean insertClientAvon(@Param("cCpfCnpj") String cpf, @Param("cCtrlCpfCnpj") String ctrlCpf,
			@Param("cFlialCnpj") int filial, @Param("cSgmtoAbertCta") int parceiro);

}
