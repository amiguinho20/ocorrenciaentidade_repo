package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Deformidade implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@SerializedName("ID_TIPO_DEFORMIDADE")
	private String idTipoDeformidade;

	@SerializedName("DESCR_TIPO_DEFORMIDADE")
	private String descrTipoDeformidade;

	@SerializedName("ID_LOCAL_CORPO")
	private String idLocalCorpo;

	@SerializedName("DESCR_LOCAL_CORPO")
	private String descrLocalCorpo;

	public String getIdTipoDeformidade() {
		return idTipoDeformidade;
	}

	public void setIdTipoDeformidade(String idTipoDeformidade) {
		this.idTipoDeformidade = idTipoDeformidade;
	}

	public String getDescrTipoDeformidade() {
		return descrTipoDeformidade;
	}

	public void setDescrTipoDeformidade(String descrTipoDeformidade) {
		this.descrTipoDeformidade = descrTipoDeformidade;
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


}
