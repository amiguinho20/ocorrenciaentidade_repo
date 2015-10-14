package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;


public class Toxico implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_TOXICO")
	private String idToxico;

	@PesquisaTextual
	@SerializedName("DESCR_TOXICO")
	private String descrToxico;

	public String getIdToxico() {
		return idToxico;
	}

	public void setIdToxico(String idToxico) {
		this.idToxico = idToxico;
	}

	public String getDescrToxico() {
		return descrToxico;
	}

	public void setDescrToxico(String descrToxico) {
		this.descrToxico = descrToxico;
	}


}
