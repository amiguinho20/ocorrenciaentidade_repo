package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;


public class Telefone implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@PesquisaTextual
	@SerializedName("DDD_TELEFONE")
	private String dddTelefone;

	@PesquisaTextual
	@SerializedName("NUMERO_TELEFONE")
	private String numeroTelefone;

	@PesquisaTextual
	@SerializedName("RAMAL_TELEFONE")
	private String ramalTelefone;

	@PesquisaTextual
	@SerializedName("RECADO_TELEFONE")
	private String recadoTelefone;

	@SerializedName("FLAG_TIPO_TELEFONE")
	private String flagTipoTelefone;

	@PesquisaTextual
	@SerializedName("OBSERVACAO_TELEFONE")
	private String observacaoTelefone;

	public String getDddTelefone() {
		return dddTelefone;
	}

	public void setDddTelefone(String dddTelefone) {
		this.dddTelefone = dddTelefone;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getRamalTelefone() {
		return ramalTelefone;
	}

	public void setRamalTelefone(String ramalTelefone) {
		this.ramalTelefone = ramalTelefone;
	}

	public String getRecadoTelefone() {
		return recadoTelefone;
	}

	public void setRecadoTelefone(String recadoTelefone) {
		this.recadoTelefone = recadoTelefone;
	}

	public String getFlagTipoTelefone() {
		return flagTipoTelefone;
	}

	public void setFlagTipoTelefone(String flagTipoTelefone) {
		this.flagTipoTelefone = flagTipoTelefone;
	}

	public String getObservacaoTelefone() {
		return observacaoTelefone;
	}

	public void setObservacaoTelefone(String observacaoTelefone) {
		this.observacaoTelefone = observacaoTelefone;
	}


}
