package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class Endereco implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("TIPO_ENDERECO")
	private String tipoEndereco;

	@PesquisaTextual
	@SerializedName("LOGRADOURO_ENDERECO")
	private String logradouroEndereco;

	@SerializedName("NUMERO_LOGRADOURO_ENDERECO")
	private String numeroLogradouroEndereco;

	@PesquisaTextual
	@SerializedName("COMPLEMENTO_ENDERECO")
	private String complementoEndereco;

	@PesquisaTextual
	@SerializedName("BAIRRO_ENDERECO")
	private String bairroEndereco;

	@PesquisaTextual
	@SerializedName("CEP_ENDERECO")
	private String cepEndereco;

	@PesquisaTextual
	@SerializedName("CIDADE_ENDERECO")
	private String cidadeEndereco;

	@PesquisaTextual
	@SerializedName("ID_UF")
	private String idUf;

	@PesquisaTextual
	@SerializedName("ID_UF_ENDERECO")
	private String idUfEndereco;

	@PesquisaTextual
	@SerializedName("NOME_UF")
	private String nomeUf;

	@PesquisaTextual
	@SerializedName("NOME_UF_ENDERECO")
	private String nomeUfEndereco;

	@PesquisaTextual
	@SerializedName("PONTO_REFERENCIA_ENDERECO")
	private String pontoReferenciaEndereco;

	@PesquisaTextual
	@SerializedName("NOME_EMPRESA")
	private String nomeEmpresa;

	public String getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public String getLogradouroEndereco() {
		return logradouroEndereco;
	}

	public void setLogradouroEndereco(String logradouroEndereco) {
		this.logradouroEndereco = logradouroEndereco;
	}

	public String getNumeroLogradouroEndereco() {
		return numeroLogradouroEndereco;
	}

	public void setNumeroLogradouroEndereco(String numeroLogradouroEndereco) {
		this.numeroLogradouroEndereco = numeroLogradouroEndereco;
	}

	public String getComplementoEndereco() {
		return complementoEndereco;
	}

	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}

	public String getBairroEndereco() {
		return bairroEndereco;
	}

	public void setBairroEndereco(String bairroEndereco) {
		this.bairroEndereco = bairroEndereco;
	}

	public String getCepEndereco() {
		return cepEndereco;
	}

	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}

	public String getCidadeEndereco() {
		return cidadeEndereco;
	}

	public void setCidadeEndereco(String cidadeEndereco) {
		this.cidadeEndereco = cidadeEndereco;
	}

	public String getIdUf() {
		return idUf;
	}

	public void setIdUf(String idUf) {
		this.idUf = idUf;
	}

	public String getIdUfEndereco() {
		return idUfEndereco;
	}

	public void setIdUfEndereco(String idUfEndereco) {
		this.idUfEndereco = idUfEndereco;
	}

	public String getNomeUf() {
		return nomeUf;
	}

	public void setNomeUf(String nomeUf) {
		this.nomeUf = nomeUf;
	}

	public String getNomeUfEndereco() {
		return nomeUfEndereco;
	}

	public void setNomeUfEndereco(String nomeUfEndereco) {
		this.nomeUfEndereco = nomeUfEndereco;
	}

	public String getPontoReferenciaEndereco() {
		return pontoReferenciaEndereco;
	}

	public void setPontoReferenciaEndereco(String pontoReferenciaEndereco) {
		this.pontoReferenciaEndereco = pontoReferenciaEndereco;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

}
