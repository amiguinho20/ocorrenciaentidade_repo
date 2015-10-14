package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.autor;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class Linguagem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_ACENTO_LINGUAGEM")
	private String idAcentoLinguagem;

	@PesquisaTextual
	@SerializedName("DESCR_ACENTO_LINGUAGEM")
	private String descrAcentoLinguagem;

	@SerializedName("ID_DISTORCAO_LINGUAGEM")
	private String idDistorcaoLinguagem;

	@PesquisaTextual
	@SerializedName("DESCR_DISTORCAO_LINGUAGEM")
	private String descrDistorcaoLinguagem;

	@SerializedName("ID_FRASEOLOGIA_LINGUAGEM")
	private String idFraseologiaLinguagem;

	@PesquisaTextual
	@SerializedName("DESCR_FRASEOLOGIA_LINGUAGEM")
	private String descrFraseologiaLinguagem;

	@SerializedName("ID_RESSONANCIA_LINGUAGEM")
	private String idRessonanciaLinguagem;

	@PesquisaTextual
	@SerializedName("DESCR_RESSONACIA_LINGUAGEM")
	private String descrRessonaciaLinguagem;

	@SerializedName("ID_VELOCIDADE_LINGUAGEM")
	private String idVelocidadeLinguagem;

	@PesquisaTextual
	@SerializedName("DESCR_VELOCIDADE_LINGUAGEM")
	private String descrVelocidadeLinguagem;

	@SerializedName("ID_VOLUME_LINGUAGEM")
	private String idVolumeLinguagem;

	@PesquisaTextual
	@SerializedName("DESCR_VOLUME_LINGUAGEM")
	private String descrVolumeLinguagem;

	@SerializedName("ID_VOZ_LINGUAGEM")
	private String idVozLinguagem;

	@PesquisaTextual
	@SerializedName("DESCR_VOZ_LINGUAGEM")
	private String descrVozLinguagem;

	public String getIdAcentoLinguagem() {
		return idAcentoLinguagem;
	}

	public void setIdAcentoLinguagem(String idAcentoLinguagem) {
		this.idAcentoLinguagem = idAcentoLinguagem;
	}

	public String getDescrAcentoLinguagem() {
		return descrAcentoLinguagem;
	}

	public void setDescrAcentoLinguagem(String descrAcentoLinguagem) {
		this.descrAcentoLinguagem = descrAcentoLinguagem;
	}

	public String getIdDistorcaoLinguagem() {
		return idDistorcaoLinguagem;
	}

	public void setIdDistorcaoLinguagem(String idDistorcaoLinguagem) {
		this.idDistorcaoLinguagem = idDistorcaoLinguagem;
	}

	public String getDescrDistorcaoLinguagem() {
		return descrDistorcaoLinguagem;
	}

	public void setDescrDistorcaoLinguagem(String descrDistorcaoLinguagem) {
		this.descrDistorcaoLinguagem = descrDistorcaoLinguagem;
	}

	public String getIdFraseologiaLinguagem() {
		return idFraseologiaLinguagem;
	}

	public void setIdFraseologiaLinguagem(String idFraseologiaLinguagem) {
		this.idFraseologiaLinguagem = idFraseologiaLinguagem;
	}

	public String getDescrFraseologiaLinguagem() {
		return descrFraseologiaLinguagem;
	}

	public void setDescrFraseologiaLinguagem(String descrFraseologiaLinguagem) {
		this.descrFraseologiaLinguagem = descrFraseologiaLinguagem;
	}

	public String getIdRessonanciaLinguagem() {
		return idRessonanciaLinguagem;
	}

	public void setIdRessonanciaLinguagem(String idRessonanciaLinguagem) {
		this.idRessonanciaLinguagem = idRessonanciaLinguagem;
	}

	public String getDescrRessonaciaLinguagem() {
		return descrRessonaciaLinguagem;
	}

	public void setDescrRessonaciaLinguagem(String descrRessonaciaLinguagem) {
		this.descrRessonaciaLinguagem = descrRessonaciaLinguagem;
	}

	public String getIdVelocidadeLinguagem() {
		return idVelocidadeLinguagem;
	}

	public void setIdVelocidadeLinguagem(String idVelocidadeLinguagem) {
		this.idVelocidadeLinguagem = idVelocidadeLinguagem;
	}

	public String getDescrVelocidadeLinguagem() {
		return descrVelocidadeLinguagem;
	}

	public void setDescrVelocidadeLinguagem(String descrVelocidadeLinguagem) {
		this.descrVelocidadeLinguagem = descrVelocidadeLinguagem;
	}

	public String getIdVolumeLinguagem() {
		return idVolumeLinguagem;
	}

	public void setIdVolumeLinguagem(String idVolumeLinguagem) {
		this.idVolumeLinguagem = idVolumeLinguagem;
	}

	public String getDescrVolumeLinguagem() {
		return descrVolumeLinguagem;
	}

	public void setDescrVolumeLinguagem(String descrVolumeLinguagem) {
		this.descrVolumeLinguagem = descrVolumeLinguagem;
	}

	public String getIdVozLinguagem() {
		return idVozLinguagem;
	}

	public void setIdVozLinguagem(String idVozLinguagem) {
		this.idVozLinguagem = idVozLinguagem;
	}

	public String getDescrVozLinguagem() {
		return descrVozLinguagem;
	}

	public void setDescrVozLinguagem(String descrVozLinguagem) {
		this.descrVozLinguagem = descrVozLinguagem;
	}


}
