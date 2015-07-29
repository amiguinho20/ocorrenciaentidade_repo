package br.com.fences.ocorrenciaentidade.ocorrencia;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Espolio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_ESPOLIO")
	private String idEspolio;

	@SerializedName("DESCR_ESPOLIO")
	private String descrEspolio;

	public String getIdEspolio() {
		return idEspolio;
	}

	public void setIdEspolio(String idEspolio) {
		this.idEspolio = idEspolio;
	}

	public String getDescrEspolio() {
		return descrEspolio;
	}

	public void setDescrEspolio(String descrEspolio) {
		this.descrEspolio = descrEspolio;
	}


}
