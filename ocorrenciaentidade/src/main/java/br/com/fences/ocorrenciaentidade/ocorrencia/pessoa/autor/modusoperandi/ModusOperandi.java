package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa.autor.modusoperandi;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class ModusOperandi implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CARACTERISTICA_VEICULO_AUTOR")
	private String caracteristicaVeiculoAutor;

	@SerializedName("FLAG_ALTERACAO_VOZ_AUTOR")
	private String flagAlteracaoVozAutor;

	@SerializedName("TIPO_PROPRIET_VEICULO_AUTOR")
	private String tipoProprietVeiculoAutor;

	@SerializedName("FLAG_ALT_CARACT_PSICO_AUTOR")
	private String flagAltCaractPsicoAutor;

	@SerializedName("FLAG_HABITO_VITIMA_AUTOR")
	private String flagHabitoVitimaAutor;

	@SerializedName("FLAG_HABITO_FAMILIA_AUTOR")
	private String flagHabitoFamiliaAutor;

	@SerializedName("FLAG_LAZER_TRABALHO_AUTOR")
	private String flagLazerTrabalhoAutor;

	@PesquisaTextual
	@SerializedName("PLACA_VEICULO")
	private String placaVeiculo;

	@PesquisaTextual
	@SerializedName("PLACA_VEICULO_MODUS_OPERANDI_AUTOR")
	private String placaVeiculoModusOperandiAutor;

	@PesquisaTextual
	@SerializedName("DESCR_ITINERARIO_AUTOR")
	private String descrItinerarioAutor;

	@SerializedName("AMEACA_PROFERIDA_AUTOR")
	private String ameacaProferidaAutor;
	
	@SerializedName("CARACTERISTICA_PSICOLOGICA")
	private Collection<CaracteristicaPsicologica> caracteristicaPsicologicas = new ArrayList<>();

	@SerializedName("ABORDAGEM")
	private Collection<Abordagem> abordagens = new ArrayList<>();

	@SerializedName("COACAO")
	private Collection<Coacao> coacoes = new ArrayList<>();

	@SerializedName("INSTRUMENTO")
	private Collection<Instrumento> instrumentos = new ArrayList<>();

	@SerializedName("TELEFONE")
	private Collection<Telefone> telefones = new ArrayList<>();

	public String getCaracteristicaVeiculoAutor() {
		return caracteristicaVeiculoAutor;
	}

	public void setCaracteristicaVeiculoAutor(String caracteristicaVeiculoAutor) {
		this.caracteristicaVeiculoAutor = caracteristicaVeiculoAutor;
	}

	public String getFlagAlteracaoVozAutor() {
		return flagAlteracaoVozAutor;
	}

	public void setFlagAlteracaoVozAutor(String flagAlteracaoVozAutor) {
		this.flagAlteracaoVozAutor = flagAlteracaoVozAutor;
	}

	public String getTipoProprietVeiculoAutor() {
		return tipoProprietVeiculoAutor;
	}

	public void setTipoProprietVeiculoAutor(String tipoProprietVeiculoAutor) {
		this.tipoProprietVeiculoAutor = tipoProprietVeiculoAutor;
	}

	public String getFlagAltCaractPsicoAutor() {
		return flagAltCaractPsicoAutor;
	}

	public void setFlagAltCaractPsicoAutor(String flagAltCaractPsicoAutor) {
		this.flagAltCaractPsicoAutor = flagAltCaractPsicoAutor;
	}

	public String getFlagHabitoVitimaAutor() {
		return flagHabitoVitimaAutor;
	}

	public void setFlagHabitoVitimaAutor(String flagHabitoVitimaAutor) {
		this.flagHabitoVitimaAutor = flagHabitoVitimaAutor;
	}

	public String getFlagHabitoFamiliaAutor() {
		return flagHabitoFamiliaAutor;
	}

	public void setFlagHabitoFamiliaAutor(String flagHabitoFamiliaAutor) {
		this.flagHabitoFamiliaAutor = flagHabitoFamiliaAutor;
	}

	public String getFlagLazerTrabalhoAutor() {
		return flagLazerTrabalhoAutor;
	}

	public void setFlagLazerTrabalhoAutor(String flagLazerTrabalhoAutor) {
		this.flagLazerTrabalhoAutor = flagLazerTrabalhoAutor;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public String getPlacaVeiculoModusOperandiAutor() {
		return placaVeiculoModusOperandiAutor;
	}

	public void setPlacaVeiculoModusOperandiAutor(
			String placaVeiculoModusOperandiAutor) {
		this.placaVeiculoModusOperandiAutor = placaVeiculoModusOperandiAutor;
	}

	public String getDescrItinerarioAutor() {
		return descrItinerarioAutor;
	}

	public void setDescrItinerarioAutor(String descrItinerarioAutor) {
		this.descrItinerarioAutor = descrItinerarioAutor;
	}

	public String getAmeacaProferidaAutor() {
		return ameacaProferidaAutor;
	}

	public void setAmeacaProferidaAutor(String ameacaProferidaAutor) {
		this.ameacaProferidaAutor = ameacaProferidaAutor;
	}

	public Collection<CaracteristicaPsicologica> getCaracteristicaPsicologicas() {
		return caracteristicaPsicologicas;
	}

	public void setCaracteristicaPsicologicas(
			Collection<CaracteristicaPsicologica> caracteristicaPsicologicas) {
		this.caracteristicaPsicologicas = caracteristicaPsicologicas;
	}

	public Collection<Abordagem> getAbordagens() {
		return abordagens;
	}

	public void setAbordagens(Collection<Abordagem> abordagens) {
		this.abordagens = abordagens;
	}

	public Collection<Coacao> getCoacoes() {
		return coacoes;
	}

	public void setCoacoes(Collection<Coacao> coacoes) {
		this.coacoes = coacoes;
	}

	public Collection<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(Collection<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}

	public Collection<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Collection<Telefone> telefones) {
		this.telefones = telefones;
	}


}
