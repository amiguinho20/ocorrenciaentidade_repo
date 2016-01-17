package br.com.fences.ocorrenciaentidade.composto;

import java.io.Serializable;
import java.util.List;

import br.com.fences.ocorrenciaentidade.ocorrencia.Ocorrencia;

public class OcorrenciaResultadoComposto implements Serializable{

	private static final long serialVersionUID = 7493314518659161512L;
	private Integer quantidadeTotal;
	private List<Ocorrencia> ocorrencias;
	
	public Integer getQuantidadeTotal() {
		return quantidadeTotal;
	}
	public void setQuantidadeTotal(Integer quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}
	public List<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}
	public void setOcorrencias(List<Ocorrencia> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}
	
	
	
}
