package br.com.fences.ocorrenciaentidade.ocorrencia.veiculo;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class Carga implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CONT_VEICULO")
	private String contVeiculo;

	@SerializedName("CONT_VEICULO_VEICULO_CARGA")
	private String contVeiculoVeiculoCarga;

	@SerializedName("CARACTERISTICAS")
	private String caracteristicas;

	@SerializedName("ID_TIPO_VEICCARGA")
	private String idTipoVeiccarga;

	@PesquisaTextual
	@SerializedName("DESCR_TIPO_VEICCARGA")
	private String descrTipoVeiccarga;

	@SerializedName("FLAG_ESCOLTA")
	private String flagEscolta;

	@SerializedName("FLAG_RECUPERACAO")
	private String flagRecuperacao;

	@SerializedName("DATA_RECUPERACAO")
	private String dataRecuperacao;

	@SerializedName("HORA_RECUPERACAO")
	private String horaRecuperacao;

	@SerializedName("LOCAL_RECUPERACAO")
	private String localRecuperacao;

	public String getContVeiculo() {
		return contVeiculo;
	}

	public void setContVeiculo(String contVeiculo) {
		this.contVeiculo = contVeiculo;
	}

	public String getContVeiculoVeiculoCarga() {
		return contVeiculoVeiculoCarga;
	}

	public void setContVeiculoVeiculoCarga(String contVeiculoVeiculoCarga) {
		this.contVeiculoVeiculoCarga = contVeiculoVeiculoCarga;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getIdTipoVeiccarga() {
		return idTipoVeiccarga;
	}

	public void setIdTipoVeiccarga(String idTipoVeiccarga) {
		this.idTipoVeiccarga = idTipoVeiccarga;
	}

	public String getDescrTipoVeiccarga() {
		return descrTipoVeiccarga;
	}

	public void setDescrTipoVeiccarga(String descrTipoVeiccarga) {
		this.descrTipoVeiccarga = descrTipoVeiccarga;
	}

	public String getFlagEscolta() {
		return flagEscolta;
	}

	public void setFlagEscolta(String flagEscolta) {
		this.flagEscolta = flagEscolta;
	}

	public String getFlagRecuperacao() {
		return flagRecuperacao;
	}

	public void setFlagRecuperacao(String flagRecuperacao) {
		this.flagRecuperacao = flagRecuperacao;
	}

	public String getDataRecuperacao() {
		return dataRecuperacao;
	}

	public void setDataRecuperacao(String dataRecuperacao) {
		this.dataRecuperacao = dataRecuperacao;
	}

	public String getHoraRecuperacao() {
		return horaRecuperacao;
	}

	public void setHoraRecuperacao(String horaRecuperacao) {
		this.horaRecuperacao = horaRecuperacao;
	}

	public String getLocalRecuperacao() {
		return localRecuperacao;
	}

	public void setLocalRecuperacao(String localRecuperacao) {
		this.localRecuperacao = localRecuperacao;
	}


}
