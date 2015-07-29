package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;


import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Jogo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_JOGO")
	private String idJogo;

	@SerializedName("DESCR_JOGO")
	private String descrJogo;

	public String getIdJogo() {
		return idJogo;
	}

	public void setIdJogo(String idJogo) {
		this.idJogo = idJogo;
	}

	public String getDescrJogo() {
		return descrJogo;
	}

	public void setDescrJogo(String descrJogo) {
		this.descrJogo = descrJogo;
	}

	

}
