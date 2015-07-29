package br.com.fences.ocorrenciaentidade.chave;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class OcorrenciaChave implements Serializable {

	private static final long serialVersionUID = -2118289197568700080L;

	@SerializedName("ID_DELEGACIA")
	private String idDelegacia;

	@SerializedName("ANO_BO")
	private String anoBo;

	@SerializedName("NUM_BO")
	private String numBo;

	@SerializedName("DATAHORA_REGISTRO_BO")
	private String datahoraRegistroBo;

	public OcorrenciaChave() {
	}

	public OcorrenciaChave(String idDelegacia, String anoBo, String numBo) {
		super();
		this.idDelegacia = idDelegacia;
		this.anoBo = anoBo;
		this.numBo = numBo;
	}

	public OcorrenciaChave(String idDelegacia, String anoBo, String numBo,
			String datahoraRegistroBo) {
		super();
		this.idDelegacia = idDelegacia;
		this.anoBo = anoBo;
		this.numBo = numBo;
		this.datahoraRegistroBo = datahoraRegistroBo;
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
		OcorrenciaChave other = (OcorrenciaChave) obj;
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
	public String toString() {
		return "OcorrenciaChave [idDelegacia=" + idDelegacia + ", anoBo="
				+ anoBo + ", numBo=" + numBo + ", datahoraRegistroBo="
				+ datahoraRegistroBo + "]";
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

}
