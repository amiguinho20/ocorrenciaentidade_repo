package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.autor.modusoperandi;


import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class Instrumento implements Serializable {
	
	private static final long serialVersionUID = 1L;
		
	@SerializedName("ID_INSTRUMENTO")
	private String idInstrumento;

	@PesquisaTextual
	@SerializedName("DESCR_INSTRUMENTO")
	private String descrInstrumento;

	@PesquisaTextual
	@SerializedName("DESCR_INSTRUMENTO_MODUS_OPERANDI_AUTOR_INSTRUMENTO")
	private String descrInstrumentoModusOperandiAutorInstrumento;

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

	public String getDescrInstrumentoModusOperandiAutorInstrumento() {
		return descrInstrumentoModusOperandiAutorInstrumento;
	}

	public void setDescrInstrumentoModusOperandiAutorInstrumento(
			String descrInstrumentoModusOperandiAutorInstrumento) {
		this.descrInstrumentoModusOperandiAutorInstrumento = descrInstrumentoModusOperandiAutorInstrumento;
	}


}
