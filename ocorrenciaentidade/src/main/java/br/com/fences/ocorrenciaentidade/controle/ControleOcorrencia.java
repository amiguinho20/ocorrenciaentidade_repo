package br.com.fences.ocorrenciaentidade.controle;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.fencesutils.constante.EstadoProcessamento;

public class ControleOcorrencia implements Serializable, Comparable<ControleOcorrencia>{

	private static final long serialVersionUID = -8076447208434368362L;

	@SerializedName("_id")
	private String id; //-- do banco de dados mongodb
	
	private String idDelegacia;

	private String anoBo;

	private String numBo;

	private String datahoraRegistroBo;
	
	private String idOcorrencia; //-- da colecao de ocorrencia correspondente;
	
	private String complementar;
	
	private String datahoraProcessamento;
	
	private EstadoProcessamento estadoProcessamentoOcorrencia;
	
	private EstadoProcessamento estadoProcessamentoIndiciados;

	
	@Override
	public String toString() {
		return "ControleOcorrencia [id=" + id + ", idDelegacia=" + idDelegacia + ", anoBo=" + anoBo + ", numBo=" + numBo
				+ ", datahoraRegistroBo=" + datahoraRegistroBo + ", idOcorrencia=" + idOcorrencia + ", complementar="
				+ complementar + ", datahoraProcessamento=" + datahoraProcessamento + ", estadoProcessamentoOcorrencia="
				+ estadoProcessamentoOcorrencia + ", estadoProcessamentoIndiciados=" + estadoProcessamentoIndiciados
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoBo == null) ? 0 : anoBo.hashCode());
		result = prime * result
				+ ((idDelegacia == null) ? 0 : idDelegacia.hashCode());
		result = prime * result + ((numBo == null) ? 0 : numBo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ControleOcorrencia other = (ControleOcorrencia) obj;
		if (anoBo == null) {
			if (other.anoBo != null)
				return false;
		} else if (!anoBo.equals(other.anoBo))
			return false;
		if (idDelegacia == null) {
			if (other.idDelegacia != null)
				return false;
		} else if (!idDelegacia.equals(other.idDelegacia))
			return false;
		if (numBo == null) {
			if (other.numBo != null)
				return false;
		} else if (!numBo.equals(other.numBo))
			return false;
		return true;
	}

	@Override
	public int compareTo(ControleOcorrencia o) {
		int ret = 0;
		if (getDatahoraRegistroBo() != null)
		{
			ret = getDatahoraRegistroBo().compareTo(o.getDatahoraRegistroBo());
		}
		else
		{
			ret = 0;
		}
		return ret;
	}	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdDelegacia() {
		return idDelegacia;
	}

	public void setIdDelegacia(String idDelegacia) {
		this.idDelegacia = idDelegacia;
	}

	public String getAnoBo() {
		return anoBo;
	}

	public void setAnoBo(String anoBo) {
		this.anoBo = anoBo;
	}

	public String getNumBo() {
		return numBo;
	}

	public void setNumBo(String numBo) {
		this.numBo = numBo;
	}

	public String getDatahoraRegistroBo() {
		return datahoraRegistroBo;
	}

	public void setDatahoraRegistroBo(String datahoraRegistroBo) {
		this.datahoraRegistroBo = datahoraRegistroBo;
	}

	public String getIdOcorrencia() {
		return idOcorrencia;
	}

	public void setIdOcorrencia(String idOcorrencia) {
		this.idOcorrencia = idOcorrencia;
	}

	public String getDatahoraProcessamento() {
		return datahoraProcessamento;
	}

	public void setDatahoraProcessamento(String datahoraProcessamento) {
		this.datahoraProcessamento = datahoraProcessamento;
	}

	public EstadoProcessamento getEstadoProcessamentoOcorrencia() {
		return estadoProcessamentoOcorrencia;
	}

	public void setEstadoProcessamentoOcorrencia(EstadoProcessamento estadoProcessamentoOcorrencia) {
		this.estadoProcessamentoOcorrencia = estadoProcessamentoOcorrencia;
	}

	public EstadoProcessamento getEstadoProcessamentoIndiciados() {
		return estadoProcessamentoIndiciados;
	}

	public void setEstadoProcessamentoIndiciados(EstadoProcessamento estadoProcessamentoIndiciados) {
		this.estadoProcessamentoIndiciados = estadoProcessamentoIndiciados;
	}

	public String getComplementar() {
		return complementar;
	}

	public void setComplementar(String complementar) {
		this.complementar = complementar;
	}

	
}
