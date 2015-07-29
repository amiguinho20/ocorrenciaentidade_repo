package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Vestuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_TIPO_VESTUARIO")
	private String idTipoVestuario;

	@SerializedName("DESCR_TIPO_VESTUARIO")
	private String descrTipoVestuario;

	@SerializedName("CARACTERISTICA_VESTUARIO")
	private String caracteristicaVestuario;

	public String getIdTipoVestuario() {
		return idTipoVestuario;
	}

	public void setIdTipoVestuario(String idTipoVestuario) {
		this.idTipoVestuario = idTipoVestuario;
	}

	public String getDescrTipoVestuario() {
		return descrTipoVestuario;
	}

	public void setDescrTipoVestuario(String descrTipoVestuario) {
		this.descrTipoVestuario = descrTipoVestuario;
	}

	public String getCaracteristicaVestuario() {
		return caracteristicaVestuario;
	}

	public void setCaracteristicaVestuario(String caracteristicaVestuario) {
		this.caracteristicaVestuario = caracteristicaVestuario;
	}
}
