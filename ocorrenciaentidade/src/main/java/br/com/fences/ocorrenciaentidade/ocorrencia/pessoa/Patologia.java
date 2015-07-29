package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Patologia implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_PATOLOGIA")
	private String idPatologia;
	
	@SerializedName("DESCR_PATOLOGIA")
	private String descrPatologia;

	public String getIdPatologia() {
		return idPatologia;
	}

	public void setIdPatologia(String idPatologia) {
		this.idPatologia = idPatologia;
	}

	public String getDescrPatologia() {
		return descrPatologia;
	}

	public void setDescrPatologia(String descrPatologia) {
		this.descrPatologia = descrPatologia;
	}


}
