package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;


public class CartaoCredito  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("NOME_CARTAO")
	private String nomeCartao;
	
	@SerializedName("NUMERO_CARTAO")
	private String numeroCartao;

	@SerializedName("VALIDADE_CARTAO")
	private String validadeCartao;

	public String getNomeCartao() {
		return nomeCartao;
	}

	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getValidadeCartao() {
		return validadeCartao;
	}

	public void setValidadeCartao(String validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
