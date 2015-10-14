package br.com.fences.ocorrenciaentidade.ocorrencia.natureza;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;


public class Desdobramento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@SerializedName("ID_DESDOBRAMENTO")
	private String idDesdobramento;
	
	@PesquisaTextual
	@SerializedName("DESCR_DESDOBRAMENTO")
	private String descrDesdobramento;
	
	@SerializedName("MODALIDADE")
	private Collection<Modalidade> modalidades = new ArrayList<>();

	public String getIdDesdobramento() {
		return idDesdobramento;
	}

	public void setIdDesdobramento(String idDesdobramento) {
		this.idDesdobramento = idDesdobramento;
	}

	public String getDescrDesdobramento() {
		return descrDesdobramento;
	}

	public void setDescrDesdobramento(String descrDesdobramento) {
		this.descrDesdobramento = descrDesdobramento;
	}

	public Collection<Modalidade> getModalidades() {
		return modalidades;
	}

	public void setModalidades(Collection<Modalidade> modalidades) {
		this.modalidades = modalidades;
	}


}
