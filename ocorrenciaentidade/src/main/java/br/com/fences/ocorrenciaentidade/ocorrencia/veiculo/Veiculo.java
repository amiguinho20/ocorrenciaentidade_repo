package br.com.fences.ocorrenciaentidade.ocorrencia.veiculo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

public class Veiculo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CONT_VEICULO")
	private String contVeiculo;

	@SerializedName("PLACA_VEICULO")
	private String placaVeiculo;

	@SerializedName("ANO_FABRICACAO")
	private String anoFabricacao;

	@SerializedName("ANO_MODELO")
	private String anoModelo;

	@SerializedName("ID_TIPO_VEICULO")
	private String idTipoVeiculo;

	@SerializedName("DESCR_TIPO_VEICULO")
	private String descrTipoVeiculo;

	@SerializedName("ID_COMBUSTIVEL")
	private String idCombustivel;

	@SerializedName("DESCR_COMBUSTIVEL")
	private String descrCombustivel;

	@SerializedName("ID_COR_VEICULO")
	private String idCorVeiculo;

	@SerializedName("DESCR_COR_VEICULO")
	private String descrCorVeiculo;

	@SerializedName("ID_MARCA_VEICULO")
	private String idMarcaVeiculo;

	@SerializedName("DESCR_MARCA_VEICULO")
	private String descrMarcaVeiculo;

	@SerializedName("CIDADE_VEICULO")
	private String cidadeVeiculo;

	@SerializedName("UF_VEICULO")
	private String ufVeiculo;

	@SerializedName("COD_RENAVAM")
	private String codRenavam;

	@SerializedName("CHASSIS_VEICULO")
	private String chassisVeiculo;

	@SerializedName("NOME_PROPRIETARIO_VEICULO")
	private String nomeProprietarioVeiculo;

	@SerializedName("ID_OCORRENCIA_VEICULO")
	private String idOcorrenciaVeiculo;

	@SerializedName("DESCR_OCORRENCIA_VEICULO")
	private String descrOcorrenciaVeiculo;

	@SerializedName("ID_TIPOLOCAL")
	private String idTipolocal;

	@SerializedName("DESCR_TIPOLOCAL")
	private String descrTipolocal;

	@SerializedName("FLAG_SEGURO_VEICULO")
	private String flagSeguroVeiculo;

	@SerializedName("SEGURADORA_VEICULO")
	private String seguradoraVeiculo;

	@SerializedName("APOLICE_VEICULO")
	private String apoliceVeiculo;

	@SerializedName("LOGOTIPO_VEICULO")
	private String logotipoVeiculo;

	@SerializedName("FLAG_ESCOLTA_VEICULO")
	private String flagEscoltaVeiculo;

	@SerializedName("TEMPO_ABANDONO_VEICULO")
	private String tempoAbandonoVeiculo;

	@SerializedName("DOCUMENTOS_LEVADOS")
	private String documentosLevados;

	@SerializedName("CHASSIS_REMARCADO")
	private String chassisRemarcado;

	@SerializedName("OBSERVACAO_VEICULO")
	private String observacaoVeiculo;
	
	@SerializedName("SEGURANCA")
	private Collection<Seguranca> segurancas = new ArrayList<>();

	@SerializedName("ACESSO")
	private Collection<Acesso> acessos = new ArrayList<>();

	@SerializedName("ACIONAMENTO")
	private Collection<Acionamento> acionamentos = new ArrayList<>();

	@SerializedName("INSTRUMENTO")
	private Collection<Instrumento> instrumentos = new ArrayList<>();

	@SerializedName("CARGA")
	private Collection<Carga> cargas = new ArrayList<>();

	public String getContVeiculo() {
		return contVeiculo;
	}

	public void setContVeiculo(String contVeiculo) {
		this.contVeiculo = contVeiculo;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getIdTipoVeiculo() {
		return idTipoVeiculo;
	}

	public void setIdTipoVeiculo(String idTipoVeiculo) {
		this.idTipoVeiculo = idTipoVeiculo;
	}

	public String getDescrTipoVeiculo() {
		return descrTipoVeiculo;
	}

	public void setDescrTipoVeiculo(String descrTipoVeiculo) {
		this.descrTipoVeiculo = descrTipoVeiculo;
	}

	public String getIdCombustivel() {
		return idCombustivel;
	}

	public void setIdCombustivel(String idCombustivel) {
		this.idCombustivel = idCombustivel;
	}

	public String getDescrCombustivel() {
		return descrCombustivel;
	}

	public void setDescrCombustivel(String descrCombustivel) {
		this.descrCombustivel = descrCombustivel;
	}

	public String getIdCorVeiculo() {
		return idCorVeiculo;
	}

	public void setIdCorVeiculo(String idCorVeiculo) {
		this.idCorVeiculo = idCorVeiculo;
	}

	public String getDescrCorVeiculo() {
		return descrCorVeiculo;
	}

	public void setDescrCorVeiculo(String descrCorVeiculo) {
		this.descrCorVeiculo = descrCorVeiculo;
	}

	public String getIdMarcaVeiculo() {
		return idMarcaVeiculo;
	}

	public void setIdMarcaVeiculo(String idMarcaVeiculo) {
		this.idMarcaVeiculo = idMarcaVeiculo;
	}

	public String getDescrMarcaVeiculo() {
		return descrMarcaVeiculo;
	}

	public void setDescrMarcaVeiculo(String descrMarcaVeiculo) {
		this.descrMarcaVeiculo = descrMarcaVeiculo;
	}

	public String getCidadeVeiculo() {
		return cidadeVeiculo;
	}

	public void setCidadeVeiculo(String cidadeVeiculo) {
		this.cidadeVeiculo = cidadeVeiculo;
	}

	public String getUfVeiculo() {
		return ufVeiculo;
	}

	public void setUfVeiculo(String ufVeiculo) {
		this.ufVeiculo = ufVeiculo;
	}

	public String getCodRenavam() {
		return codRenavam;
	}

	public void setCodRenavam(String codRenavam) {
		this.codRenavam = codRenavam;
	}

	public String getChassisVeiculo() {
		return chassisVeiculo;
	}

	public void setChassisVeiculo(String chassisVeiculo) {
		this.chassisVeiculo = chassisVeiculo;
	}

	public String getNomeProprietarioVeiculo() {
		return nomeProprietarioVeiculo;
	}

	public void setNomeProprietarioVeiculo(String nomeProprietarioVeiculo) {
		this.nomeProprietarioVeiculo = nomeProprietarioVeiculo;
	}

	public String getIdOcorrenciaVeiculo() {
		return idOcorrenciaVeiculo;
	}

	public void setIdOcorrenciaVeiculo(String idOcorrenciaVeiculo) {
		this.idOcorrenciaVeiculo = idOcorrenciaVeiculo;
	}

	public String getDescrOcorrenciaVeiculo() {
		return descrOcorrenciaVeiculo;
	}

	public void setDescrOcorrenciaVeiculo(String descrOcorrenciaVeiculo) {
		this.descrOcorrenciaVeiculo = descrOcorrenciaVeiculo;
	}

	public String getIdTipolocal() {
		return idTipolocal;
	}

	public void setIdTipolocal(String idTipolocal) {
		this.idTipolocal = idTipolocal;
	}

	public String getDescrTipolocal() {
		return descrTipolocal;
	}

	public void setDescrTipolocal(String descrTipolocal) {
		this.descrTipolocal = descrTipolocal;
	}

	public String getFlagSeguroVeiculo() {
		return flagSeguroVeiculo;
	}

	public void setFlagSeguroVeiculo(String flagSeguroVeiculo) {
		this.flagSeguroVeiculo = flagSeguroVeiculo;
	}

	public String getSeguradoraVeiculo() {
		return seguradoraVeiculo;
	}

	public void setSeguradoraVeiculo(String seguradoraVeiculo) {
		this.seguradoraVeiculo = seguradoraVeiculo;
	}

	public String getApoliceVeiculo() {
		return apoliceVeiculo;
	}

	public void setApoliceVeiculo(String apoliceVeiculo) {
		this.apoliceVeiculo = apoliceVeiculo;
	}

	public String getLogotipoVeiculo() {
		return logotipoVeiculo;
	}

	public void setLogotipoVeiculo(String logotipoVeiculo) {
		this.logotipoVeiculo = logotipoVeiculo;
	}

	public String getFlagEscoltaVeiculo() {
		return flagEscoltaVeiculo;
	}

	public void setFlagEscoltaVeiculo(String flagEscoltaVeiculo) {
		this.flagEscoltaVeiculo = flagEscoltaVeiculo;
	}

	public String getTempoAbandonoVeiculo() {
		return tempoAbandonoVeiculo;
	}

	public void setTempoAbandonoVeiculo(String tempoAbandonoVeiculo) {
		this.tempoAbandonoVeiculo = tempoAbandonoVeiculo;
	}

	public String getDocumentosLevados() {
		return documentosLevados;
	}

	public void setDocumentosLevados(String documentosLevados) {
		this.documentosLevados = documentosLevados;
	}

	public String getChassisRemarcado() {
		return chassisRemarcado;
	}

	public void setChassisRemarcado(String chassisRemarcado) {
		this.chassisRemarcado = chassisRemarcado;
	}

	public String getObservacaoVeiculo() {
		return observacaoVeiculo;
	}

	public void setObservacaoVeiculo(String observacaoVeiculo) {
		this.observacaoVeiculo = observacaoVeiculo;
	}

	public Collection<Seguranca> getSegurancas() {
		return segurancas;
	}

	public void setSegurancas(Collection<Seguranca> segurancas) {
		this.segurancas = segurancas;
	}

	public Collection<Acesso> getAcessos() {
		return acessos;
	}

	public void setAcessos(Collection<Acesso> acessos) {
		this.acessos = acessos;
	}

	public Collection<Acionamento> getAcionamentos() {
		return acionamentos;
	}

	public void setAcionamentos(Collection<Acionamento> acionamentos) {
		this.acionamentos = acionamentos;
	}

	public Collection<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(Collection<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}

	public Collection<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(Collection<Carga> cargas) {
		this.cargas = cargas;
	}


}
