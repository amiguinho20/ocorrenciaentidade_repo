package br.com.fences.ocorrenciaentidade.ocorrencia.pessoa;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;


public class Natureza implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("ID_OCORRENCIA")
	private String idOcorrencia;

	@SerializedName("ID_OCORRENCIA_PESSOA_NATUREZA")
	private String idOcorrenciaPessoaNatureza;

	@PesquisaTextual
	@SerializedName("DESCR_OCORRENCIA")
	private String descrOcorrencia;

	@PesquisaTextual
	@SerializedName("DESCR_OCORRENCIA_PESSOA_NATUREZA")
	private String descrOcorrenciaPessoaNatureza;

	@SerializedName("ID_ESPECIE")
	private String idEspecie;

	@SerializedName("ID_ESPECIE_PESSOA_NATUREZA")
	private String idEspeciePessoaNatureza;

	@PesquisaTextual
	@SerializedName("DESCR_ESPECIE")
	private String descrEspecie;

	@PesquisaTextual
	@SerializedName("DESCR_ESPECIE_PESSOA_NATUREZA")
	private String descrEspeciePessoaNatureza;

	@SerializedName("ID_SUBESPECIE")
	private String idSubespecie;

	@SerializedName("ID_SUBESPECIE_PESSOA_NATUREZA")
	private String idSubespeciePessoaNatureza;

	@PesquisaTextual
	@SerializedName("DESCR_SUBESPECIE")
	private String descrSubespecie;

	@PesquisaTextual
	@SerializedName("DESCR_SUBESPECIE_PESSOA_NATUREZA")
	private String descrSubespeciePessoaNatureza;

	@SerializedName("ID_NATUREZA")
	private String idNatureza;

	@SerializedName("ID_NATUREZA_PESSOA_NATUREZA")
	private String idNaturezaPessoaNatureza;

	@PesquisaTextual
	@SerializedName("RUBRICA")
	private String rubrica;

	@PesquisaTextual
	@SerializedName("RUBRICA_PESSOA_NATUREZA")
	private String rubricaPessoaNatureza;

	@SerializedName("ID_DESDOBRAMENTO")
	private String idDesdobramento;

	@SerializedName("ID_DESDOBRAMENTO_PESSOA_NATUREZA")
	private String idDesdobramentoPessoaNatureza;

	@PesquisaTextual
	@SerializedName("DESCR_DESDOBRAMENTO")
	private String descrDesdobramento;

	@PesquisaTextual
	@SerializedName("DESCR_DESDOBRAMENTO_PESSOA_NATUREZA")
	private String descrDesdobramentoPessoaNatureza;

	@SerializedName("ID_MODALIDADE")
	private String idModalidade;

	@PesquisaTextual
	@SerializedName("DESCR_MODALIDADE")
	private String descrModalidade;
	
	@SerializedName("ID_MODALIDADE_PESSOA_NATUREZA")
	private String idModalidadePessoaNatureza;

	public String getIdOcorrencia() {
		return idOcorrencia;
	}

	public void setIdOcorrencia(String idOcorrencia) {
		this.idOcorrencia = idOcorrencia;
	}

	public String getIdOcorrenciaPessoaNatureza() {
		return idOcorrenciaPessoaNatureza;
	}

	public void setIdOcorrenciaPessoaNatureza(String idOcorrenciaPessoaNatureza) {
		this.idOcorrenciaPessoaNatureza = idOcorrenciaPessoaNatureza;
	}

	public String getDescrOcorrencia() {
		return descrOcorrencia;
	}

	public void setDescrOcorrencia(String descrOcorrencia) {
		this.descrOcorrencia = descrOcorrencia;
	}

	public String getDescrOcorrenciaPessoaNatureza() {
		return descrOcorrenciaPessoaNatureza;
	}

	public void setDescrOcorrenciaPessoaNatureza(
			String descrOcorrenciaPessoaNatureza) {
		this.descrOcorrenciaPessoaNatureza = descrOcorrenciaPessoaNatureza;
	}

	public String getIdEspecie() {
		return idEspecie;
	}

	public void setIdEspecie(String idEspecie) {
		this.idEspecie = idEspecie;
	}

	public String getIdEspeciePessoaNatureza() {
		return idEspeciePessoaNatureza;
	}

	public void setIdEspeciePessoaNatureza(String idEspeciePessoaNatureza) {
		this.idEspeciePessoaNatureza = idEspeciePessoaNatureza;
	}

	public String getDescrEspecie() {
		return descrEspecie;
	}

	public void setDescrEspecie(String descrEspecie) {
		this.descrEspecie = descrEspecie;
	}

	public String getDescrEspeciePessoaNatureza() {
		return descrEspeciePessoaNatureza;
	}

	public void setDescrEspeciePessoaNatureza(String descrEspeciePessoaNatureza) {
		this.descrEspeciePessoaNatureza = descrEspeciePessoaNatureza;
	}

	public String getIdSubespecie() {
		return idSubespecie;
	}

	public void setIdSubespecie(String idSubespecie) {
		this.idSubespecie = idSubespecie;
	}

	public String getIdSubespeciePessoaNatureza() {
		return idSubespeciePessoaNatureza;
	}

	public void setIdSubespeciePessoaNatureza(String idSubespeciePessoaNatureza) {
		this.idSubespeciePessoaNatureza = idSubespeciePessoaNatureza;
	}

	public String getDescrSubespecie() {
		return descrSubespecie;
	}

	public void setDescrSubespecie(String descrSubespecie) {
		this.descrSubespecie = descrSubespecie;
	}

	public String getDescrSubespeciePessoaNatureza() {
		return descrSubespeciePessoaNatureza;
	}

	public void setDescrSubespeciePessoaNatureza(
			String descrSubespeciePessoaNatureza) {
		this.descrSubespeciePessoaNatureza = descrSubespeciePessoaNatureza;
	}

	public String getIdNatureza() {
		return idNatureza;
	}

	public void setIdNatureza(String idNatureza) {
		this.idNatureza = idNatureza;
	}

	public String getIdNaturezaPessoaNatureza() {
		return idNaturezaPessoaNatureza;
	}

	public void setIdNaturezaPessoaNatureza(String idNaturezaPessoaNatureza) {
		this.idNaturezaPessoaNatureza = idNaturezaPessoaNatureza;
	}

	public String getRubrica() {
		return rubrica;
	}

	public void setRubrica(String rubrica) {
		this.rubrica = rubrica;
	}

	public String getRubricaPessoaNatureza() {
		return rubricaPessoaNatureza;
	}

	public void setRubricaPessoaNatureza(String rubricaPessoaNatureza) {
		this.rubricaPessoaNatureza = rubricaPessoaNatureza;
	}

	public String getIdDesdobramento() {
		return idDesdobramento;
	}

	public void setIdDesdobramento(String idDesdobramento) {
		this.idDesdobramento = idDesdobramento;
	}

	public String getIdDesdobramentoPessoaNatureza() {
		return idDesdobramentoPessoaNatureza;
	}

	public void setIdDesdobramentoPessoaNatureza(
			String idDesdobramentoPessoaNatureza) {
		this.idDesdobramentoPessoaNatureza = idDesdobramentoPessoaNatureza;
	}

	public String getDescrDesdobramento() {
		return descrDesdobramento;
	}

	public void setDescrDesdobramento(String descrDesdobramento) {
		this.descrDesdobramento = descrDesdobramento;
	}

	public String getDescrDesdobramentoPessoaNatureza() {
		return descrDesdobramentoPessoaNatureza;
	}

	public void setDescrDesdobramentoPessoaNatureza(
			String descrDesdobramentoPessoaNatureza) {
		this.descrDesdobramentoPessoaNatureza = descrDesdobramentoPessoaNatureza;
	}

	public String getIdModalidade() {
		return idModalidade;
	}

	public void setIdModalidade(String idModalidade) {
		this.idModalidade = idModalidade;
	}

	public String getIdModalidadePessoaNatureza() {
		return idModalidadePessoaNatureza;
	}

	public void setIdModalidadePessoaNatureza(String idModalidadePessoaNatureza) {
		this.idModalidadePessoaNatureza = idModalidadePessoaNatureza;
	}

	public String getDescrModalidade() {
		return descrModalidade;
	}

	public void setDescrModalidade(String descrModalidade) {
		this.descrModalidade = descrModalidade;
	}


}
