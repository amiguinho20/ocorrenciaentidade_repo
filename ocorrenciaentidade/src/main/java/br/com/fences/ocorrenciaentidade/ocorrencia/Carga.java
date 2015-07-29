package br.com.fences.ocorrenciaentidade.ocorrencia;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Carga  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_TIPO_CARGA")
	private String idTipoCarga;

	@SerializedName("DESCR_TIPO_CARGA")
	private String descrTipoCarga;

	@SerializedName("DETALHE_CARGA")
	private String detalheCarga;

	@SerializedName("ID_MODO_OBJETO")
	private String idModoObjeto;

	@SerializedName("ID_MODO_OBJETO_CARGA")
	private String idModoObjetoCarga;

	@SerializedName("DESCR_MODO_OBJETO")
	private String descrModoObjeto;

	@SerializedName("DESCR_MODO_OBJETO_CARGA")
	private String descrModoObjetoCarga;

	@SerializedName("ID_UNIDADE")
	private String idUnidade;

	@SerializedName("ID_UNIDADE_CARGA")
	private String idUnidadeCarga;

	@SerializedName("DESCR_UNIDADE")
	private String descrUnidade;

	@SerializedName("DESCR_UNIDADE_CARGA")
	private String descrUnidadeCarga;

	@SerializedName("DESTINO_CARGA")
	private String destinoCarga;

	@SerializedName("NOTAS_FISCAIS_CARGA")
	private String notasFiscaisCarga;

	@SerializedName("LOCAL_EMBARQUE_CARGA")
	private String localEmbarqueCarga;

	@SerializedName("NOME_EMBARCADOR_CARGA")
	private String nomeEmbarcadorCarga;

	@SerializedName("FLAG_SEGURO_CARGA")
	private String flagSeguroCarga;

	@SerializedName("ORIGEM_CARGA")
	private String origemCarga;

	@SerializedName("VALOR_CARGA")
	private String valorCarga;

	@SerializedName("SERIE_CARGA")
	private String serieCarga;

	@SerializedName("MARCA_CARGA")
	private String marcaCarga;

	@SerializedName("FLAG_CARGA_RECUPERADA_CARGA")
	private String flagCargaRecuperadaCarga;

	@SerializedName("DATA_RECUPERACAO_CARGA")
	private String dataRecuperacaoCarga;

	@SerializedName("HORA_RECUPERACAO_CARGA")
	private String horaRecuperacaoCarga;

	@SerializedName("VALOR_ESTIMADO_RECUP_CARGA")
	private String valorEstimadoRecupCarga;

	@SerializedName("LOCAL_RECUPERACAO_CARGA")
	private String localRecuperacaoCarga;

	public String getIdTipoCarga() {
		return idTipoCarga;
	}

	public void setIdTipoCarga(String idTipoCarga) {
		this.idTipoCarga = idTipoCarga;
	}

	public String getDescrTipoCarga() {
		return descrTipoCarga;
	}

	public void setDescrTipoCarga(String descrTipoCarga) {
		this.descrTipoCarga = descrTipoCarga;
	}

	public String getDetalheCarga() {
		return detalheCarga;
	}

	public void setDetalheCarga(String detalheCarga) {
		this.detalheCarga = detalheCarga;
	}

	public String getIdModoObjeto() {
		return idModoObjeto;
	}

	public void setIdModoObjeto(String idModoObjeto) {
		this.idModoObjeto = idModoObjeto;
	}

	public String getIdModoObjetoCarga() {
		return idModoObjetoCarga;
	}

	public void setIdModoObjetoCarga(String idModoObjetoCarga) {
		this.idModoObjetoCarga = idModoObjetoCarga;
	}

	public String getDescrModoObjeto() {
		return descrModoObjeto;
	}

	public void setDescrModoObjeto(String descrModoObjeto) {
		this.descrModoObjeto = descrModoObjeto;
	}

	public String getDescrModoObjetoCarga() {
		return descrModoObjetoCarga;
	}

	public void setDescrModoObjetoCarga(String descrModoObjetoCarga) {
		this.descrModoObjetoCarga = descrModoObjetoCarga;
	}

	public String getIdUnidade() {
		return idUnidade;
	}

	public void setIdUnidade(String idUnidade) {
		this.idUnidade = idUnidade;
	}

	public String getIdUnidadeCarga() {
		return idUnidadeCarga;
	}

	public void setIdUnidadeCarga(String idUnidadeCarga) {
		this.idUnidadeCarga = idUnidadeCarga;
	}

	public String getDescrUnidade() {
		return descrUnidade;
	}

	public void setDescrUnidade(String descrUnidade) {
		this.descrUnidade = descrUnidade;
	}

	public String getDescrUnidadeCarga() {
		return descrUnidadeCarga;
	}

	public void setDescrUnidadeCarga(String descrUnidadeCarga) {
		this.descrUnidadeCarga = descrUnidadeCarga;
	}

	public String getDestinoCarga() {
		return destinoCarga;
	}

	public void setDestinoCarga(String destinoCarga) {
		this.destinoCarga = destinoCarga;
	}

	public String getNotasFiscaisCarga() {
		return notasFiscaisCarga;
	}

	public void setNotasFiscaisCarga(String notasFiscaisCarga) {
		this.notasFiscaisCarga = notasFiscaisCarga;
	}

	public String getLocalEmbarqueCarga() {
		return localEmbarqueCarga;
	}

	public void setLocalEmbarqueCarga(String localEmbarqueCarga) {
		this.localEmbarqueCarga = localEmbarqueCarga;
	}

	public String getNomeEmbarcadorCarga() {
		return nomeEmbarcadorCarga;
	}

	public void setNomeEmbarcadorCarga(String nomeEmbarcadorCarga) {
		this.nomeEmbarcadorCarga = nomeEmbarcadorCarga;
	}

	public String getFlagSeguroCarga() {
		return flagSeguroCarga;
	}

	public void setFlagSeguroCarga(String flagSeguroCarga) {
		this.flagSeguroCarga = flagSeguroCarga;
	}

	public String getOrigemCarga() {
		return origemCarga;
	}

	public void setOrigemCarga(String origemCarga) {
		this.origemCarga = origemCarga;
	}

	public String getValorCarga() {
		return valorCarga;
	}

	public void setValorCarga(String valorCarga) {
		this.valorCarga = valorCarga;
	}

	public String getSerieCarga() {
		return serieCarga;
	}

	public void setSerieCarga(String serieCarga) {
		this.serieCarga = serieCarga;
	}

	public String getMarcaCarga() {
		return marcaCarga;
	}

	public void setMarcaCarga(String marcaCarga) {
		this.marcaCarga = marcaCarga;
	}

	public String getFlagCargaRecuperadaCarga() {
		return flagCargaRecuperadaCarga;
	}

	public void setFlagCargaRecuperadaCarga(String flagCargaRecuperadaCarga) {
		this.flagCargaRecuperadaCarga = flagCargaRecuperadaCarga;
	}

	public String getDataRecuperacaoCarga() {
		return dataRecuperacaoCarga;
	}

	public void setDataRecuperacaoCarga(String dataRecuperacaoCarga) {
		this.dataRecuperacaoCarga = dataRecuperacaoCarga;
	}

	public String getHoraRecuperacaoCarga() {
		return horaRecuperacaoCarga;
	}

	public void setHoraRecuperacaoCarga(String horaRecuperacaoCarga) {
		this.horaRecuperacaoCarga = horaRecuperacaoCarga;
	}

	public String getValorEstimadoRecupCarga() {
		return valorEstimadoRecupCarga;
	}

	public void setValorEstimadoRecupCarga(String valorEstimadoRecupCarga) {
		this.valorEstimadoRecupCarga = valorEstimadoRecupCarga;
	}

	public String getLocalRecuperacaoCarga() {
		return localRecuperacaoCarga;
	}

	public void setLocalRecuperacaoCarga(String localRecuperacaoCarga) {
		this.localRecuperacaoCarga = localRecuperacaoCarga;
	}
	
	
}
