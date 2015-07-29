package br.com.fences.ocorrenciaentidade.ocorrencia.auxiliar;

import java.util.ArrayList;
import java.util.List;

import br.com.fences.ocorrenciaentidade.ocorrencia.Ocorrencia;

import com.google.gson.annotations.SerializedName;

/**
 * Classe de complemento tecnico. Informacoes auxiliares que nao sao de origem do RDO.
 *
 */
public class Auxiliar {

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
	
	@SerializedName("GOOGLE_LATITUDE")
	private String googleLatitude;
	
	@SerializedName("GOOGLE_LONGITUDE")
	private String googleLongitude; 
	
	@SerializedName("GOOGLE_GEOCODER_STATUS")
	private String googleGeocoderStatus; 
	
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

	public String getGoogleLatitude() {
		return googleLatitude;
	}

	public void setGoogleLatitude(String googleLatitude) {
		this.googleLatitude = googleLatitude;
	}

	public String getGoogleLongitude() {
		return googleLongitude;
	}

	public void setGoogleLongitude(String googleLongitude) {
		this.googleLongitude = googleLongitude;
	}

	public String getGoogleGeocoderStatus() {
		return googleGeocoderStatus;
	}

	public void setGoogleGeocoderStatus(String googleGeocoderStatus) {
		this.googleGeocoderStatus = googleGeocoderStatus;
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
	
}
