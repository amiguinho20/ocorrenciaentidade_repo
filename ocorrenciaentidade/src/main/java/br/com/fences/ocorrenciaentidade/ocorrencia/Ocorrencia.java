package br.com.fences.ocorrenciaentidade.ocorrencia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;
import br.com.fences.ocorrenciaentidade.ocorrencia.auxiliar.Auxiliar;
import br.com.fences.ocorrenciaentidade.ocorrencia.natureza.Natureza;
import br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.Pessoa;
import br.com.fences.ocorrenciaentidade.ocorrencia.veiculo.Veiculo;

public class Ocorrencia implements Serializable, Comparable<Ocorrencia> {
	
	private static final long serialVersionUID = 1L;

	@SerializedName("_id")
	private String id; //-- do banco de dados mongodb
	
	@SerializedName("ID_DELEGACIA")
	private String idDelegacia;
	
	@PesquisaTextual
	@SerializedName("NOME_DELEGACIA")
	private String nomeDelegacia;

	@PesquisaTextual
	@SerializedName("ANO_BO")
	private String anoBo;

	@PesquisaTextual
	@SerializedName("NUM_BO")
	private String numBo;
	
	@SerializedName("ID_SECCIONAL")
	private String idSeccional;

	@PesquisaTextual
	@SerializedName("NOME_SECCIONAL")
	private String nomeSeccional;

	@SerializedName("ID_DEPARTAMENTO")
	private String idDepartamento;

	@PesquisaTextual
	@SerializedName("NOME_DEPARTAMENTO")
	private String nomeDepartamento;
	
	@SerializedName("ID_TIPO_BO")
	private String idTipoBo;

	@PesquisaTextual
	@SerializedName("DESCR_TIPO_BO")
	private String descrTipoBo;
	
	@SerializedName("ID_CIRCUNSCRICAO")
	private String idCircunscricao;
	
	@PesquisaTextual
	@SerializedName("DESCR_CIRCUNSCRICAO")
	private String descrCircunscricao;

	@SerializedName("DATA_OCORRENCIA_BO")
	private String dataOcorrenciaBo;
	
	@SerializedName("DATA_INICIAL_OCORR_INCERTA")
	private String dataInicialOcorrIncerta;
	
	@SerializedName("DATA_FINAL_OCORR_INCERTA")
	private String dataFinalOcorrIncerta;

	@SerializedName("HORA_OCORRENCIA_BO")
	private String horaOcorrenciaBo;

	@SerializedName("DATAHORA_REGISTRO_BO")
	private String datahoraRegistroBo;

	@SerializedName("DATAHORA_IMPRESSAO_BO")
	private String datahoraImpressaoBo;

	@SerializedName("ID_PERIODO")
	private String idPeriodo;

	@SerializedName("DATA_COMUNICACAO_BO")
	private String dataComunicacaoBo;
	
	@SerializedName("HORA_COMUNICACAO_BO")
	private String horaComunicacaoBo;
	
	@PesquisaTextual
	@SerializedName("DESCR_PERIODO")
	private String descrPeriodo;

	@SerializedName("FLAG_FLAGRANTE")
	private String flagFlagrante;

	@SerializedName("FLAG_AUTORIA_BO")
	private String flagAutoriaBo;
	
	@SerializedName("VERSAO")
	private String versao;

	@SerializedName("FLAG_REPRESENTACAO_BO")
	private String flagRepresentacaoBo;
	
	@SerializedName("FLAG_RDO_FINALIZADO")
	private String flagRdoFinalizado;
	
	@SerializedName("FLAG_EXPORTACAO")
	private String flagExportacao;

	@SerializedName("RG_USUARIO")
	private String rgUsuario;
	
	@SerializedName("RG_DELEGADO")
	private String rgDelegado;
	
	@SerializedName("FLAG_CONCURSO_CRIME")
	private String flagConcursoCrime;
	
	@SerializedName("PROVA_BO")
	private String provaBo;

	@SerializedName("ID_TIPOLOCAL")
	private String idTipolocal;

	@PesquisaTextual
	@SerializedName("DESCR_TIPOLOCAL")
	private String descrTipolocal;

	@SerializedName("ID_SUBTIPOLOCAL")
	private String idSubtipolocal;

	@PesquisaTextual
	@SerializedName("DESCR_SUBTIPOLOCAL")
	private String descrSubtipolocal;

	@SerializedName("ID_LOGRADOURO")
	private String idLogradouro;
	
	@PesquisaTextual
	@SerializedName("LOGRADOURO")
	private String logradouro;

	@SerializedName("NUMERO_LOGRADOURO")
	private String numeroLogradouro;

	@PesquisaTextual
	@SerializedName("COMPLEMENTO")
	private String complemento;

	@PesquisaTextual
	@SerializedName("BAIRRO")
	private String bairro;

	@PesquisaTextual
	@SerializedName("CEP")
	private String cep;

	@PesquisaTextual
	@SerializedName("CIDADE")
	private String cidade;

	@PesquisaTextual
	@SerializedName("ID_UF")
	private String idUf;

	@PesquisaTextual
	@SerializedName("NOME_UF")
	private String nomeUf;
	
	@SerializedName("ID_LOGRADOURO_REFERENCIA")
	private String idLogradouroReferencia;
	@PesquisaTextual
	@SerializedName("LOGRADOURO_REFERENCIA")
	private String logradouroReferencia;

	@SerializedName("NUMERO_LOGRADOURO_REFERENCIA")
	private String numeroLogradouroReferencia;

	@SerializedName("ID_PROVIDENCIA")
	private String idProvidencia;
	
	@PesquisaTextual
	@SerializedName("DESCR_PROVIDENCIA")
	private String descrProvidencia;
	
	@SerializedName("ID_EXAME")
	private String idExame;

	@PesquisaTextual
	@SerializedName("DESCR_EXAME")
	private String descrExame;
	
	@SerializedName("ID_SOLUCAO")
	private String idSolucao;
	
	@PesquisaTextual
	@SerializedName("DESCR_SOLUCAO")
	private String descrSolucao;
	
	@SerializedName("FLAG_REFERENCIA")
	private String flagReferencia;
	
	@SerializedName("DATAHORA_EXPORTACAO")
	private String datahoraExportacao;
	
	@SerializedName("RG_DIGITADOR")
	private String rgDigitador;
	
	@SerializedName("LUMINOSIDADE")
	private String luminosidade;

	@PesquisaTextual
	@SerializedName("NUM_MENSAGEM_BO")
	private String numMensagemBo;
	
	@PesquisaTextual
	@SerializedName("NUM_OFICIO_BO")
	private String numOficioBo;
	
	@SerializedName("DATAHORA_EXP_OMEGA")
	private String datahoraExpOmega;
	
	@SerializedName("FLAG_EXP_OMEGA")
	private String flagExpOmega;
	
	@SerializedName("FLAG_DEFENSORIA")
	private String flagDefensoria;

	@SerializedName("DATA_HORA_DEFENSORIA")
	private String dataHoraDefensoria;

	@SerializedName("DATA_HORA_CARGA_DEFENSORIA")
	private String dataHoraCargaDefensoria;

	@SerializedName("DT_DEFENSORIA_CERTIFICACAO")
	private String dtDefensoriaCertificacao;

	@SerializedName("FLAG_CERTIFICACAO")
	private String flagCertificacao;
	
	@PesquisaTextual
	@SerializedName("HISTORICO_BO")
	private String historicoBo;
	
	@SerializedName("DELEG_REFERENCIA_BO")
	private String delegReferenciaBo;
	
	@PesquisaTextual
	@SerializedName("DELEGACIA_REFERENCIA")
	private String delegaciaReferencia;
	
	@PesquisaTextual
	@SerializedName("ANO_REFERENCIA_BO")
	private String anoReferenciaBo;
	
	@PesquisaTextual
	@SerializedName("NUM_REFERENCIA_BO")
	private String numReferenciaBo;
	
	@SerializedName("DELEG_ORIGEM_BO")
	private String delegOrigemBo;
	
	@PesquisaTextual
	@SerializedName("DELEGACIA_ORIGEM")
	private String delegaciaOrigem;
	
	@PesquisaTextual
	@SerializedName("ANO_ORIGEM_BO")
	private String anoOrigemBo;
	
	@PesquisaTextual
	@SerializedName("NUM_ORIGEM_BO")
	private String numOrigemBo;
	
	@SerializedName("FLAG_CONFIDENCIAL")
	private String flagConfidencial;
	
	@SerializedName("ID_APRESENTACAO_OCORR")
	private String idApresentacaoOcorr;
	
	@SerializedName("FLAG_FORMA_APRESENTA")
	private String flagFormaApresenta;
	
	@SerializedName("FLAG_OUTRO_LUGAR_APRESENTA")
	private String flagOutroLugarApresenta;
	
	@SerializedName("TEMPO_PERMANENCIA_APRESENTA")
	private String tempoPermanenciaApresenta;
	
	@SerializedName("LOCAL_APRES_ANTES")
	private String localApresAntes;
	
	@SerializedName("APRESENTA_OCORR_OUTROS")
	private String apresentaOcorrOutros;
	
	@SerializedName("LATITUDE")
	private String latitude;
	
	@SerializedName("LONGITUDE")
	private String longitude;
	
	@SerializedName("FLAG_EXPORTACAO_CAP")
	private String flagExportacaoCap;
	
	@SerializedName("DATAHORA_EXPORTACAO_CAP")
	private String datahoraExportacaoCap;
	
	@SerializedName("ID_CIRCUNSCRICAO_CONF")
	private String idCircunscricaoConf;
	
	@SerializedName("DATA_SYNCH_OFFLINE")
	private String dataSynchOffline;
	
	@SerializedName("RG_USUARIO_SYNCH_OFFLINE")
	private String rgUsuarioSynchOffline;
	
	@SerializedName("NUM_OFFLINE")
	private String numOffline;
	
	@PesquisaTextual
	@SerializedName("MOTIVO_TRANSFERENCIA")
	private String motivoTransferencia;
	
	@SerializedName("LATITUDE_REF")
	private String latitudeRef;
	
	@SerializedName("LONGITUDE_REF")
	private String longitudeRef;
	
	@SerializedName("ID_LOGRADOURO_GEO_REF")
	private String idLogradouroGeoRef;
	
	@SerializedName("ID_LOGRADOURO_GEO")
	private String idLogradouroGeo;
	
	@PesquisaTextual
	@SerializedName("HISTORICO_RESUMIDO")
	private String historicoResumido;
	
	@SerializedName("ID_MUNICIPIO")
	private String idMunicipio;
	
	@SerializedName("NATUREZA")
	private Collection<Natureza> naturezas = new ArrayList<>();

	@SerializedName("PESSOA")
	private Collection<Pessoa> pessoas = new ArrayList<>();

	@SerializedName("VEICULO")
	private Collection<Veiculo> veiculos = new ArrayList<>();
	
	@SerializedName("OBJETO")
	private Collection<Objeto> objetos = new ArrayList<>();
	
	@SerializedName("ARMA")
	private Collection<Arma> armas = new ArrayList<>();

	@SerializedName("CARGA")
	private Collection<Carga> cargas = new ArrayList<>();

	@SerializedName("EMPRESA")
	private Collection<Empresa> empresas = new ArrayList<>();
	
	@SerializedName("ENTORPECENTE")
	private Collection<Entorpecente> entorpecentes = new ArrayList<>();
	
	@SerializedName("MODUS_OPERANDI")
	private Collection<ModusOperandi> modusOperandis = new ArrayList<>();

	@SerializedName("ESPOLIO")
	private Collection<Espolio> espolios = new ArrayList<>();
	
	@SerializedName("AUXILIAR")
	private Auxiliar auxiliar = new Auxiliar();

	
	
	public String getIdDelegacia() {
		return idDelegacia;
	}

	public void setIdDelegacia(String idDelegacia) {
		this.idDelegacia = idDelegacia;
	}

	public String getNomeDelegacia() {
		return nomeDelegacia;
	}

	public void setNomeDelegacia(String nomeDelegacia) {
		this.nomeDelegacia = nomeDelegacia;
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

	public String getIdTipoBo() {
		return idTipoBo;
	}

	public void setIdTipoBo(String idTipoBo) {
		this.idTipoBo = idTipoBo;
	}

	public String getDescrTipoBo() {
		return descrTipoBo;
	}

	public void setDescrTipoBo(String descrTipoBo) {
		this.descrTipoBo = descrTipoBo;
	}

	public String getIdCircunscricao() {
		return idCircunscricao;
	}

	public void setIdCircunscricao(String idCircunscricao) {
		this.idCircunscricao = idCircunscricao;
	}

	public String getDescrCircunscricao() {
		return descrCircunscricao;
	}

	public void setDescrCircunscricao(String descrCircunscricao) {
		this.descrCircunscricao = descrCircunscricao;
	}

	public String getDataOcorrenciaBo() {
		return dataOcorrenciaBo;
	}

	public void setDataOcorrenciaBo(String dataOcorrenciaBo) {
		this.dataOcorrenciaBo = dataOcorrenciaBo;
	}

	public String getDataInicialOcorrIncerta() {
		return dataInicialOcorrIncerta;
	}

	public void setDataInicialOcorrIncerta(String dataInicialOcorrIncerta) {
		this.dataInicialOcorrIncerta = dataInicialOcorrIncerta;
	}

	public String getDataFinalOcorrIncerta() {
		return dataFinalOcorrIncerta;
	}

	public void setDataFinalOcorrIncerta(String dataFinalOcorrIncerta) {
		this.dataFinalOcorrIncerta = dataFinalOcorrIncerta;
	}

	public String getHoraOcorrenciaBo() {
		return horaOcorrenciaBo;
	}

	public void setHoraOcorrenciaBo(String horaOcorrenciaBo) {
		this.horaOcorrenciaBo = horaOcorrenciaBo;
	}

	public String getDatahoraRegistroBo() {
		return datahoraRegistroBo;
	}

	public void setDatahoraRegistroBo(String datahoraRegistroBo) {
		this.datahoraRegistroBo = datahoraRegistroBo;
	}

	public String getDatahoraImpressaoBo() {
		return datahoraImpressaoBo;
	}

	public void setDatahoraImpressaoBo(String datahoraImpressaoBo) {
		this.datahoraImpressaoBo = datahoraImpressaoBo;
	}

	public String getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public String getDataComunicacaoBo() {
		return dataComunicacaoBo;
	}

	public void setDataComunicacaoBo(String dataComunicacaoBo) {
		this.dataComunicacaoBo = dataComunicacaoBo;
	}

	public String getHoraComunicacaoBo() {
		return horaComunicacaoBo;
	}

	public void setHoraComunicacaoBo(String horaComunicacaoBo) {
		this.horaComunicacaoBo = horaComunicacaoBo;
	}

	public String getDescrPeriodo() {
		return descrPeriodo;
	}

	public void setDescrPeriodo(String descrPeriodo) {
		this.descrPeriodo = descrPeriodo;
	}

	public String getFlagFlagrante() {
		return flagFlagrante;
	}

	public void setFlagFlagrante(String flagFlagrante) {
		this.flagFlagrante = flagFlagrante;
	}

	public String getFlagAutoriaBo() {
		return flagAutoriaBo;
	}

	public void setFlagAutoriaBo(String flagAutoriaBo) {
		this.flagAutoriaBo = flagAutoriaBo;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getFlagRepresentacaoBo() {
		return flagRepresentacaoBo;
	}

	public void setFlagRepresentacaoBo(String flagRepresentacaoBo) {
		this.flagRepresentacaoBo = flagRepresentacaoBo;
	}

	public String getFlagRdoFinalizado() {
		return flagRdoFinalizado;
	}

	public void setFlagRdoFinalizado(String flagRdoFinalizado) {
		this.flagRdoFinalizado = flagRdoFinalizado;
	}

	public String getFlagExportacao() {
		return flagExportacao;
	}

	public void setFlagExportacao(String flagExportacao) {
		this.flagExportacao = flagExportacao;
	}

	public String getRgUsuario() {
		return rgUsuario;
	}

	public void setRgUsuario(String rgUsuario) {
		this.rgUsuario = rgUsuario;
	}

	public String getRgDelegado() {
		return rgDelegado;
	}

	public void setRgDelegado(String rgDelegado) {
		this.rgDelegado = rgDelegado;
	}

	public String getFlagConcursoCrime() {
		return flagConcursoCrime;
	}

	public void setFlagConcursoCrime(String flagConcursoCrime) {
		this.flagConcursoCrime = flagConcursoCrime;
	}

	public String getProvaBo() {
		return provaBo;
	}

	public void setProvaBo(String provaBo) {
		this.provaBo = provaBo;
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

	public String getIdSubtipolocal() {
		return idSubtipolocal;
	}

	public void setIdSubtipolocal(String idSubtipolocal) {
		this.idSubtipolocal = idSubtipolocal;
	}

	public String getDescrSubtipolocal() {
		return descrSubtipolocal;
	}

	public void setDescrSubtipolocal(String descrSubtipolocal) {
		this.descrSubtipolocal = descrSubtipolocal;
	}

	public String getIdLogradouro() {
		return idLogradouro;
	}

	public void setIdLogradouro(String idLogradouro) {
		this.idLogradouro = idLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumeroLogradouro() {
		return numeroLogradouro;
	}

	public void setNumeroLogradouro(String numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getIdUf() {
		return idUf;
	}

	public void setIdUf(String idUf) {
		this.idUf = idUf;
	}

	public String getNomeUf() {
		return nomeUf;
	}

	public void setNomeUf(String nomeUf) {
		this.nomeUf = nomeUf;
	}

	public String getIdLogradouroReferencia() {
		return idLogradouroReferencia;
	}

	public void setIdLogradouroReferencia(String idLogradouroReferencia) {
		this.idLogradouroReferencia = idLogradouroReferencia;
	}

	public String getLogradouroReferencia() {
		return logradouroReferencia;
	}

	public void setLogradouroReferencia(String logradouroReferencia) {
		this.logradouroReferencia = logradouroReferencia;
	}

	public String getNumeroLogradouroReferencia() {
		return numeroLogradouroReferencia;
	}

	public void setNumeroLogradouroReferencia(String numeroLogradouroReferencia) {
		this.numeroLogradouroReferencia = numeroLogradouroReferencia;
	}

	public String getIdProvidencia() {
		return idProvidencia;
	}

	public void setIdProvidencia(String idProvidencia) {
		this.idProvidencia = idProvidencia;
	}

	public String getDescrProvidencia() {
		return descrProvidencia;
	}

	public void setDescrProvidencia(String descrProvidencia) {
		this.descrProvidencia = descrProvidencia;
	}

	public String getIdExame() {
		return idExame;
	}

	public void setIdExame(String idExame) {
		this.idExame = idExame;
	}

	public String getDescrExame() {
		return descrExame;
	}

	public void setDescrExame(String descrExame) {
		this.descrExame = descrExame;
	}

	public String getIdSolucao() {
		return idSolucao;
	}

	public void setIdSolucao(String idSolucao) {
		this.idSolucao = idSolucao;
	}

	public String getDescrSolucao() {
		return descrSolucao;
	}

	public void setDescrSolucao(String descrSolucao) {
		this.descrSolucao = descrSolucao;
	}

	public String getFlagReferencia() {
		return flagReferencia;
	}

	public void setFlagReferencia(String flagReferencia) {
		this.flagReferencia = flagReferencia;
	}

	public String getDatahoraExportacao() {
		return datahoraExportacao;
	}

	public void setDatahoraExportacao(String datahoraExportacao) {
		this.datahoraExportacao = datahoraExportacao;
	}

	public String getRgDigitador() {
		return rgDigitador;
	}

	public void setRgDigitador(String rgDigitador) {
		this.rgDigitador = rgDigitador;
	}

	public String getLuminosidade() {
		return luminosidade;
	}

	public void setLuminosidade(String luminosidade) {
		this.luminosidade = luminosidade;
	}

	public String getNumMensagemBo() {
		return numMensagemBo;
	}

	public void setNumMensagemBo(String numMensagemBo) {
		this.numMensagemBo = numMensagemBo;
	}

	public String getNumOficioBo() {
		return numOficioBo;
	}

	public void setNumOficioBo(String numOficioBo) {
		this.numOficioBo = numOficioBo;
	}

	public String getDatahoraExpOmega() {
		return datahoraExpOmega;
	}

	public void setDatahoraExpOmega(String datahoraExpOmega) {
		this.datahoraExpOmega = datahoraExpOmega;
	}

	public String getFlagExpOmega() {
		return flagExpOmega;
	}

	public void setFlagExpOmega(String flagExpOmega) {
		this.flagExpOmega = flagExpOmega;
	}

	public String getFlagDefensoria() {
		return flagDefensoria;
	}

	public void setFlagDefensoria(String flagDefensoria) {
		this.flagDefensoria = flagDefensoria;
	}

	public String getDataHoraDefensoria() {
		return dataHoraDefensoria;
	}

	public void setDataHoraDefensoria(String dataHoraDefensoria) {
		this.dataHoraDefensoria = dataHoraDefensoria;
	}

	public String getDataHoraCargaDefensoria() {
		return dataHoraCargaDefensoria;
	}

	public void setDataHoraCargaDefensoria(String dataHoraCargaDefensoria) {
		this.dataHoraCargaDefensoria = dataHoraCargaDefensoria;
	}

	public String getDtDefensoriaCertificacao() {
		return dtDefensoriaCertificacao;
	}

	public void setDtDefensoriaCertificacao(String dtDefensoriaCertificacao) {
		this.dtDefensoriaCertificacao = dtDefensoriaCertificacao;
	}

	public String getFlagCertificacao() {
		return flagCertificacao;
	}

	public void setFlagCertificacao(String flagCertificacao) {
		this.flagCertificacao = flagCertificacao;
	}

	public String getHistoricoBo() {
		return historicoBo;
	}

	public void setHistoricoBo(String historicoBo) {
		this.historicoBo = historicoBo;
	}

	public String getDelegReferenciaBo() {
		return delegReferenciaBo;
	}

	public void setDelegReferenciaBo(String delegReferenciaBo) {
		this.delegReferenciaBo = delegReferenciaBo;
	}

	public String getDelegaciaReferencia() {
		return delegaciaReferencia;
	}

	public void setDelegaciaReferencia(String delegaciaReferencia) {
		this.delegaciaReferencia = delegaciaReferencia;
	}

	public String getAnoReferenciaBo() {
		return anoReferenciaBo;
	}

	public void setAnoReferenciaBo(String anoReferenciaBo) {
		this.anoReferenciaBo = anoReferenciaBo;
	}

	public String getNumReferenciaBo() {
		return numReferenciaBo;
	}

	public void setNumReferenciaBo(String numReferenciaBo) {
		this.numReferenciaBo = numReferenciaBo;
	}

	public String getDelegOrigemBo() {
		return delegOrigemBo;
	}

	public void setDelegOrigemBo(String delegOrigemBo) {
		this.delegOrigemBo = delegOrigemBo;
	}

	public String getDelegaciaOrigem() {
		return delegaciaOrigem;
	}

	public void setDelegaciaOrigem(String delegaciaOrigem) {
		this.delegaciaOrigem = delegaciaOrigem;
	}

	public String getAnoOrigemBo() {
		return anoOrigemBo;
	}

	public void setAnoOrigemBo(String anoOrigemBo) {
		this.anoOrigemBo = anoOrigemBo;
	}

	public String getNumOrigemBo() {
		return numOrigemBo;
	}

	public void setNumOrigemBo(String numOrigemBo) {
		this.numOrigemBo = numOrigemBo;
	}

	public String getFlagConfidencial() {
		return flagConfidencial;
	}

	public void setFlagConfidencial(String flagConfidencial) {
		this.flagConfidencial = flagConfidencial;
	}

	public String getIdApresentacaoOcorr() {
		return idApresentacaoOcorr;
	}

	public void setIdApresentacaoOcorr(String idApresentacaoOcorr) {
		this.idApresentacaoOcorr = idApresentacaoOcorr;
	}

	public String getFlagFormaApresenta() {
		return flagFormaApresenta;
	}

	public void setFlagFormaApresenta(String flagFormaApresenta) {
		this.flagFormaApresenta = flagFormaApresenta;
	}

	public String getFlagOutroLugarApresenta() {
		return flagOutroLugarApresenta;
	}

	public void setFlagOutroLugarApresenta(String flagOutroLugarApresenta) {
		this.flagOutroLugarApresenta = flagOutroLugarApresenta;
	}

	public String getTempoPermanenciaApresenta() {
		return tempoPermanenciaApresenta;
	}

	public void setTempoPermanenciaApresenta(String tempoPermanenciaApresenta) {
		this.tempoPermanenciaApresenta = tempoPermanenciaApresenta;
	}

	public String getLocalApresAntes() {
		return localApresAntes;
	}

	public void setLocalApresAntes(String localApresAntes) {
		this.localApresAntes = localApresAntes;
	}

	public String getApresentaOcorrOutros() {
		return apresentaOcorrOutros;
	}

	public void setApresentaOcorrOutros(String apresentaOcorrOutros) {
		this.apresentaOcorrOutros = apresentaOcorrOutros;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getFlagExportacaoCap() {
		return flagExportacaoCap;
	}

	public void setFlagExportacaoCap(String flagExportacaoCap) {
		this.flagExportacaoCap = flagExportacaoCap;
	}

	public String getDatahoraExportacaoCap() {
		return datahoraExportacaoCap;
	}

	public void setDatahoraExportacaoCap(String datahoraExportacaoCap) {
		this.datahoraExportacaoCap = datahoraExportacaoCap;
	}

	public String getIdCircunscricaoConf() {
		return idCircunscricaoConf;
	}

	public void setIdCircunscricaoConf(String idCircunscricaoConf) {
		this.idCircunscricaoConf = idCircunscricaoConf;
	}

	public String getDataSynchOffline() {
		return dataSynchOffline;
	}

	public void setDataSynchOffline(String dataSynchOffline) {
		this.dataSynchOffline = dataSynchOffline;
	}

	public String getRgUsuarioSynchOffline() {
		return rgUsuarioSynchOffline;
	}

	public void setRgUsuarioSynchOffline(String rgUsuarioSynchOffline) {
		this.rgUsuarioSynchOffline = rgUsuarioSynchOffline;
	}

	public String getNumOffline() {
		return numOffline;
	}

	public void setNumOffline(String numOffline) {
		this.numOffline = numOffline;
	}

	public String getMotivoTransferencia() {
		return motivoTransferencia;
	}

	public void setMotivoTransferencia(String motivoTransferencia) {
		this.motivoTransferencia = motivoTransferencia;
	}

	public String getLatitudeRef() {
		return latitudeRef;
	}

	public void setLatitudeRef(String latitudeRef) {
		this.latitudeRef = latitudeRef;
	}

	public String getLongitudeRef() {
		return longitudeRef;
	}

	public void setLongitudeRef(String longitudeRef) {
		this.longitudeRef = longitudeRef;
	}

	public String getIdLogradouroGeoRef() {
		return idLogradouroGeoRef;
	}

	public void setIdLogradouroGeoRef(String idLogradouroGeoRef) {
		this.idLogradouroGeoRef = idLogradouroGeoRef;
	}

	public String getIdLogradouroGeo() {
		return idLogradouroGeo;
	}

	public void setIdLogradouroGeo(String idLogradouroGeo) {
		this.idLogradouroGeo = idLogradouroGeo;
	}

	public String getHistoricoResumido() {
		return historicoResumido;
	}

	public void setHistoricoResumido(String historicoResumido) {
		this.historicoResumido = historicoResumido;
	}

	public String getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(String idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public Collection<Natureza> getNaturezas() {
		return naturezas;
	}

	public void setNaturezas(Collection<Natureza> naturezas) {
		this.naturezas = naturezas;
	}

	public Collection<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(Collection<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Collection<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Collection<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public Collection<Objeto> getObjetos() {
		return objetos;
	}

	public void setObjetos(Collection<Objeto> objetos) {
		this.objetos = objetos;
	}

	public Collection<Arma> getArmas() {
		return armas;
	}

	public void setArmas(Collection<Arma> armas) {
		this.armas = armas;
	}

	public Collection<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(Collection<Carga> cargas) {
		this.cargas = cargas;
	}

	public Collection<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(Collection<Empresa> empresas) {
		this.empresas = empresas;
	}

	public Collection<Entorpecente> getEntorpecentes() {
		return entorpecentes;
	}

	public void setEntorpecentes(Collection<Entorpecente> entorpecentes) {
		this.entorpecentes = entorpecentes;
	}

	public Collection<ModusOperandi> getModusOperandis() {
		return modusOperandis;
	}

	public void setModusOperandis(Collection<ModusOperandi> modusOperandis) {
		this.modusOperandis = modusOperandis;
	}

	public Collection<Espolio> getEspolios() {
		return espolios;
	}

	public void setEspolios(Collection<Espolio> espolios) {
		this.espolios = espolios;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Auxiliar getAuxiliar() {
		return auxiliar;
	}

	public void setAuxiliar(Auxiliar auxiliar) {
		this.auxiliar = auxiliar;
	}

	@Override
	public String toString() {
		return "Ocorrencia [id=" + id + ", idDelegacia=" + idDelegacia + ", nomeDelegacia=" + nomeDelegacia + ", anoBo="
				+ anoBo + ", numBo=" + numBo + ", auxiliar=" + auxiliar + "]";
	}

	@Override
	public int compareTo(Ocorrencia o) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoBo == null) ? 0 : anoBo.hashCode());
		result = prime * result + ((datahoraRegistroBo == null) ? 0 : datahoraRegistroBo.hashCode());
		result = prime * result + ((idDelegacia == null) ? 0 : idDelegacia.hashCode());
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
		Ocorrencia other = (Ocorrencia) obj;
		if (anoBo == null) {
			if (other.anoBo != null)
				return false;
		} else if (!anoBo.equals(other.anoBo))
			return false;
		if (datahoraRegistroBo == null) {
			if (other.datahoraRegistroBo != null)
				return false;
		} else if (!datahoraRegistroBo.equals(other.datahoraRegistroBo))
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

	public String getIdSeccional() {
		return idSeccional;
	}

	public void setIdSeccional(String idSeccional) {
		this.idSeccional = idSeccional;
	}

	public String getNomeSeccional() {
		return nomeSeccional;
	}

	public void setNomeSeccional(String nomeSeccional) {
		this.nomeSeccional = nomeSeccional;
	}

	public String getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(String idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

	
	
}
