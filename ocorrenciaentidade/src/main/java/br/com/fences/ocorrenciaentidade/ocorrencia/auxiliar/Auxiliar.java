package br.com.fences.ocorrenciaentidade.ocorrencia.auxiliar;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

import br.com.fences.fencesutils.conversor.RetirarAcentuacao;
import br.com.fences.fencesutils.verificador.Verificador;
import br.com.fences.ocorrenciaentidade.ocorrencia.Ocorrencia;
import br.com.fences.ocorrenciaentidade.ocorrencia.anotacao.PesquisaTextual;

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
	
	@SerializedName("pesquisaGeralRegex")
	private String pesquisaGeralRegex;		//-- alimentado a partir da anotacao PesquisaTextual
	
	@SerializedName("pesquisaGeralTextual")
	private String pesquisaGeralTextual;	//-- alimentado a partir da anotacao PesquisaTextual
	
	
	public String montarAtributoParaPesquisaGeral(Object instancia)
	{
		final String ESPACO_SEPARADOR_DE_VALORES_NA_CONCATENACAO = " ";
		String atributo = "";
		if (instancia != null)
		{
			StringBuilder concatenado = new StringBuilder();
			Class<?> clazz = instancia.getClass();
			for (Field field : clazz.getDeclaredFields())
			{
				field.setAccessible(true);
				if (field.isAnnotationPresent(PesquisaTextual.class))
				{
					String valorOriginal = "";
					try {
						valorOriginal = (String) field.get(instancia);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						throw new RuntimeException("Erro no acesso PesquisaTextual do atributo para pesquisa geral da instancia[" + 
								instancia + "]. Erro: " + e.getMessage(), e);
					}
					if (Verificador.isValorado(valorOriginal) && valorOriginal.length() > 1)
					{
						String valorMaiusculo = valorOriginal.toUpperCase();
						String valorSemAcento = RetirarAcentuacao.converter(valorMaiusculo);
						String valorTratado = valorSemAcento.trim() + ESPACO_SEPARADOR_DE_VALORES_NA_CONCATENACAO; 
						concatenado.append(valorTratado);
					}
				}
				else if (field.getType().equals(Collection.class))
				{
					Collection<?> valoresColecao = null;
					try {
						valoresColecao = (Collection<?>) field.get(instancia);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						throw new RuntimeException("Erro no acesso Collection do atributo para pesquisa geral da instancia[" + 
								instancia + "]. Erro: " + e.getMessage(), e);
					}
					if (Verificador.isValorado(valoresColecao))
					{
						for (Object elemento : valoresColecao)
						{
							//-- RECURSAO
							String retornoDaRecursao = montarAtributoParaPesquisaGeral(elemento);
							if (Verificador.isValorado(retornoDaRecursao))
							{
								concatenado.append(retornoDaRecursao);
							}
						}
					}
				}
			}
			atributo = concatenado.toString();
		}
		return atributo;
	}
	
	
	
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

	public String getPesquisaGeralRegex() {
		return pesquisaGeralRegex;
	}

	public void setPesquisaGeralRegex(String pesquisaGeralRegex) {
		this.pesquisaGeralRegex = pesquisaGeralRegex;
	}

	public String getPesquisaGeralTextual() {
		return pesquisaGeralTextual;
	}

	public void setPesquisaGeralTextual(String pesquisaGeralTextual) {
		this.pesquisaGeralTextual = pesquisaGeralTextual;
	}
	
}
