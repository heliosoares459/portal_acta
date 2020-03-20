package br.com.acta.portal.entity;

public class Cliente {
	private String cpf;
	private String ctrlCpf;
	private Integer filial;
	private Integer parceiro;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCtrlCpf() {
		return ctrlCpf;
	}
	public void setCtrlCpf(String ctrlCpf) {
		this.ctrlCpf = ctrlCpf;
	}
	public Integer getFilial() {
		return filial;
	}
	public void setFilial(Integer filial) {
		this.filial = filial;
	}
	public Integer getParceiro() {
		return parceiro;
	}
	public void setParceiro(Integer parceiro) {
		this.parceiro = parceiro;
	}

}
