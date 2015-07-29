package br.com.fences.ocorrenciaentidade.ocorrencia;


import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class ModusOperandi  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_LOCAL_ACESSO")
	private String idLocalAcesso;

	@SerializedName("DESCR_LOCAL_ACESSO")
	private String descrLocalAcesso;

	@SerializedName("ID_QUALIFICACAO_ACESSO")
	private String idQualificacaoAcesso;

	@SerializedName("DESCR_QUALIFICACAO_ACESSO")
	private String descrQualificacaoAcesso;

	public String getIdLocalAcesso() {
		return idLocalAcesso;
	}

	public void setIdLocalAcesso(String idLocalAcesso) {
		this.idLocalAcesso = idLocalAcesso;
	}

	public String getDescrLocalAcesso() {
		return descrLocalAcesso;
	}

	public void setDescrLocalAcesso(String descrLocalAcesso) {
		this.descrLocalAcesso = descrLocalAcesso;
	}

	public String getIdQualificacaoAcesso() {
		return idQualificacaoAcesso;
	}

	public void setIdQualificacaoAcesso(String idQualificacaoAcesso) {
		this.idQualificacaoAcesso = idQualificacaoAcesso;
	}

	public String getDescrQualificacaoAcesso() {
		return descrQualificacaoAcesso;
	}

	public void setDescrQualificacaoAcesso(String descrQualificacaoAcesso) {
		this.descrQualificacaoAcesso = descrQualificacaoAcesso;
	}


}
