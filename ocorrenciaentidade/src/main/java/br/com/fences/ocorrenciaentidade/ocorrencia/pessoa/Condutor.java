package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class Condutor  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CONT_PESSOA")
	private String contPessoa;

	@SerializedName("CONT_PESSOA_CONDUTOR")
	private String contPessoaCondutor;

	@PesquisaTextual
	@SerializedName("NOME_PESSOA")
	private String nomePessoa;

	@PesquisaTextual
	@SerializedName("NOME_PESSOA_CONDUTOR")
	private String nomePessoaCondutor;

	@PesquisaTextual
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
