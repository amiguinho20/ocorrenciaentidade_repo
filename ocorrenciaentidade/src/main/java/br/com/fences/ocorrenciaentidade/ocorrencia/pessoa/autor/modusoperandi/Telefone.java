package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.autor.modusoperandi;


import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Telefone implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("DDD_TELEFONE")
	private String dddTelefone;

	@SerializedName("DDD_TELEFONE_MODUS_OPERANDI_AUTOR_TELEFONE")
	private String dddTelefoneModusOperandiAutorTelefone;

	@SerializedName("NUMERO_TELEFONE")
	private String numeroTelefone;

	@SerializedName("NUMERO_TELEFONE_MODUS_OPERANDI_AUTOR_TELEFONE")
	private String numeroTelefoneModusOperandiAutorTelefone;

	@SerializedName("DATA_TELEFONE")
	private String dataTelefone;

	@SerializedName("HORA_TELEFONE")
	private String horaTelefone;

	@SerializedName("SEXO_LIGACAO_TELEFONE")
	private String sexoLigacaoTelefone;

	@SerializedName("FLAG_FALA_NO_BOCAL_TELEFONE")
	private String flagFalaNoBocalTelefone;

	@SerializedName("ID_RUIDO_TELEFONE")
	private String idRuidoTelefone;

	@SerializedName("DESCR_RUIDO_TELEFONE")
	private String descrRuidoTelefone;

	public String getDddTelefone() {
		return dddTelefone;
	}

	public void setDddTelefone(String dddTelefone) {
		this.dddTelefone = dddTelefone;
	}

	public String getDddTelefoneModusOperandiAutorTelefone() {
		return dddTelefoneModusOperandiAutorTelefone;
	}

	public void setDddTelefoneModusOperandiAutorTelefone(
			String dddTelefoneModusOperandiAutorTelefone) {
		this.dddTelefoneModusOperandiAutorTelefone = dddTelefoneModusOperandiAutorTelefone;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getNumeroTelefoneModusOperandiAutorTelefone() {
		return numeroTelefoneModusOperandiAutorTelefone;
	}

	public void setNumeroTelefoneModusOperandiAutorTelefone(
			String numeroTelefoneModusOperandiAutorTelefone) {
		this.numeroTelefoneModusOperandiAutorTelefone = numeroTelefoneModusOperandiAutorTelefone;
	}

	public String getDataTelefone() {
		return dataTelefone;
	}

	public void setDataTelefone(String dataTelefone) {
		this.dataTelefone = dataTelefone;
	}

	public String getHoraTelefone() {
		return horaTelefone;
	}

	public void setHoraTelefone(String horaTelefone) {
		this.horaTelefone = horaTelefone;
	}

	public String getSexoLigacaoTelefone() {
		return sexoLigacaoTelefone;
	}

	public void setSexoLigacaoTelefone(String sexoLigacaoTelefone) {
		this.sexoLigacaoTelefone = sexoLigacaoTelefone;
	}

	public String getFlagFalaNoBocalTelefone() {
		return flagFalaNoBocalTelefone;
	}

	public void setFlagFalaNoBocalTelefone(String flagFalaNoBocalTelefone) {
		this.flagFalaNoBocalTelefone = flagFalaNoBocalTelefone;
	}

	public String getIdRuidoTelefone() {
		return idRuidoTelefone;
	}

	public void setIdRuidoTelefone(String idRuidoTelefone) {
		this.idRuidoTelefone = idRuidoTelefone;
	}

	public String getDescrRuidoTelefone() {
		return descrRuidoTelefone;
	}

	public void setDescrRuidoTelefone(String descrRuidoTelefone) {
		this.descrRuidoTelefone = descrRuidoTelefone;
	}


}
