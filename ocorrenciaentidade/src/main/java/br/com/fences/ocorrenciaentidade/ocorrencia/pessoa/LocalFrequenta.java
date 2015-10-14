package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;


import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class LocalFrequenta implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@SerializedName("NOME_LOC_FREQ")
	private String nomeLocFreq;

	@PesquisaTextual
	@SerializedName("DESCR_TIPO_LOCAL")
	private String descrTipoLocal;

	@SerializedName("PERIODO_LOC_FREQ")
	private String periodoLocFreq;

	@SerializedName("ID_TIPO_LOCAL")
	private String idTipoLocal;

	@PesquisaTextual
	@SerializedName("LOGRADOURO_LOC_FREQ")
	private String logradouroLocFreq;

	@SerializedName("NUMERO_LOGRADOURO_LOC_FREQ")
	private String numeroLogradouroLocFreq;

	@PesquisaTextual
	@SerializedName("COMPLEMENTO_LOC_FREQ")
	private String complementoLocFreq;

	@PesquisaTextual
	@SerializedName("CEP_LOC_FREQ")
	private String cepLocFreq;

	@PesquisaTextual
	@SerializedName("BAIRRO_LOC_FREQ")
	private String bairroLocFreq;

	@PesquisaTextual
	@SerializedName("CIDADE_LOC_FREQ")
	private String cidadeLocFreq;

	@PesquisaTextual
	@SerializedName("ID_UF")
	private String idUf;

	@PesquisaTextual
	@SerializedName("ID_UF_LOCAL_FREQUENTA")
	private String idUfLocalFrequenta;

	@PesquisaTextual
	@SerializedName("NOME_UF")
	private String nomeUf;

	@PesquisaTextual
	@SerializedName("NOME_UF_LOCAL_FREQUENTA")
	private String nomeUfLocalFrequenta;

	public void setNomeLocFreq(String value) {
		this.nomeLocFreq = value;
	};

	public String getNomeLocFreq() {
		return this.nomeLocFreq;
	};

	public void setDescrTipoLocal(String value) {
		this.descrTipoLocal = value;
	};

	public String getDescrTipoLocal() {
		return this.descrTipoLocal;
	};

	public void setPeriodoLocFreq(String value) {
		this.periodoLocFreq = value;
	};

	public String getPeriodoLocFreq() {
		return this.periodoLocFreq;
	};

	public void setIdTipoLocal(String value) {
		this.idTipoLocal = value;
	};

	public String getIdTipoLocal() {
		return this.idTipoLocal;
	};

	public void setLogradouroLocFreq(String value) {
		this.logradouroLocFreq = value;
	};

	public String getLogradouroLocFreq() {
		return this.logradouroLocFreq;
	};

	public void setNumeroLogradouroLocFreq(String value) {
		this.numeroLogradouroLocFreq = value;
	};

	public String getNumeroLogradouroLocFreq() {
		return this.numeroLogradouroLocFreq;
	};

	public void setComplementoLocFreq(String value) {
		this.complementoLocFreq = value;
	};

	public String getComplementoLocFreq() {
		return this.complementoLocFreq;
	};

	public void setCepLocFreq(String value) {
		this.cepLocFreq = value;
	};

	public String getCepLocFreq() {
		return this.cepLocFreq;
	};

	public void setBairroLocFreq(String value) {
		this.bairroLocFreq = value;
	};

	public String getBairroLocFreq() {
		return this.bairroLocFreq;
	};

	public void setCidadeLocFreq(String value) {
		this.cidadeLocFreq = value;
	};

	public String getCidadeLocFreq() {
		return this.cidadeLocFreq;
	};

	public void setIdUf(String value) {
		this.idUf = value;
	};

	public String getIdUf() {
		return this.idUf;
	};

	public void setIdUfLocalFrequenta(String value) {
		this.idUfLocalFrequenta = value;
	};

	public String getIdUfLocalFrequenta() {
		return this.idUfLocalFrequenta;
	};

	public void setNomeUf(String value) {
		this.nomeUf = value;
	};

	public String getNomeUf() {
		return this.nomeUf;
	};

	public void setNomeUfLocalFrequenta(String value) {
		this.nomeUfLocalFrequenta = value;
	};

	public String getNomeUfLocalFrequenta() {
		return this.nomeUfLocalFrequenta;
	}

}
