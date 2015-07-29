package br.com.fences.ocorrenciaentidade.ocorrencia.natureza;


import java.io.Serializable;

import com.google.gson.annotations.SerializedName;


public class Modalidade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_MODALIDADE")
	private String idModalidade;

	@SerializedName("RUBRICA")
	private String rubrica;

	public String getIdModalidade() {
		return idModalidade;
	}

	public void setIdModalidade(String idModalidade) {
		this.idModalidade = idModalidade;
	}

	public String getRubrica() {
		return rubrica;
	}

	public void setRubrica(String rubrica) {
		this.rubrica = rubrica;
	}

}
