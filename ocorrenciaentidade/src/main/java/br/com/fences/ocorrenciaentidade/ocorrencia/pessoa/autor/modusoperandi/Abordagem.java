package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.autor.modusoperandi;


import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Abordagem  implements Serializable {
	
	private static final long serialVersionUID = 1L;
		
	@SerializedName("ID_ABORDAGEM")
	private String idAbordagem;

	@SerializedName("DESCR_ABORDAGEM")
	private String descrAbordagem;

	public String getIdAbordagem() {
		return idAbordagem;
	}

	public void setIdAbordagem(String idAbordagem) {
		this.idAbordagem = idAbordagem;
	}

	public String getDescrAbordagem() {
		return descrAbordagem;
	}

	public void setDescrAbordagem(String descrAbordagem) {
		this.descrAbordagem = descrAbordagem;
	}


	
}
