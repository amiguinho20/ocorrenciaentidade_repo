package br.com.fences.ocorrenciaentidade.ocorrencia.natureza;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

public class Natureza implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CONT_NATUREZA")
	private String contNatureza;

	@SerializedName("ID_OCORRENCIA")
	private String idOcorrencia;

	@SerializedName("DESCR_OCORRENCIA")
	private String descrOcorrencia;

	@SerializedName("ID_ESPECIE")
	private String idEspecie;

	@SerializedName("DESCR_ESPECIE")
	private String descrEspecie;
	
	@SerializedName("ID_SUBESPECIE")
	private String idSubespecie;

	@SerializedName("DESCR_SUBESPECIE")
	private String descrSubespecie;
	
	@SerializedName("ID_NATUREZA")
	private String idNatureza;
	
	@SerializedName("RUBRICA_NATUREZA")
	private String rubrica;

	@SerializedName("ID_CONDUTA")
	private String idConduta;

	@SerializedName("DESCR_CONDUTA")
	private String descrConduta;

	@SerializedName("FLAG_STATUS")
	private String flagStatus;

	@SerializedName("DESDOBRAMENTO")
	private Collection<Desdobramento> desdobramentos = new ArrayList<>();
	
	@SerializedName("CIRCUNSTANCIA")
	private Collection<Circunstancia> circunstancias = new ArrayList<>();

	public String getContNatureza() {
		return contNatureza;
	}

	public void setContNatureza(String contNatureza) {
		this.contNatureza = contNatureza;
	}

	public String getIdOcorrencia() {
		return idOcorrencia;
	}

	public void setIdOcorrencia(String idOcorrencia) {
		this.idOcorrencia = idOcorrencia;
	}

	public String getDescrOcorrencia() {
		return descrOcorrencia;
	}

	public void setDescrOcorrencia(String descrOcorrencia) {
		this.descrOcorrencia = descrOcorrencia;
	}

	public String getIdEspecie() {
		return idEspecie;
	}

	public void setIdEspecie(String idEspecie) {
		this.idEspecie = idEspecie;
	}

	public String getDescrEspecie() {
		return descrEspecie;
	}

	public void setDescrEspecie(String descrEspecie) {
		this.descrEspecie = descrEspecie;
	}

	public String getIdSubespecie() {
		return idSubespecie;
	}

	public void setIdSubespecie(String idSubespecie) {
		this.idSubespecie = idSubespecie;
	}

	public String getDescrSubespecie() {
		return descrSubespecie;
	}

	public void setDescrSubespecie(String descrSubespecie) {
		this.descrSubespecie = descrSubespecie;
	}

	public String getIdNatureza() {
		return idNatureza;
	}

	public void setIdNatureza(String idNatureza) {
		this.idNatureza = idNatureza;
	}

	public String getRubrica() {
		return rubrica;
	}

	public void setRubrica(String rubrica) {
		this.rubrica = rubrica;
	}

	public String getIdConduta() {
		return idConduta;
	}

	public void setIdConduta(String idConduta) {
		this.idConduta = idConduta;
	}

	public String getDescrConduta() {
		return descrConduta;
	}

	public void setDescrConduta(String descrConduta) {
		this.descrConduta = descrConduta;
	}

	public String getFlagStatus() {
		return flagStatus;
	}

	public void setFlagStatus(String flagStatus) {
		this.flagStatus = flagStatus;
	}

	public Collection<Desdobramento> getDesdobramentos() {
		return desdobramentos;
	}

	public void setDesdobramentos(Collection<Desdobramento> desdobramentos) {
		this.desdobramentos = desdobramentos;
	}

	public Collection<Circunstancia> getCircunstancias() {
		return circunstancias;
	}

	public void setCircunstancias(Collection<Circunstancia> circunstancias) {
		this.circunstancias = circunstancias;
	}


}
