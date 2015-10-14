package br.com.fences.ocorrenciaentidade.ocorrencia;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class Empresa  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CONT_EMPRESA")
	private String contEmpresa;

	@SerializedName("ID_TIPO_EMPRESA")
	private String idTipoEmpresa;

	@PesquisaTextual
	@SerializedName("DESCR_TIPO_EMPRESA")
	private String descrTipoEmpresa;

	@PesquisaTextual
	@SerializedName("CGC_EMPRESA")
	private String cgcEmpresa;

	@PesquisaTextual
	@SerializedName("INSCRICAO_MUNICIPAL_EMPRESA")
	private String inscricaoMunicipalEmpresa;

	@PesquisaTextual
	@SerializedName("INSCRICAO_ESTADUAL_EMPRESA")
	private String inscricaoEstadualEmpresa;

	@PesquisaTextual
	@SerializedName("RAZAO_SOCIAL_EMPRESA")
	private String razaoSocialEmpresa;

	@PesquisaTextual
	@SerializedName("NOME_FANTASIA_EMPRESA")
	private String nomeFantasiaEmpresa;

	@SerializedName("CONT_PESSOA")
	private String contPessoa;

	@SerializedName("CONT_PESSOA_EMPRESA")
	private String contPessoaEmpresa;

	@PesquisaTextual
	@SerializedName("NOME_PESSOA")
	private String nomePessoa;

	@PesquisaTextual
	@SerializedName("NOME_PESSOA_EMPRESA")
	private String nomePessoaEmpresa;

	@PesquisaTextual
	@SerializedName("CARGO_REPRESENTANTE")
	private String cargoRepresentante;

	@PesquisaTextual
	@SerializedName("DDD_TELEFONE_EMPRESA")
	private String dddTelefoneEmpresa;

	@PesquisaTextual
	@SerializedName("TELEFONE_EMPRESA")
	private String telefoneEmpresa;

	@PesquisaTextual
	@SerializedName("LOGRADOURO")
	private String logradouro;

	@PesquisaTextual
	@SerializedName("LOGRADOURO_EMPRESA")
	private String logradouroEmpresa;

	@SerializedName("NUMERO_LOGRADOURO")
	private String numeroLogradouro;

	@SerializedName("NUMERO_LOGRADOURO_EMPRESA")
	private String numeroLogradouroEmpresa;
	
	@PesquisaTextual
	@SerializedName("COMPLEMENTO")
	private String complemento;

	@PesquisaTextual
	@SerializedName("COMPLEMENTO_EMPRESA")
	private String complementoEmpresa;

	@PesquisaTextual
	@SerializedName("BAIRRO")
	private String bairro;

	@PesquisaTextual
	@SerializedName("BAIRRO_EMPRESA")
	private String bairroEmpresa;

	@PesquisaTextual
	@SerializedName("CIDADE")
	private String cidade;

	@PesquisaTextual
	@SerializedName("CIDADE_EMPRESA")
	private String cidadeEmpresa;

	@PesquisaTextual
	@SerializedName("ID_UF")
	private String idUf;

	@PesquisaTextual
	@SerializedName("ID_UF_EMPRESA")
	private String idUfEmpresa;

	@PesquisaTextual
	@SerializedName("NOME_UF")
	private String nomeUf;

	@PesquisaTextual
	@SerializedName("NOME_UF_EMPRESA")
	private String nomeUfEmpresa;

	@PesquisaTextual
	@SerializedName("CEP")
	private String cep;

	@PesquisaTextual
	@SerializedName("CEP_EMPRESA")
	private String cepEmpresa;

	public String getContEmpresa() {
		return contEmpresa;
	}

	public void setContEmpresa(String contEmpresa) {
		this.contEmpresa = contEmpresa;
	}

	public String getIdTipoEmpresa() {
		return idTipoEmpresa;
	}

	public void setIdTipoEmpresa(String idTipoEmpresa) {
		this.idTipoEmpresa = idTipoEmpresa;
	}

	public String getDescrTipoEmpresa() {
		return descrTipoEmpresa;
	}

	public void setDescrTipoEmpresa(String descrTipoEmpresa) {
		this.descrTipoEmpresa = descrTipoEmpresa;
	}

	public String getCgcEmpresa() {
		return cgcEmpresa;
	}

	public void setCgcEmpresa(String cgcEmpresa) {
		this.cgcEmpresa = cgcEmpresa;
	}

	public String getInscricaoMunicipalEmpresa() {
		return inscricaoMunicipalEmpresa;
	}

	public void setInscricaoMunicipalEmpresa(String inscricaoMunicipalEmpresa) {
		this.inscricaoMunicipalEmpresa = inscricaoMunicipalEmpresa;
	}

	public String getInscricaoEstadualEmpresa() {
		return inscricaoEstadualEmpresa;
	}

	public void setInscricaoEstadualEmpresa(String inscricaoEstadualEmpresa) {
		this.inscricaoEstadualEmpresa = inscricaoEstadualEmpresa;
	}

	public String getRazaoSocialEmpresa() {
		return razaoSocialEmpresa;
	}

	public void setRazaoSocialEmpresa(String razaoSocialEmpresa) {
		this.razaoSocialEmpresa = razaoSocialEmpresa;
	}

	public String getNomeFantasiaEmpresa() {
		return nomeFantasiaEmpresa;
	}

	public void setNomeFantasiaEmpresa(String nomeFantasiaEmpresa) {
		this.nomeFantasiaEmpresa = nomeFantasiaEmpresa;
	}

	public String getContPessoa() {
		return contPessoa;
	}

	public void setContPessoa(String contPessoa) {
		this.contPessoa = contPessoa;
	}

	public String getContPessoaEmpresa() {
		return contPessoaEmpresa;
	}

	public void setContPessoaEmpresa(String contPessoaEmpresa) {
		this.contPessoaEmpresa = contPessoaEmpresa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getNomePessoaEmpresa() {
		return nomePessoaEmpresa;
	}

	public void setNomePessoaEmpresa(String nomePessoaEmpresa) {
		this.nomePessoaEmpresa = nomePessoaEmpresa;
	}

	public String getCargoRepresentante() {
		return cargoRepresentante;
	}

	public void setCargoRepresentante(String cargoRepresentante) {
		this.cargoRepresentante = cargoRepresentante;
	}

	public String getDddTelefoneEmpresa() {
		return dddTelefoneEmpresa;
	}

	public void setDddTelefoneEmpresa(String dddTelefoneEmpresa) {
		this.dddTelefoneEmpresa = dddTelefoneEmpresa;
	}

	public String getTelefoneEmpresa() {
		return telefoneEmpresa;
	}

	public void setTelefoneEmpresa(String telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getLogradouroEmpresa() {
		return logradouroEmpresa;
	}

	public void setLogradouroEmpresa(String logradouroEmpresa) {
		this.logradouroEmpresa = logradouroEmpresa;
	}

	public String getNumeroLogradouro() {
		return numeroLogradouro;
	}

	public void setNumeroLogradouro(String numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	public String getNumeroLogradouroEmpresa() {
		return numeroLogradouroEmpresa;
	}

	public void setNumeroLogradouroEmpresa(String numeroLogradouroEmpresa) {
		this.numeroLogradouroEmpresa = numeroLogradouroEmpresa;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getComplementoEmpresa() {
		return complementoEmpresa;
	}

	public void setComplementoEmpresa(String complementoEmpresa) {
		this.complementoEmpresa = complementoEmpresa;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getBairroEmpresa() {
		return bairroEmpresa;
	}

	public void setBairroEmpresa(String bairroEmpresa) {
		this.bairroEmpresa = bairroEmpresa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidadeEmpresa() {
		return cidadeEmpresa;
	}

	public void setCidadeEmpresa(String cidadeEmpresa) {
		this.cidadeEmpresa = cidadeEmpresa;
	}

	public String getIdUf() {
		return idUf;
	}

	public void setIdUf(String idUf) {
		this.idUf = idUf;
	}

	public String getIdUfEmpresa() {
		return idUfEmpresa;
	}

	public void setIdUfEmpresa(String idUfEmpresa) {
		this.idUfEmpresa = idUfEmpresa;
	}

	public String getNomeUf() {
		return nomeUf;
	}

	public void setNomeUf(String nomeUf) {
		this.nomeUf = nomeUf;
	}

	public String getNomeUfEmpresa() {
		return nomeUfEmpresa;
	}

	public void setNomeUfEmpresa(String nomeUfEmpresa) {
		this.nomeUfEmpresa = nomeUfEmpresa;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCepEmpresa() {
		return cepEmpresa;
	}

	public void setCepEmpresa(String cepEmpresa) {
		this.cepEmpresa = cepEmpresa;
	}


}
