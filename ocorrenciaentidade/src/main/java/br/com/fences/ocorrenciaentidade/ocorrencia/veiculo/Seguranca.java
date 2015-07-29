package br.com.fences.ocorrenciaentidade.ocorrencia.veiculo;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Seguranca implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CONT_VEICULO")
	private String contVeiculo;

	@SerializedName("CONT_VEICULO_VEICULO_SEGURANCA")
	private String contVeiculoVeiculoSeguranca;

	@SerializedName("ID_VEICULO_SEGURANCA")
	private String idVeiculoSeguranca;

	@SerializedName("DESCR_VEICULO_SEGURANCA")
	private String descrVeiculoSeguranca;

	public String getContVeiculo() {
		return contVeiculo;
	}

	public void setContVeiculo(String contVeiculo) {
		this.contVeiculo = contVeiculo;
	}

	public String getContVeiculoVeiculoSeguranca() {
		return contVeiculoVeiculoSeguranca;
	}

	public void setContVeiculoVeiculoSeguranca(String contVeiculoVeiculoSeguranca) {
		this.contVeiculoVeiculoSeguranca = contVeiculoVeiculoSeguranca;
	}

	public String getIdVeiculoSeguranca() {
		return idVeiculoSeguranca;
	}

	public void setIdVeiculoSeguranca(String idVeiculoSeguranca) {
		this.idVeiculoSeguranca = idVeiculoSeguranca;
	}

	public String getDescrVeiculoSeguranca() {
		return descrVeiculoSeguranca;
	}

	public void setDescrVeiculoSeguranca(String descrVeiculoSeguranca) {
		this.descrVeiculoSeguranca = descrVeiculoSeguranca;
	}


}
