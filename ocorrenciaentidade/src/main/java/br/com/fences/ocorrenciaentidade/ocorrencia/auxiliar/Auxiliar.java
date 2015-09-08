package br.com.fences.ocorrenciaentidade.ocorrencia.auxiliar;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.Ocorrencia;

/**
 * Classe de complemento tecnico. Informacoes auxiliares que nao sao de origem do RDO.
 *
 */
public class Auxiliar implements Serializable{

	private static final long serialVersionUID = 2301350263599819990L;

	/**
	 * Objeto que representa do Ponto no padrao GeoJSON
	 */
	@SerializedName("geometry")
	private Point geometry;
	
	@SerializedName("GEOCODER_STATUS")
	private String geocoderStatus; 
	
	@SerializedName("FLAG_COMPLEMENTAR_DE_NATUREZA_LOCALIZACAO")
	private String flagComplementarDeNaturezaLocalizacao;
	
	@SerializedName("FILHOS")
	private transient Set<Ocorrencia> filhos = new LinkedHashSet<>(); //--ocorrencias complementares (filhos)

	@SerializedName("PAI")
	private transient Ocorrencia pai; //--ocorrencias complementada (pai)
	
	@SerializedName("DATA_PROCESSAMENTO")
	private String dataProcessamento;
	
	
	public String getDataProcessamento() {
		return dataProcessamento;
	}

	public void setDataProcessamento(String dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}

	public String getGeocoderStatus() {
		return geocoderStatus;
	}

	public void setGeocoderStatus(String geocoderStatus) {
		this.geocoderStatus = geocoderStatus;
	}

	public String getFlagComplementarDeNaturezaLocalizacao() {
		return flagComplementarDeNaturezaLocalizacao;
	}

	public void setFlagComplementarDeNaturezaLocalizacao(
			String flagComplementarDeNaturezaLocalizacao) {
		this.flagComplementarDeNaturezaLocalizacao = flagComplementarDeNaturezaLocalizacao;
	}

	public Set<Ocorrencia> getFilhos() {
		return filhos;
	}

	public void setFilhos(Set<Ocorrencia> filhos) {
		this.filhos = filhos;
	}

	public Ocorrencia getPai() {
		return pai;
	}

	public void setPai(Ocorrencia pai) {
		this.pai = pai;
	}

	public Point getGeometry() {
		return geometry;
	}

	public void setGeometry(Point geometry) {
		this.geometry = geometry;
	}

	@Override
	public String toString() {
		return "Auxiliar [filhos=" + filhos.size() + ", pai=" + pai + "]";
	}
	
}
