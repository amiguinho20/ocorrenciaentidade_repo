package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;
import br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.autor.Linguagem;
import br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.autor.modusoperandi.ModusOperandi;

import com.google.gson.annotations.SerializedName;


public class Autor implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@SerializedName("ID_RELIGIAO")
	private String idReligiao;

	@SerializedName("ID_RELIGIAO_AUTOR")
	private String idReligiaoAutor;

	@PesquisaTextual
	@SerializedName("DESCR_RELIGIAO")
	private String descrReligiao;

	@PesquisaTextual
	@SerializedName("DESCR_RELIGIAO_AUTOR")
	private String descrReligiaoAutor;

	@SerializedName("FLAG_BEBIDA_ALCOOLICA_AUTOR")
	private String flagBebidaAlcoolicaAutor;

	@SerializedName("FLAG_DIVIDA_AUTOR")
	private String flagDividaAutor;

	@SerializedName("TIPO_SANGUINEO_AUTOR")
	private String tipoSanguineoAutor;

	@PesquisaTextual
	@SerializedName("RELACIONAMENTO_FAMILIA_AUTOR")
	private String relacionamentoFamiliaAutor;
	
	@PesquisaTextual
	@SerializedName("MOTIVO_PRISAO_ANTERIOR_AUTOR")
	private String motivoPrisaoAnteriorAutor;

	@SerializedName("FLAG_ANTECEDENTE_CRIM_AUTOR")
	private String flagAntecedenteCrimAutor;

	@PesquisaTextual
	@SerializedName("PARENTESCO_VITIMA_AUTOR")
	private String parentescoVitimaAutor;
	
	@SerializedName("MODUS_OPERANDI")
	private Collection<ModusOperandi> modusOperandis = new ArrayList<>();

	@SerializedName("LINGUAGEM")
	private Collection<Linguagem> linguagens = new ArrayList<>();

	public String getIdReligiao() {
		return idReligiao;
	}

	public void setIdReligiao(String idReligiao) {
		this.idReligiao = idReligiao;
	}

	public String getIdReligiaoAutor() {
		return idReligiaoAutor;
	}

	public void setIdReligiaoAutor(String idReligiaoAutor) {
		this.idReligiaoAutor = idReligiaoAutor;
	}

	public String getDescrReligiao() {
		return descrReligiao;
	}

	public void setDescrReligiao(String descrReligiao) {
		this.descrReligiao = descrReligiao;
	}

	public String getDescrReligiaoAutor() {
		return descrReligiaoAutor;
	}

	public void setDescrReligiaoAutor(String descrReligiaoAutor) {
		this.descrReligiaoAutor = descrReligiaoAutor;
	}

	public String getFlagBebidaAlcoolicaAutor() {
		return flagBebidaAlcoolicaAutor;
	}

	public void setFlagBebidaAlcoolicaAutor(String flagBebidaAlcoolicaAutor) {
		this.flagBebidaAlcoolicaAutor = flagBebidaAlcoolicaAutor;
	}

	public String getFlagDividaAutor() {
		return flagDividaAutor;
	}

	public void setFlagDividaAutor(String flagDividaAutor) {
		this.flagDividaAutor = flagDividaAutor;
	}

	public String getTipoSanguineoAutor() {
		return tipoSanguineoAutor;
	}

	public void setTipoSanguineoAutor(String tipoSanguineoAutor) {
		this.tipoSanguineoAutor = tipoSanguineoAutor;
	}

	public String getRelacionamentoFamiliaAutor() {
		return relacionamentoFamiliaAutor;
	}

	public void setRelacionamentoFamiliaAutor(String relacionamentoFamiliaAutor) {
		this.relacionamentoFamiliaAutor = relacionamentoFamiliaAutor;
	}

	public String getMotivoPrisaoAnteriorAutor() {
		return motivoPrisaoAnteriorAutor;
	}

	public void setMotivoPrisaoAnteriorAutor(String motivoPrisaoAnteriorAutor) {
		this.motivoPrisaoAnteriorAutor = motivoPrisaoAnteriorAutor;
	}

	public String getFlagAntecedenteCrimAutor() {
		return flagAntecedenteCrimAutor;
	}

	public void setFlagAntecedenteCrimAutor(String flagAntecedenteCrimAutor) {
		this.flagAntecedenteCrimAutor = flagAntecedenteCrimAutor;
	}

	public String getParentescoVitimaAutor() {
		return parentescoVitimaAutor;
	}

	public void setParentescoVitimaAutor(String parentescoVitimaAutor) {
		this.parentescoVitimaAutor = parentescoVitimaAutor;
	}

	public Collection<ModusOperandi> getModusOperandis() {
		return modusOperandis;
	}

	public void setModusOperandis(Collection<ModusOperandi> modusOperandis) {
		this.modusOperandis = modusOperandis;
	}

	public Collection<Linguagem> getLinguagens() {
		return linguagens;
	}

	public void setLinguagens(Collection<Linguagem> linguagens) {
		this.linguagens = linguagens;
	}


}
