package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.autor.modusoperandi;


import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class Coacao  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_TIPO_COACAO")
	private String idTipoCoacao;

	@PesquisaTextual
	@SerializedName("DESCR_TIPO_COACAO")
	private String descrTipoCoacao;

	public String getIdTipoCoacao() {
		return idTipoCoacao;
	}

	public void setIdTipoCoacao(String idTipoCoacao) {
		this.idTipoCoacao = idTipoCoacao;
	}

	public String getDescrTipoCoacao() {
		return descrTipoCoacao;
	}

	public void setDescrTipoCoacao(String descrTipoCoacao) {
		this.descrTipoCoacao = descrTipoCoacao;
	}

}
