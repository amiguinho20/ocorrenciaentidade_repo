package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;
import br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.Telefone;
import br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.vitima.Vitima;

import com.google.gson.annotations.SerializedName;

public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_TIPO_PESSOA")
	private String idTipoPessoa;

	@PesquisaTextual
	@SerializedName("DESCR_TIPO_PESSOA")
	private String descrTipoPessoa;

	@SerializedName("ID_ESTADO_CIVIL")
	private String idEstadoCivil;

	@PesquisaTextual
	@SerializedName("DESCR_ESTADO_CIVIL")
	private String descrEstadoCivil;

	@PesquisaTextual
	@SerializedName("NOME_PESSOA")
	private String nomePessoa;

	@PesquisaTextual
	@SerializedName("VULGO_PESSOA")
	private String vulgoPessoa;

	@PesquisaTextual
	@SerializedName("NOMEPAI_PESSOA")
	private String nomepaiPessoa;

	@PesquisaTextual
	@SerializedName("NOMEMAE_PESSOA")
	private String nomemaePessoa;

	@SerializedName("DATA_NASCIMENTO_PESSOA")
	private String dataNascimentoPessoa;

	@SerializedName("IDADE_PESSOA")
	private String idadePessoa;

	@SerializedName("SEXO_PESSOA")
	private String sexoPessoa;

	@PesquisaTextual
	@SerializedName("RG")
	private String rg;

	@PesquisaTextual
	@SerializedName("RG_UF")
	private String rgUf;

	@PesquisaTextual
	@SerializedName("UF_RG")
	private String ufRg;

	@SerializedName("RG_DATA_EMISSAO")
	private String rgDataEmissao;

	@PesquisaTextual
	@SerializedName("CPF")
	private String cpf;

	@PesquisaTextual
	@SerializedName("CNH")
	private String cnh;

	@PesquisaTextual
	@SerializedName("NR_TIT_ELEITOR")
	private String nrTitEleitor;

	@SerializedName("ZONA_TIT_ELEITOR")
	private String zonaTitEleitor;

	@SerializedName("SECAO_TIT_ELEITOR")
	private String secaoTitEleitor;

	@PesquisaTextual
	@SerializedName("NR_CART_PROF")
	private String nrCartProf;

	@SerializedName("SERIE_CART_PROF")
	private String serieCartProf;

	@SerializedName("UF_CART_PROF")
	private String ufCartProf;

	@SerializedName("UF_CART")
	private String ufCart;

	@PesquisaTextual
	@SerializedName("OUTROS_DOCUMENTOS")
	private String outrosDocumentos;

	@PesquisaTextual
	@SerializedName("NACIONALIDADE_PESSOA")
	private String nacionalidadePessoa;

	@PesquisaTextual
	@SerializedName("NATURALIDADE_PESSOA")
	private String naturalidadePessoa;

	@PesquisaTextual
	@SerializedName("EMAIL_PESSOA")
	private String emailPessoa;

	@SerializedName("ID_PROFISSAO")
	private String idProfissao;

	@PesquisaTextual
	@SerializedName("DESCR_PROFISSAO")
	private String descrProfissao;

	@SerializedName("ID_GRAU_INSTRUCAO")
	private String idGrauInstrucao;

	@PesquisaTextual
	@SerializedName("DESCR_GRAU_INSTRUCAO")
	private String descrGrauInstrucao;

	@SerializedName("FLAG_VEIO_AO_PLANTAO_PESSOA")
	private String flagVeioAoPlantaoPessoa;

	@SerializedName("FLAG_RG_ORIGINAL")
	private String flagRgOriginal;

	@SerializedName("FLAG_PROTEGIDO")
	private String flagProtegido;

	@SerializedName("FLAG_BUSCA_RDO")
	private String flagBuscaRdo;

	@SerializedName("FLAG_BUSCA_CIVIL")
	private String flagBuscaCivil;

	@SerializedName("FLAG_BUSCA_CRIMINAL")
	private String flagBuscaCriminal;

	@SerializedName("FLAG_ORIGEM_DADOS")
	private String flagOrigemDados;

	@PesquisaTextual
	@SerializedName("PESO_CARACTERISTICA")
	private String pesoCaracteristica;

	@PesquisaTextual
	@SerializedName("ALTURA_CARACTERISTICA")
	private String alturaCaracteristica;

	@PesquisaTextual
	@SerializedName("COMPLEICAO_CARACTERISTICA")
	private String compleicaoCaracteristica;

	@PesquisaTextual
	@SerializedName("DESCR_TIPO_CABELO")
	private String descrTipoCabelo;

	@SerializedName("ID_TIPO_CABELO")
	private String idTipoCabelo;

	@PesquisaTextual
	@SerializedName("COMPRIMENTO_CABELO_CARACT")
	private String comprimentoCabeloCaract;

	@SerializedName("ID_COR_CABELO")
	private String idCorCabelo;

	@PesquisaTextual
	@SerializedName("DESCR_COR_CABELO")
	private String descrCorCabelo;

	@SerializedName("ID_COR_OLHO")
	private String idCorOlho;

	@PesquisaTextual
	@SerializedName("DESCR_COR_OLHO")
	private String descrCorOlho;

	@SerializedName("ID_COR_CUTIS")
	private String idCorCutis;

	@PesquisaTextual
	@SerializedName("DESCR_COR_CUTIS")
	private String descrCorCutis;

	@PesquisaTextual
	@SerializedName("OBSERVACOES")
	private String observacoes;
	
	@SerializedName("ADORNO")
	private Collection<Adorno> adornos = new ArrayList<>();

	@SerializedName("DEFORMIDADE")
	private Collection<Deformidade> deformidades = new ArrayList<>();

	@SerializedName("PATOLOGIA")
	private Collection<Patologia> patologias = new ArrayList<>();

	@SerializedName("CONTA_BANCARIA")
	private Collection<ContaBancaria> contaBancarias = new ArrayList<>();

	@SerializedName("CARTAO_CREDITO")
	private Collection<CartaoCredito> cartaoCreditos = new ArrayList<>();

	@SerializedName("ENDERECO")
	private Collection<Endereco> enderecos = new ArrayList<>();
	
	@SerializedName("TELEFONE")
	private Collection<Telefone> telefones = new ArrayList<>();

	@SerializedName("NATUREZA")
	private Collection<Natureza> naturezas = new ArrayList<>();
	
	@SerializedName("LOCAL_FREQUENTA")
	private Collection<LocalFrequenta> localFrequentas = new ArrayList<>();

	@SerializedName("VESTUARIO")
	private Collection<Vestuario> vestuarios = new ArrayList<>();

	@SerializedName("VITIMA")
	private Collection<Vitima> vitimas = new ArrayList<>();

	@SerializedName("TOXICO")
	private Collection<Toxico> toxicos = new ArrayList<>();

	@SerializedName("JOGO")
	private Collection<Jogo> jogos = new ArrayList<>();

	@SerializedName("AUTOR")
	private Collection<Autor> autores = new ArrayList<>();

	@SerializedName("CONDUTOR")
	private Collection<Condutor> condutores = new ArrayList<>();

	public String getIdTipoPessoa() {
		return idTipoPessoa;
	}

	public void setIdTipoPessoa(String idTipoPessoa) {
		this.idTipoPessoa = idTipoPessoa;
	}

	public String getDescrTipoPessoa() {
		return descrTipoPessoa;
	}

	public void setDescrTipoPessoa(String descrTipoPessoa) {
		this.descrTipoPessoa = descrTipoPessoa;
	}

	public String getIdEstadoCivil() {
		return idEstadoCivil;
	}

	public void setIdEstadoCivil(String idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public String getDescrEstadoCivil() {
		return descrEstadoCivil;
	}

	public void setDescrEstadoCivil(String descrEstadoCivil) {
		this.descrEstadoCivil = descrEstadoCivil;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getVulgoPessoa() {
		return vulgoPessoa;
	}

	public void setVulgoPessoa(String vulgoPessoa) {
		this.vulgoPessoa = vulgoPessoa;
	}

	public String getNomepaiPessoa() {
		return nomepaiPessoa;
	}

	public void setNomepaiPessoa(String nomepaiPessoa) {
		this.nomepaiPessoa = nomepaiPessoa;
	}

	public String getNomemaePessoa() {
		return nomemaePessoa;
	}

	public void setNomemaePessoa(String nomemaePessoa) {
		this.nomemaePessoa = nomemaePessoa;
	}

	public String getDataNascimentoPessoa() {
		return dataNascimentoPessoa;
	}

	public void setDataNascimentoPessoa(String dataNascimentoPessoa) {
		this.dataNascimentoPessoa = dataNascimentoPessoa;
	}

	public String getIdadePessoa() {
		return idadePessoa;
	}

	public void setIdadePessoa(String idadePessoa) {
		this.idadePessoa = idadePessoa;
	}

	public String getSexoPessoa() {
		return sexoPessoa;
	}

	public void setSexoPessoa(String sexoPessoa) {
		this.sexoPessoa = sexoPessoa;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRgUf() {
		return rgUf;
	}

	public void setRgUf(String rgUf) {
		this.rgUf = rgUf;
	}

	public String getUfRg() {
		return ufRg;
	}

	public void setUfRg(String ufRg) {
		this.ufRg = ufRg;
	}

	public String getRgDataEmissao() {
		return rgDataEmissao;
	}

	public void setRgDataEmissao(String rgDataEmissao) {
		this.rgDataEmissao = rgDataEmissao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getNrTitEleitor() {
		return nrTitEleitor;
	}

	public void setNrTitEleitor(String nrTitEleitor) {
		this.nrTitEleitor = nrTitEleitor;
	}

	public String getZonaTitEleitor() {
		return zonaTitEleitor;
	}

	public void setZonaTitEleitor(String zonaTitEleitor) {
		this.zonaTitEleitor = zonaTitEleitor;
	}

	public String getSecaoTitEleitor() {
		return secaoTitEleitor;
	}

	public void setSecaoTitEleitor(String secaoTitEleitor) {
		this.secaoTitEleitor = secaoTitEleitor;
	}

	public String getNrCartProf() {
		return nrCartProf;
	}

	public void setNrCartProf(String nrCartProf) {
		this.nrCartProf = nrCartProf;
	}

	public String getSerieCartProf() {
		return serieCartProf;
	}

	public void setSerieCartProf(String serieCartProf) {
		this.serieCartProf = serieCartProf;
	}

	public String getUfCartProf() {
		return ufCartProf;
	}

	public void setUfCartProf(String ufCartProf) {
		this.ufCartProf = ufCartProf;
	}

	public String getUfCart() {
		return ufCart;
	}

	public void setUfCart(String ufCart) {
		this.ufCart = ufCart;
	}

	public String getOutrosDocumentos() {
		return outrosDocumentos;
	}

	public void setOutrosDocumentos(String outrosDocumentos) {
		this.outrosDocumentos = outrosDocumentos;
	}

	public String getNacionalidadePessoa() {
		return nacionalidadePessoa;
	}

	public void setNacionalidadePessoa(String nacionalidadePessoa) {
		this.nacionalidadePessoa = nacionalidadePessoa;
	}

	public String getNaturalidadePessoa() {
		return naturalidadePessoa;
	}

	public void setNaturalidadePessoa(String naturalidadePessoa) {
		this.naturalidadePessoa = naturalidadePessoa;
	}

	public String getEmailPessoa() {
		return emailPessoa;
	}

	public void setEmailPessoa(String emailPessoa) {
		this.emailPessoa = emailPessoa;
	}

	public String getIdProfissao() {
		return idProfissao;
	}

	public void setIdProfissao(String idProfissao) {
		this.idProfissao = idProfissao;
	}

	public String getDescrProfissao() {
		return descrProfissao;
	}

	public void setDescrProfissao(String descrProfissao) {
		this.descrProfissao = descrProfissao;
	}

	public String getIdGrauInstrucao() {
		return idGrauInstrucao;
	}

	public void setIdGrauInstrucao(String idGrauInstrucao) {
		this.idGrauInstrucao = idGrauInstrucao;
	}

	public String getDescrGrauInstrucao() {
		return descrGrauInstrucao;
	}

	public void setDescrGrauInstrucao(String descrGrauInstrucao) {
		this.descrGrauInstrucao = descrGrauInstrucao;
	}

	public String getFlagVeioAoPlantaoPessoa() {
		return flagVeioAoPlantaoPessoa;
	}

	public void setFlagVeioAoPlantaoPessoa(String flagVeioAoPlantaoPessoa) {
		this.flagVeioAoPlantaoPessoa = flagVeioAoPlantaoPessoa;
	}

	public String getFlagRgOriginal() {
		return flagRgOriginal;
	}

	public void setFlagRgOriginal(String flagRgOriginal) {
		this.flagRgOriginal = flagRgOriginal;
	}

	public String getFlagProtegido() {
		return flagProtegido;
	}

	public void setFlagProtegido(String flagProtegido) {
		this.flagProtegido = flagProtegido;
	}

	public String getFlagBuscaRdo() {
		return flagBuscaRdo;
	}

	public void setFlagBuscaRdo(String flagBuscaRdo) {
		this.flagBuscaRdo = flagBuscaRdo;
	}

	public String getFlagBuscaCivil() {
		return flagBuscaCivil;
	}

	public void setFlagBuscaCivil(String flagBuscaCivil) {
		this.flagBuscaCivil = flagBuscaCivil;
	}

	public String getFlagBuscaCriminal() {
		return flagBuscaCriminal;
	}

	public void setFlagBuscaCriminal(String flagBuscaCriminal) {
		this.flagBuscaCriminal = flagBuscaCriminal;
	}

	public String getFlagOrigemDados() {
		return flagOrigemDados;
	}

	public void setFlagOrigemDados(String flagOrigemDados) {
		this.flagOrigemDados = flagOrigemDados;
	}

	public String getPesoCaracteristica() {
		return pesoCaracteristica;
	}

	public void setPesoCaracteristica(String pesoCaracteristica) {
		this.pesoCaracteristica = pesoCaracteristica;
	}

	public String getAlturaCaracteristica() {
		return alturaCaracteristica;
	}

	public void setAlturaCaracteristica(String alturaCaracteristica) {
		this.alturaCaracteristica = alturaCaracteristica;
	}

	public String getCompleicaoCaracteristica() {
		return compleicaoCaracteristica;
	}

	public void setCompleicaoCaracteristica(String compleicaoCaracteristica) {
		this.compleicaoCaracteristica = compleicaoCaracteristica;
	}

	public String getDescrTipoCabelo() {
		return descrTipoCabelo;
	}

	public void setDescrTipoCabelo(String descrTipoCabelo) {
		this.descrTipoCabelo = descrTipoCabelo;
	}

	public String getIdTipoCabelo() {
		return idTipoCabelo;
	}

	public void setIdTipoCabelo(String idTipoCabelo) {
		this.idTipoCabelo = idTipoCabelo;
	}

	public String getComprimentoCabeloCaract() {
		return comprimentoCabeloCaract;
	}

	public void setComprimentoCabeloCaract(String comprimentoCabeloCaract) {
		this.comprimentoCabeloCaract = comprimentoCabeloCaract;
	}

	public String getIdCorCabelo() {
		return idCorCabelo;
	}

	public void setIdCorCabelo(String idCorCabelo) {
		this.idCorCabelo = idCorCabelo;
	}

	public String getDescrCorCabelo() {
		return descrCorCabelo;
	}

	public void setDescrCorCabelo(String descrCorCabelo) {
		this.descrCorCabelo = descrCorCabelo;
	}

	public String getIdCorOlho() {
		return idCorOlho;
	}

	public void setIdCorOlho(String idCorOlho) {
		this.idCorOlho = idCorOlho;
	}

	public String getDescrCorOlho() {
		return descrCorOlho;
	}

	public void setDescrCorOlho(String descrCorOlho) {
		this.descrCorOlho = descrCorOlho;
	}

	public String getIdCorCutis() {
		return idCorCutis;
	}

	public void setIdCorCutis(String idCorCutis) {
		this.idCorCutis = idCorCutis;
	}

	public String getDescrCorCutis() {
		return descrCorCutis;
	}

	public void setDescrCorCutis(String descrCorCutis) {
		this.descrCorCutis = descrCorCutis;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Collection<Adorno> getAdornos() {
		return adornos;
	}

	public void setAdornos(Collection<Adorno> adornos) {
		this.adornos = adornos;
	}

	public Collection<Deformidade> getDeformidades() {
		return deformidades;
	}

	public void setDeformidades(Collection<Deformidade> deformidades) {
		this.deformidades = deformidades;
	}

	public Collection<Patologia> getPatologias() {
		return patologias;
	}

	public void setPatologias(Collection<Patologia> patologias) {
		this.patologias = patologias;
	}

	public Collection<ContaBancaria> getContaBancarias() {
		return contaBancarias;
	}

	public void setContaBancarias(Collection<ContaBancaria> contaBancarias) {
		this.contaBancarias = contaBancarias;
	}

	public Collection<CartaoCredito> getCartaoCreditos() {
		return cartaoCreditos;
	}

	public void setCartaoCreditos(Collection<CartaoCredito> cartaoCreditos) {
		this.cartaoCreditos = cartaoCreditos;
	}

	public Collection<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Collection<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Collection<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Collection<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Collection<Natureza> getNaturezas() {
		return naturezas;
	}

	public void setNaturezas(Collection<Natureza> naturezas) {
		this.naturezas = naturezas;
	}

	public Collection<LocalFrequenta> getLocalFrequentas() {
		return localFrequentas;
	}

	public void setLocalFrequentas(Collection<LocalFrequenta> localFrequentas) {
		this.localFrequentas = localFrequentas;
	}

	public Collection<Vestuario> getVestuarios() {
		return vestuarios;
	}

	public void setVestuarios(Collection<Vestuario> vestuarios) {
		this.vestuarios = vestuarios;
	}

	public Collection<Vitima> getVitimas() {
		return vitimas;
	}

	public void setVitimas(Collection<Vitima> vitimas) {
		this.vitimas = vitimas;
	}

	public Collection<Toxico> getToxicos() {
		return toxicos;
	}

	public void setToxicos(Collection<Toxico> toxicos) {
		this.toxicos = toxicos;
	}

	public Collection<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(Collection<Jogo> jogos) {
		this.jogos = jogos;
	}

	public Collection<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Collection<Autor> autores) {
		this.autores = autores;
	}

	public Collection<Condutor> getCondutores() {
		return condutores;
	}

	public void setCondutores(Collection<Condutor> condutores) {
		this.condutores = condutores;
	}

	

}
