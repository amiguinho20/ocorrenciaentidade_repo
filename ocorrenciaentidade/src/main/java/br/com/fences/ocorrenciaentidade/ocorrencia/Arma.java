package br.com.fences.ocorrenciaentidade.ocorrencia;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;
import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

public class Arma implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@SerializedName("CONT_ARMA")
	private String contArma;

	@SerializedName("CONT_PESSOA")
	private String contPessoa;

	@SerializedName("CONT_PESSOA_ARMA")
	private String contPessoaArma;

	@PesquisaTextual
	@SerializedName("NOME_PESSOA")
	private String nomePessoa;

	@PesquisaTextual
	@SerializedName("NOME_PESSOA_ARMA")
	private String nomePessoaArma;

	@PesquisaTextual
	@SerializedName("PROPRIETARIO_ARMA")
	private String proprietarioArma;

	@SerializedName("ID_MODO_OBJETO")
	private String idModoObjeto;

	@SerializedName("ID_MODO_OBJETO_ARMA")
	private String idModoObjetoArma;

	@PesquisaTextual
	@SerializedName("DESCR_MODO_OBJETO")
	private String descrModoObjeto;

	@PesquisaTextual
	@SerializedName("DESCR_MODO_OBJETO_ARMA")
	private String descrModoObjetoArma;

	@PesquisaTextual
	@SerializedName("NUMERO_ARMA")
	private String numeroArma;

	@SerializedName("ID_TIPO_ARMA_FOGO")
	private String idTipoArmaFogo;

	@PesquisaTextual
	@SerializedName("DESCR_ARMA_FOGO")
	private String descrArmaFogo;

	@PesquisaTextual
	@SerializedName("MARCA_ARMA")
	private String marcaArma;

	@PesquisaTextual
	@SerializedName("CALIBRE_ARMA")
	private String calibreArma;

	@PesquisaTextual
	@SerializedName("USO_ARMA")
	private String usoArma;

	@SerializedName("QTDE_CAP_INTEGRAS")
	private String qtdeCapIntegras;

	@SerializedName("QTDE_CAP_PICOTADAS")
	private String qtdeCapPicotadas;

	@SerializedName("QTDE_CAP_DEFLAGRADAS")
	private String qtdeCapDeflagradas;

	@SerializedName("ESTADO_ARMA")
	private String estadoArma;

	public String getContArma() {
		return contArma;
	}

	public void setContArma(String contArma) {
		this.contArma = contArma;
	}

	public String getContPessoa() {
		return contPessoa;
	}

	public void setContPessoa(String contPessoa) {
		this.contPessoa = contPessoa;
	}

	public String getContPessoaArma() {
		return contPessoaArma;
	}

	public void setContPessoaArma(String contPessoaArma) {
		this.contPessoaArma = contPessoaArma;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getNomePessoaArma() {
		return nomePessoaArma;
	}

	public void setNomePessoaArma(String nomePessoaArma) {
		this.nomePessoaArma = nomePessoaArma;
	}

	public String getProprietarioArma() {
		return proprietarioArma;
	}

	public void setProprietarioArma(String proprietarioArma) {
		this.proprietarioArma = proprietarioArma;
	}

	public String getIdModoObjeto() {
		return idModoObjeto;
	}

	public void setIdModoObjeto(String idModoObjeto) {
		this.idModoObjeto = idModoObjeto;
	}

	public String getIdModoObjetoArma() {
		return idModoObjetoArma;
	}

	public void setIdModoObjetoArma(String idModoObjetoArma) {
		this.idModoObjetoArma = idModoObjetoArma;
	}

	public String getDescrModoObjeto() {
		return descrModoObjeto;
	}

	public void setDescrModoObjeto(String descrModoObjeto) {
		this.descrModoObjeto = descrModoObjeto;
	}

	public String getDescrModoObjetoArma() {
		return descrModoObjetoArma;
	}

	public void setDescrModoObjetoArma(String descrModoObjetoArma) {
		this.descrModoObjetoArma = descrModoObjetoArma;
	}

	public String getNumeroArma() {
		return numeroArma;
	}

	public void setNumeroArma(String numeroArma) {
		this.numeroArma = numeroArma;
	}

	public String getIdTipoArmaFogo() {
		return idTipoArmaFogo;
	}

	public void setIdTipoArmaFogo(String idTipoArmaFogo) {
		this.idTipoArmaFogo = idTipoArmaFogo;
	}

	public String getDescrArmaFogo() {
		return descrArmaFogo;
	}

	public void setDescrArmaFogo(String descrArmaFogo) {
		this.descrArmaFogo = descrArmaFogo;
	}

	public String getMarcaArma() {
		return marcaArma;
	}

	public void setMarcaArma(String marcaArma) {
		this.marcaArma = marcaArma;
	}

	public String getCalibreArma() {
		return calibreArma;
	}

	public void setCalibreArma(String calibreArma) {
		this.calibreArma = calibreArma;
	}

	public String getUsoArma() {
		return usoArma;
	}

	public void setUsoArma(String usoArma) {
		this.usoArma = usoArma;
	}

	public String getQtdeCapIntegras() {
		return qtdeCapIntegras;
	}

	public void setQtdeCapIntegras(String qtdeCapIntegras) {
		this.qtdeCapIntegras = qtdeCapIntegras;
	}

	public String getQtdeCapPicotadas() {
		return qtdeCapPicotadas;
	}

	public void setQtdeCapPicotadas(String qtdeCapPicotadas) {
		this.qtdeCapPicotadas = qtdeCapPicotadas;
	}

	public String getQtdeCapDeflagradas() {
		return qtdeCapDeflagradas;
	}

	public void setQtdeCapDeflagradas(String qtdeCapDeflagradas) {
		this.qtdeCapDeflagradas = qtdeCapDeflagradas;
	}

	public String getEstadoArma() {
		return estadoArma;
	}

	public void setEstadoArma(String estadoArma) {
		this.estadoArma = estadoArma;
	}

	
	
}
