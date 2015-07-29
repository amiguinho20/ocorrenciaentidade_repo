package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class ContaBancaria  implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@SerializedName("NOME_BANCO_PESSOA")
	private String nomeBancoPessoa;

	@SerializedName("NUMERO_AGENCIA_BANCO")
	private String numeroAgenciaBanco;

	@SerializedName("NUMERO_CONTA")
	private String numeroConta;

	public String getNomeBancoPessoa() {
		return nomeBancoPessoa;
	}

	public void setNomeBancoPessoa(String nomeBancoPessoa) {
		this.nomeBancoPessoa = nomeBancoPessoa;
	}

	public String getNumeroAgenciaBanco() {
		return numeroAgenciaBanco;
	}

	public void setNumeroAgenciaBanco(String numeroAgenciaBanco) {
		this.numeroAgenciaBanco = numeroAgenciaBanco;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}



}
