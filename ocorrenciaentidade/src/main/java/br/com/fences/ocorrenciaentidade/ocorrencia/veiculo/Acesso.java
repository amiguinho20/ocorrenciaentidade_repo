package br.com.fences.ocorrenciaentidade.ocorrencia.veiculo;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;


public class Acesso implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CONT_VEICULO")
	private String contVeiculo;

	@SerializedName("CONT_VEICULO_VEICULO_ACESSO")
	private String contVeiculoVeiculoAcesso;

	@SerializedName("ID_VEICULO_ACESSO")
	private String idVeiculoAcesso;

	@SerializedName("DESCR_VEICULO_ACESSO")
	private String descrVeiculoAcesso;

	public String getContVeiculo() {
		return contVeiculo;
	}

	public void setContVeiculo(String contVeiculo) {
		this.contVeiculo = contVeiculo;
	}

	public String getContVeiculoVeiculoAcesso() {
		return contVeiculoVeiculoAcesso;
	}

	public void setContVeiculoVeiculoAcesso(String contVeiculoVeiculoAcesso) {
		this.contVeiculoVeiculoAcesso = contVeiculoVeiculoAcesso;
	}

	public String getIdVeiculoAcesso() {
		return idVeiculoAcesso;
	}

	public void setIdVeiculoAcesso(String idVeiculoAcesso) {
		this.idVeiculoAcesso = idVeiculoAcesso;
	}

	public String getDescrVeiculoAcesso() {
		return descrVeiculoAcesso;
	}

	public void setDescrVeiculoAcesso(String descrVeiculoAcesso) {
		this.descrVeiculoAcesso = descrVeiculoAcesso;
	}


}
