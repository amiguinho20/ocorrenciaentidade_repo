package br.com.fences.ocorrenciaentidade.ocorrencia.auxiliar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.Ocorrencia;

/**
 * Classe de complemento tecnico. Informacoes auxiliares que nao sao de origem do RDO.
 *
 */
public class Auxiliar implements Serializable{

	private static final long serialVersionUID = 2301350263599819990L;

	public enum EstadoProcessamento { 
		OK("0"), REPROCESSAR("1"), ERRO("2");
		
		private String codigo;
		
		EstadoProcessamento(String codigo){
			this.codigo = codigo;
		}
		public String getCodigo(){
			return codigo;
		}
	} 
	
	/**
	 * Objeto que representa do Ponto no padrao GeoJSON
	 */
	@SerializedName("geometry")
	private Point geometry = new Point();
	
	@SerializedName("GEOCODER_STATUS")
	private String geocoderStatus; 
	
	@SerializedName("FLAG_COMPLEMENTAR_DE_NATUREZA_LOCALIZACAO")
	private String flagComplementarDeNaturezaLocalizacao;
	
	@SerializedName("FILHOS")
	private transient List<Ocorrencia> filhos = new ArrayList<>(); //--ocorrencias complementares (filhos)

	@SerializedName("PAI")
	private transient Ocorrencia pai; //--ocorrencias complementada (pai)
	
	@SerializedName("ESTADO_PROCESSAMENTO")
	private EstadoProcessamento estadoProcessamento; 
	
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

	public List<Ocorrencia> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<Ocorrencia> filhos) {
		this.filhos = filhos;
	}

	public Ocorrencia getPai() {
		return pai;
	}

	public void setPai(Ocorrencia pai) {
		this.pai = pai;
	}

	public EstadoProcessamento getEstadoProcessamento() {
		return estadoProcessamento;
	}

	public void setEstadoProcessamento(EstadoProcessamento estadoProcessamento) {
		this.estadoProcessamento = estadoProcessamento;
	}

	public Point getGeometry() {
		return geometry;
	}

	public void setGeometry(Point geometry) {
		this.geometry = geometry;
	}
	
}
