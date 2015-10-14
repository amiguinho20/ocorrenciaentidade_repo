package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.vitima;



import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class Ferimento  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_FERIMENTO")
	private String idFerimento;

	@PesquisaTextual
	@SerializedName("DESCR_FERIMENTO")
	private String descrFerimento;

	@SerializedName("ID_INSTRUMENTO")
	private String idInstrumento;

	@SerializedName("ID_INSTRUMENTO_FERIMENTO")
	private String idInstrumentoFerimento;

	@PesquisaTextual
	@SerializedName("DESCR_INSTRUMENTO")
	private String descrInstrumento;

	@PesquisaTextual
	@SerializedName("DESCR_INSTRUMENTO_FERIMENTO")
	private String descrInstrumentoFerimento;

	public String getIdFerimento() {
		return idFerimento;
	}

	public void setIdFerimento(String idFerimento) {
		this.idFerimento = idFerimento;
	}

	public String getDescrFerimento() {
		return descrFerimento;
	}

	public void setDescrFerimento(String descrFerimento) {
		this.descrFerimento = descrFerimento;
	}

	public String getIdInstrumento() {
		return idInstrumento;
	}

	public void setIdInstrumento(String idInstrumento) {
		this.idInstrumento = idInstrumento;
	}

	public String getIdInstrumentoFerimento() {
		return idInstrumentoFerimento;
	}

	public void setIdInstrumentoFerimento(String idInstrumentoFerimento) {
		this.idInstrumentoFerimento = idInstrumentoFerimento;
	}

	public String getDescrInstrumento() {
		return descrInstrumento;
	}

	public void setDescrInstrumento(String descrInstrumento) {
		this.descrInstrumento = descrInstrumento;
	}

	public String getDescrInstrumentoFerimento() {
		return descrInstrumentoFerimento;
	}

	public void setDescrInstrumentoFerimento(String descrInstrumentoFerimento) {
		this.descrInstrumentoFerimento = descrInstrumentoFerimento;
	}

}
