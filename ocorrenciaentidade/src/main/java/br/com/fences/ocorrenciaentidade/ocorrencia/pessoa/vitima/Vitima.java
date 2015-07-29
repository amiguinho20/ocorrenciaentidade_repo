package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.vitima;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

public class Vitima implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@SerializedName("FLAG_VITIMA_FATAL")
	private String flagVitimaFatal;

	@SerializedName("FLAG_A_CR_VITIM")
	private String flagACrVitim;

	@SerializedName("FLAG_BEBIDA_ALCOOLICA_VITIMA")
	private String flagBebidaAlcoolicaVitima;

	@SerializedName("FLAG_DIVIDA_VITIMA")
	private String flagDividaVitima;

	@SerializedName("ID_RELIGIAO")
	private String idReligiao;

	@SerializedName("DESCR_RELIGIAO")
	private String descrReligiao;

	@SerializedName("TIPO_SANGUINEO_VITIMA")
	private String tipoSanguineoVitima;

	@SerializedName("FLAG_INTERNADO_VITIMA")
	private String flagInternadoVitima;

	@SerializedName("LOCAL_INTERNACAO_VITIMA")
	private String localInternacaoVitima;

	@SerializedName("FLAG_TRANSPORTADA_VITIMA")
	private String flagTransportadaVitima;
	
	@SerializedName("LOCAL_CATIVEIRO_VITIMA")
	private String localCativeiroVitima;

	@SerializedName("LOCAL_ABANDONO_VITIMA")
	private String localAbandonoVitima;

	@SerializedName("DATA_LIBERTACAO_VITIMA")
	private String dataLibertacaoVitima;

	@SerializedName("HORA_LIBERTACAO_VITIMA")
	private String horaLibertacaoVitima;

	@SerializedName("FLAG_DESP_ANTERIOR_V")
	private String flagDespAnteriorV;

	@SerializedName("RELACIONAMENTO_FAMILIA_VITIMA")
	private String relacionamentoFamiliaVitima;

	@SerializedName("FLAG_SEGURO_VIDA_VITIMA")
	private String flagSeguroVidaVitima;

	@SerializedName("BENEFICIARIOS_VITIMA")
	private String beneficiariosVitima;

	@SerializedName("FLAG_EM_SERVICO")
	private String flagEmServico;

	@SerializedName("ID_POSICAO_CADAVER")
	private String idPosicaoCadaver;

	@SerializedName("DESCR_POSICAO_CADAVER")
	private String descrPosicaoCadaver;

	@SerializedName("TEMPO_PROVAVEL_MORTE")
	private String tempoProvavelMorte;

	@SerializedName("FLAG_SEQUESTRO_VITIMA_CARGA")
	private String flagSequestroVitimaCarga;

	@SerializedName("FLAG_CARCERE_VITIMA_CARGA")
	private String flagCarcereVitimaCarga;

	@SerializedName("FLAG_VITIMA_ANTES_VITIMA_CARGA")
	private String flagVitimaAntesVitimaCarga;

	@SerializedName("CIRCUNSC_ANTES_VITIMA_CARG")
	private String circunscAntesVitimaCarg;

	@SerializedName("LOCAL_ANTES_VITIMA_CARGA")
	private String localAntesVitimaCarga;

	@SerializedName("DATA_ANTES_VITIMA_CARGA")
	private String dataAntesVitimaCarga;

	@SerializedName("ID_TIPO_CARGA_ANTES")
	private String idTipoCargaAntes;

	@SerializedName("DESCR_TIPO")
	private String descrTipo;

	@SerializedName("DESCR_TIPO_CARGA_VITIMA")
	private String descrTipoCargaVitima;
	
	@SerializedName("FERIMENTO")
	private Collection<Ferimento> ferimentos = new ArrayList<>();

	public String getFlagVitimaFatal() {
		return flagVitimaFatal;
	}

	public void setFlagVitimaFatal(String flagVitimaFatal) {
		this.flagVitimaFatal = flagVitimaFatal;
	}

	public String getFlagACrVitim() {
		return flagACrVitim;
	}

	public void setFlagACrVitim(String flagACrVitim) {
		this.flagACrVitim = flagACrVitim;
	}

	public String getFlagBebidaAlcoolicaVitima() {
		return flagBebidaAlcoolicaVitima;
	}

	public void setFlagBebidaAlcoolicaVitima(String flagBebidaAlcoolicaVitima) {
		this.flagBebidaAlcoolicaVitima = flagBebidaAlcoolicaVitima;
	}

	public String getFlagDividaVitima() {
		return flagDividaVitima;
	}

	public void setFlagDividaVitima(String flagDividaVitima) {
		this.flagDividaVitima = flagDividaVitima;
	}

	public String getIdReligiao() {
		return idReligiao;
	}

	public void setIdReligiao(String idReligiao) {
		this.idReligiao = idReligiao;
	}

	public String getDescrReligiao() {
		return descrReligiao;
	}

	public void setDescrReligiao(String descrReligiao) {
		this.descrReligiao = descrReligiao;
	}

	public String getTipoSanguineoVitima() {
		return tipoSanguineoVitima;
	}

	public void setTipoSanguineoVitima(String tipoSanguineoVitima) {
		this.tipoSanguineoVitima = tipoSanguineoVitima;
	}

	public String getFlagInternadoVitima() {
		return flagInternadoVitima;
	}

	public void setFlagInternadoVitima(String flagInternadoVitima) {
		this.flagInternadoVitima = flagInternadoVitima;
	}

	public String getLocalInternacaoVitima() {
		return localInternacaoVitima;
	}

	public void setLocalInternacaoVitima(String localInternacaoVitima) {
		this.localInternacaoVitima = localInternacaoVitima;
	}

	public String getFlagTransportadaVitima() {
		return flagTransportadaVitima;
	}

	public void setFlagTransportadaVitima(String flagTransportadaVitima) {
		this.flagTransportadaVitima = flagTransportadaVitima;
	}

	public String getLocalCativeiroVitima() {
		return localCativeiroVitima;
	}

	public void setLocalCativeiroVitima(String localCativeiroVitima) {
		this.localCativeiroVitima = localCativeiroVitima;
	}

	public String getLocalAbandonoVitima() {
		return localAbandonoVitima;
	}

	public void setLocalAbandonoVitima(String localAbandonoVitima) {
		this.localAbandonoVitima = localAbandonoVitima;
	}

	public String getDataLibertacaoVitima() {
		return dataLibertacaoVitima;
	}

	public void setDataLibertacaoVitima(String dataLibertacaoVitima) {
		this.dataLibertacaoVitima = dataLibertacaoVitima;
	}

	public String getHoraLibertacaoVitima() {
		return horaLibertacaoVitima;
	}

	public void setHoraLibertacaoVitima(String horaLibertacaoVitima) {
		this.horaLibertacaoVitima = horaLibertacaoVitima;
	}

	public String getFlagDespAnteriorV() {
		return flagDespAnteriorV;
	}

	public void setFlagDespAnteriorV(String flagDespAnteriorV) {
		this.flagDespAnteriorV = flagDespAnteriorV;
	}

	public String getRelacionamentoFamiliaVitima() {
		return relacionamentoFamiliaVitima;
	}

	public void setRelacionamentoFamiliaVitima(String relacionamentoFamiliaVitima) {
		this.relacionamentoFamiliaVitima = relacionamentoFamiliaVitima;
	}

	public String getFlagSeguroVidaVitima() {
		return flagSeguroVidaVitima;
	}

	public void setFlagSeguroVidaVitima(String flagSeguroVidaVitima) {
		this.flagSeguroVidaVitima = flagSeguroVidaVitima;
	}

	public String getBeneficiariosVitima() {
		return beneficiariosVitima;
	}

	public void setBeneficiariosVitima(String beneficiariosVitima) {
		this.beneficiariosVitima = beneficiariosVitima;
	}

	public String getFlagEmServico() {
		return flagEmServico;
	}

	public void setFlagEmServico(String flagEmServico) {
		this.flagEmServico = flagEmServico;
	}

	public String getIdPosicaoCadaver() {
		return idPosicaoCadaver;
	}

	public void setIdPosicaoCadaver(String idPosicaoCadaver) {
		this.idPosicaoCadaver = idPosicaoCadaver;
	}

	public String getDescrPosicaoCadaver() {
		return descrPosicaoCadaver;
	}

	public void setDescrPosicaoCadaver(String descrPosicaoCadaver) {
		this.descrPosicaoCadaver = descrPosicaoCadaver;
	}

	public String getTempoProvavelMorte() {
		return tempoProvavelMorte;
	}

	public void setTempoProvavelMorte(String tempoProvavelMorte) {
		this.tempoProvavelMorte = tempoProvavelMorte;
	}

	public String getFlagSequestroVitimaCarga() {
		return flagSequestroVitimaCarga;
	}

	public void setFlagSequestroVitimaCarga(String flagSequestroVitimaCarga) {
		this.flagSequestroVitimaCarga = flagSequestroVitimaCarga;
	}

	public String getFlagCarcereVitimaCarga() {
		return flagCarcereVitimaCarga;
	}

	public void setFlagCarcereVitimaCarga(String flagCarcereVitimaCarga) {
		this.flagCarcereVitimaCarga = flagCarcereVitimaCarga;
	}

	public String getFlagVitimaAntesVitimaCarga() {
		return flagVitimaAntesVitimaCarga;
	}

	public void setFlagVitimaAntesVitimaCarga(String flagVitimaAntesVitimaCarga) {
		this.flagVitimaAntesVitimaCarga = flagVitimaAntesVitimaCarga;
	}

	public String getCircunscAntesVitimaCarg() {
		return circunscAntesVitimaCarg;
	}

	public void setCircunscAntesVitimaCarg(String circunscAntesVitimaCarg) {
		this.circunscAntesVitimaCarg = circunscAntesVitimaCarg;
	}

	public String getLocalAntesVitimaCarga() {
		return localAntesVitimaCarga;
	}

	public void setLocalAntesVitimaCarga(String localAntesVitimaCarga) {
		this.localAntesVitimaCarga = localAntesVitimaCarga;
	}

	public String getDataAntesVitimaCarga() {
		return dataAntesVitimaCarga;
	}

	public void setDataAntesVitimaCarga(String dataAntesVitimaCarga) {
		this.dataAntesVitimaCarga = dataAntesVitimaCarga;
	}

	public String getIdTipoCargaAntes() {
		return idTipoCargaAntes;
	}

	public void setIdTipoCargaAntes(String idTipoCargaAntes) {
		this.idTipoCargaAntes = idTipoCargaAntes;
	}

	public String getDescrTipo() {
		return descrTipo;
	}

	public void setDescrTipo(String descrTipo) {
		this.descrTipo = descrTipo;
	}

	public String getDescrTipoCargaVitima() {
		return descrTipoCargaVitima;
	}

	public void setDescrTipoCargaVitima(String descrTipoCargaVitima) {
		this.descrTipoCargaVitima = descrTipoCargaVitima;
	}

	public Collection<Ferimento> getFerimentos() {
		return ferimentos;
	}

	public void setFerimentos(Collection<Ferimento> ferimentos) {
		this.ferimentos = ferimentos;
	}


}
