package br.com.fences.ocorrenciaentidade.ocorrencia;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class Objeto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CONT_OBJETO")
	private String contObjeto;

	@SerializedName("ID_MODO_OBJETO")
	private String idModoObjeto;

	@PesquisaTextual
	@SerializedName("DESCR_MODO_OBJETO")
	private String descrModoObjeto;

	@SerializedName("ID_TIPO_OBJETO")
	private String idTipoObjeto;

	@PesquisaTextual
	@SerializedName("DESCR_TIPO_OBJETO")
	private String descrTipoObjeto;

	@SerializedName("ID_SUBTIPO_OBJETO")
	private String idSubtipoObjeto;

	@PesquisaTextual
	@SerializedName("DESCR_SUBTIPO_OBJETO")
	private String descrSubtipoObjeto;

	@SerializedName("ID_UNIDADE")
	private String idUnidade;

	@PesquisaTextual
	@SerializedName("DESCR_UNIDADE")
	private String descrUnidade;

	@SerializedName("QUANTIDADE_OBJETO")
	private String quantidadeObjeto;

	@PesquisaTextual
	@SerializedName("SERIE_OBJETO")
	private String serieObjeto;

	@PesquisaTextual
	@SerializedName("MARCA_OBJETO")
	private String marcaObjeto;

	@PesquisaTextual
	@SerializedName("OBSERVACAO_OBJETO")
	private String observacaoObjeto;

	@PesquisaTextual
	@SerializedName("IMEI")
	private String imei;

	@PesquisaTextual
	@SerializedName("SERIAL")
	private String serial;

	public String getContObjeto() {
		return contObjeto;
	}

	public void setContObjeto(String contObjeto) {
		this.contObjeto = contObjeto;
	}

	public String getIdModoObjeto() {
		return idModoObjeto;
	}

	public void setIdModoObjeto(String idModoObjeto) {
		this.idModoObjeto = idModoObjeto;
	}

	public String getDescrModoObjeto() {
		return descrModoObjeto;
	}

	public void setDescrModoObjeto(String descrModoObjeto) {
		this.descrModoObjeto = descrModoObjeto;
	}

	public String getIdTipoObjeto() {
		return idTipoObjeto;
	}

	public void setIdTipoObjeto(String idTipoObjeto) {
		this.idTipoObjeto = idTipoObjeto;
	}

	public String getDescrTipoObjeto() {
		return descrTipoObjeto;
	}

	public void setDescrTipoObjeto(String descrTipoObjeto) {
		this.descrTipoObjeto = descrTipoObjeto;
	}

	public String getIdSubtipoObjeto() {
		return idSubtipoObjeto;
	}

	public void setIdSubtipoObjeto(String idSubtipoObjeto) {
		this.idSubtipoObjeto = idSubtipoObjeto;
	}

	public String getDescrSubtipoObjeto() {
		return descrSubtipoObjeto;
	}

	public void setDescrSubtipoObjeto(String descrSubtipoObjeto) {
		this.descrSubtipoObjeto = descrSubtipoObjeto;
	}

	public String getIdUnidade() {
		return idUnidade;
	}

	public void setIdUnidade(String idUnidade) {
		this.idUnidade = idUnidade;
	}

	public String getDescrUnidade() {
		return descrUnidade;
	}

	public void setDescrUnidade(String descrUnidade) {
		this.descrUnidade = descrUnidade;
	}

	public String getQuantidadeObjeto() {
		return quantidadeObjeto;
	}

	public void setQuantidadeObjeto(String quantidadeObjeto) {
		this.quantidadeObjeto = quantidadeObjeto;
	}

	public String getSerieObjeto() {
		return serieObjeto;
	}

	public void setSerieObjeto(String serieObjeto) {
		this.serieObjeto = serieObjeto;
	}

	public String getMarcaObjeto() {
		return marcaObjeto;
	}

	public void setMarcaObjeto(String marcaObjeto) {
		this.marcaObjeto = marcaObjeto;
	}

	public String getObservacaoObjeto() {
		return observacaoObjeto;
	}

	public void setObservacaoObjeto(String observacaoObjeto) {
		this.observacaoObjeto = observacaoObjeto;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}



}
