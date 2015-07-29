package br.com.fences.ocorrenciaentidade.ocorrencia.veiculo;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Instrumento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CONT_VEICULO")
	private String contVeiculo;

	@SerializedName("CONT_VEICULO_VEICULO_INSTRUMENTO")
	private String contVeiculoVeiculoInstrumento;

	@SerializedName("ID_INSTRUMENTO")
	private String idInstrumento;

	@SerializedName("DESCR_INSTRUMENTO")
	private String descrInstrumento;

	@SerializedName("CARACTERISTICA_INSTRUMENTO")
	private String caracteristicaInstrumento;

	public String getContVeiculo() {
		return contVeiculo;
	}

	public void setContVeiculo(String contVeiculo) {
		this.contVeiculo = contVeiculo;
	}

	public String getContVeiculoVeiculoInstrumento() {
		return contVeiculoVeiculoInstrumento;
	}

	public void setContVeiculoVeiculoInstrumento(
			String contVeiculoVeiculoInstrumento) {
		this.contVeiculoVeiculoInstrumento = contVeiculoVeiculoInstrumento;
	}

	public String getIdInstrumento() {
		return idInstrumento;
	}

	public void setIdInstrumento(String idInstrumento) {
		this.idInstrumento = idInstrumento;
	}

	public String getDescrInstrumento() {
		return descrInstrumento;
	}

	public void setDescrInstrumento(String descrInstrumento) {
		this.descrInstrumento = descrInstrumento;
	}

	public String getCaracteristicaInstrumento() {
		return caracteristicaInstrumento;
	}

	public void setCaracteristicaInstrumento(String caracteristicaInstrumento) {
		this.caracteristicaInstrumento = caracteristicaInstrumento;
	}


}
