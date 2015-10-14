package br.com.fences.ocorrenciaentidade.ocorrencia;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class Entorpecente  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CONT_ENTORPECENTE")
	private String contEntorpecente;

	@SerializedName("ID_TOXICO")
	private String idToxico;

	@SerializedName("ID_TOXICO_ENTORPECENTE")
	private String idToxicoEntorpecente;
	
	@PesquisaTextual
	@SerializedName("DESCR_TOXICO")
	private String descrToxico;

	@PesquisaTextual
	@SerializedName("DESCR_TOXICO_ENTORPECENTE")
	private String descrToxicoEntorpecente;

	@SerializedName("ID_UNIDADE")
	private String idUnidade;

	@SerializedName("ID_UNIDADE_ENTORPECENTE")
	private String idUnidadeEntorpecente;

	@PesquisaTextual
	@SerializedName("DESCR_UNIDADE")
	private String descrUnidade;

	@PesquisaTextual
	@SerializedName("DESCR_UNIDADE_ENTORPECENTE")
	private String descrUnidadeEntorpecente;

	@SerializedName("QTDE_ENCONTRADA")
	private String qtdeEncontrada;

	@SerializedName("ID_ACONDICIONAMENTO")
	private String idAcondicionamento;

	@PesquisaTextual
	@SerializedName("DESCR_ACONDICIONAMENTO")
	private String descrAcondicionamento;

	@SerializedName("QTDE_ACONDICIONAMENTO")
	private String qtdeAcondicionamento;

	@SerializedName("ID_INVOLUCRO")
	private String idInvolucro;

	@PesquisaTextual
	@SerializedName("DESCR_INVOLUCRO")
	private String descrInvolucro;

	@PesquisaTextual
	@SerializedName("NUM_LAUDO_IML")
	private String numLaudoIml;

	@SerializedName("ANO_LAUDO_IML")
	private String anoLaudoIml;

	@PesquisaTextual
	@SerializedName("DESCR_IML")
	private String descrIml;

	@PesquisaTextual
	@SerializedName("NOME_PERITO_IML")
	private String nomePeritoIml;

	@PesquisaTextual
	@SerializedName("OBS_IML")
	private String obsIml;

	@PesquisaTextual
	@SerializedName("OBSERVACOES")
	private String observacoes;

	@PesquisaTextual
	@SerializedName("OBSERVACOES_ENTORPECENTE")
	private String observacoesEntorpecente;

	public String getContEntorpecente() {
		return contEntorpecente;
	}

	public void setContEntorpecente(String contEntorpecente) {
		this.contEntorpecente = contEntorpecente;
	}

	public String getIdToxico() {
		return idToxico;
	}

	public void setIdToxico(String idToxico) {
		this.idToxico = idToxico;
	}

	public String getIdToxicoEntorpecente() {
		return idToxicoEntorpecente;
	}

	public void setIdToxicoEntorpecente(String idToxicoEntorpecente) {
		this.idToxicoEntorpecente = idToxicoEntorpecente;
	}

	public String getDescrToxico() {
		return descrToxico;
	}

	public void setDescrToxico(String descrToxico) {
		this.descrToxico = descrToxico;
	}

	public String getDescrToxicoEntorpecente() {
		return descrToxicoEntorpecente;
	}

	public void setDescrToxicoEntorpecente(String descrToxicoEntorpecente) {
		this.descrToxicoEntorpecente = descrToxicoEntorpecente;
	}

	public String getIdUnidade() {
		return idUnidade;
	}

	public void setIdUnidade(String idUnidade) {
		this.idUnidade = idUnidade;
	}

	public String getIdUnidadeEntorpecente() {
		return idUnidadeEntorpecente;
	}

	public void setIdUnidadeEntorpecente(String idUnidadeEntorpecente) {
		this.idUnidadeEntorpecente = idUnidadeEntorpecente;
	}

	public String getDescrUnidade() {
		return descrUnidade;
	}

	public void setDescrUnidade(String descrUnidade) {
		this.descrUnidade = descrUnidade;
	}

	public String getDescrUnidadeEntorpecente() {
		return descrUnidadeEntorpecente;
	}

	public void setDescrUnidadeEntorpecente(String descrUnidadeEntorpecente) {
		this.descrUnidadeEntorpecente = descrUnidadeEntorpecente;
	}

	public String getQtdeEncontrada() {
		return qtdeEncontrada;
	}

	public void setQtdeEncontrada(String qtdeEncontrada) {
		this.qtdeEncontrada = qtdeEncontrada;
	}

	public String getIdAcondicionamento() {
		return idAcondicionamento;
	}

	public void setIdAcondicionamento(String idAcondicionamento) {
		this.idAcondicionamento = idAcondicionamento;
	}

	public String getDescrAcondicionamento() {
		return descrAcondicionamento;
	}

	public void setDescrAcondicionamento(String descrAcondicionamento) {
		this.descrAcondicionamento = descrAcondicionamento;
	}

	public String getQtdeAcondicionamento() {
		return qtdeAcondicionamento;
	}

	public void setQtdeAcondicionamento(String qtdeAcondicionamento) {
		this.qtdeAcondicionamento = qtdeAcondicionamento;
	}

	public String getIdInvolucro() {
		return idInvolucro;
	}

	public void setIdInvolucro(String idInvolucro) {
		this.idInvolucro = idInvolucro;
	}

	public String getDescrInvolucro() {
		return descrInvolucro;
	}

	public void setDescrInvolucro(String descrInvolucro) {
		this.descrInvolucro = descrInvolucro;
	}

	public String getNumLaudoIml() {
		return numLaudoIml;
	}

	public void setNumLaudoIml(String numLaudoIml) {
		this.numLaudoIml = numLaudoIml;
	}

	public String getAnoLaudoIml() {
		return anoLaudoIml;
	}

	public void setAnoLaudoIml(String anoLaudoIml) {
		this.anoLaudoIml = anoLaudoIml;
	}

	public String getDescrIml() {
		return descrIml;
	}

	public void setDescrIml(String descrIml) {
		this.descrIml = descrIml;
	}

	public String getNomePeritoIml() {
		return nomePeritoIml;
	}

	public void setNomePeritoIml(String nomePeritoIml) {
		this.nomePeritoIml = nomePeritoIml;
	}

	public String getObsIml() {
		return obsIml;
	}

	public void setObsIml(String obsIml) {
		this.obsIml = obsIml;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getObservacoesEntorpecente() {
		return observacoesEntorpecente;
	}

	public void setObservacoesEntorpecente(String observacoesEntorpecente) {
		this.observacoesEntorpecente = observacoesEntorpecente;
	}



}
