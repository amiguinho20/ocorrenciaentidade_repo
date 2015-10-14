package br.com.fences.ocorrenciaentidade.ocorrencia.natureza;


import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class Circunstancia implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_CIRCUNSTANCIA")
	private String idCircunstancia;

	@PesquisaTextual
	@SerializedName("DESCR_CIRCUNSTANCIA")
	private String descrCircunstancia;

	public String getIdCircunstancia() {
		return idCircunstancia;
	}

	public void setIdCircunstancia(String idCircunstancia) {
		this.idCircunstancia = idCircunstancia;
	}

	public String getDescrCircunstancia() {
		return descrCircunstancia;
	}

	public void setDescrCircunstancia(String descrCircunstancia) {
		this.descrCircunstancia = descrCircunstancia;
	}


}
