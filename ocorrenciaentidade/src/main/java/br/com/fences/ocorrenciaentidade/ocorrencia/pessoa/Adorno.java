package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;


public class Adorno implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_TIPO_ADORNO")
	private String idTipoAdorno;

	@SerializedName("DESCR_TIPO_ADORNO")
	private String descrTipoAdorno;

	@SerializedName("ID_LOCAL_CORPO")
	private String idLocalCorpo;

	@SerializedName("DESCR_LOCAL_CORPO")
	private String descrLocalCorpo;

	@SerializedName("CARACTERISTICA_ADORNO")
	private String caracteristicaAdorno;

	public String getIdTipoAdorno() {
		return idTipoAdorno;
	}

	public void setIdTipoAdorno(String idTipoAdorno) {
		this.idTipoAdorno = idTipoAdorno;
	}

	public String getDescrTipoAdorno() {
		return descrTipoAdorno;
	}

	public void setDescrTipoAdorno(String descrTipoAdorno) {
		this.descrTipoAdorno = descrTipoAdorno;
	}

	public String getIdLocalCorpo() {
		return idLocalCorpo;
	}

	public void setIdLocalCorpo(String idLocalCorpo) {
		this.idLocalCorpo = idLocalCorpo;
	}

	public String getDescrLocalCorpo() {
		return descrLocalCorpo;
	}

	public void setDescrLocalCorpo(String descrLocalCorpo) {
		this.descrLocalCorpo = descrLocalCorpo;
	}

	public String getCaracteristicaAdorno() {
		return caracteristicaAdorno;
	}

	public void setCaracteristicaAdorno(String caracteristicaAdorno) {
		this.caracteristicaAdorno = caracteristicaAdorno;
	}


}
