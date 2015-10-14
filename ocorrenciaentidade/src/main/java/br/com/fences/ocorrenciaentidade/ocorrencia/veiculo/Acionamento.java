package br.com.fences.ocorrenciaentidade.ocorrencia.veiculo;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class Acionamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CONT_VEICULO")
	private String contVeiculo;

	@SerializedName("CONT_VEICULO_VEICULO_ACIONAMENTO")
	private String contVeiculoVeiculoAcionamento;

	@SerializedName("ID_VEICULO_ACIONAMENTO")
	private String idVeiculoAcionamento;

	@PesquisaTextual
	@SerializedName("DESCR_VEICULO_ACIONAMENTO")
	private String descrVeiculoAcionamento;

	public String getContVeiculo() {
		return contVeiculo;
	}

	public void setContVeiculo(String contVeiculo) {
		this.contVeiculo = contVeiculo;
	}

	public String getContVeiculoVeiculoAcionamento() {
		return contVeiculoVeiculoAcionamento;
	}

	public void setContVeiculoVeiculoAcionamento(
			String contVeiculoVeiculoAcionamento) {
		this.contVeiculoVeiculoAcionamento = contVeiculoVeiculoAcionamento;
	}

	public String getIdVeiculoAcionamento() {
		return idVeiculoAcionamento;
	}

	public void setIdVeiculoAcionamento(String idVeiculoAcionamento) {
		this.idVeiculoAcionamento = idVeiculoAcionamento;
	}

	public String getDescrVeiculoAcionamento() {
		return descrVeiculoAcionamento;
	}

	public void setDescrVeiculoAcionamento(String descrVeiculoAcionamento) {
		this.descrVeiculoAcionamento = descrVeiculoAcionamento;
	}


}
