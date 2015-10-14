package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.autor.modusoperandi;


import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class CaracteristicaPsicologica  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_CARACTERISTICA_PSICOLOGICA")
	private String idCaracteristicaPsicologica;

	@PesquisaTextual
	@SerializedName("DECR_CARAC_PSICO")
	private String decrCaracPsico;

	public String getIdCaracteristicaPsicologica() {
		return idCaracteristicaPsicologica;
	}

	public void setIdCaracteristicaPsicologica(String idCaracteristicaPsicologica) {
		this.idCaracteristicaPsicologica = idCaracteristicaPsicologica;
	}

	public String getDecrCaracPsico() {
		return decrCaracPsico;
	}

	public void setDecrCaracPsico(String decrCaracPsico) {
		this.decrCaracPsico = decrCaracPsico;
	}


}
