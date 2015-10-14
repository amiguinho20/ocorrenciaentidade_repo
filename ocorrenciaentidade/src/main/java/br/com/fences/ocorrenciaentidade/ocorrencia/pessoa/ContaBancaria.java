package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class ContaBancaria  implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@PesquisaTextual
	@SerializedName("NOME_BANCO_PESSOA")
	private String nomeBancoPessoa;

	@PesquisaTextual
	@SerializedName("NUMERO_AGENCIA_BANCO")
	private String numeroAgenciaBanco;

	@PesquisaTextual
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
