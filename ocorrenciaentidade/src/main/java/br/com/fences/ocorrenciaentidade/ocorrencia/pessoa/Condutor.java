package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Condutor  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CONT_PESSOA")
	private String contPessoa;

	@SerializedName("CONT_PESSOA_CONDUTOR")
	private String contPessoaCondutor;

	@SerializedName("NOME_PESSOA")
	private String nomePessoa;

	@SerializedName("NOME_PESSOA_CONDUTOR")
	private String nomePessoaCondutor;

	@SerializedName("VIATURA")
	private String viatura;

	public String getContPessoa() {
		return contPessoa;
	}

	public void setContPessoa(String contPessoa) {
		this.contPessoa = contPessoa;
	}

	public String getContPessoaCondutor() {
		return contPessoaCondutor;
	}

	public void setContPessoaCondutor(String contPessoaCondutor) {
		this.contPessoaCondutor = contPessoaCondutor;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getNomePessoaCondutor() {
		return nomePessoaCondutor;
	}

	public void setNomePessoaCondutor(String nomePessoaCondutor) {
		this.nomePessoaCondutor = nomePessoaCondutor;
	}

	public String getViatura() {
		return viatura;
	}

	public void setViatura(String viatura) {
		this.viatura = viatura;
	}

}
