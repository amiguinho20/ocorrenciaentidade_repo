package br.com.fences.ocorrenciaentidade.converter;

import javax.enterprise.context.ApplicationScoped;

import org.bson.Document;

import br.com.fences.fencesutils.conversor.converter.Converter;
import br.com.fences.ocorrenciaentidade.controle.ControleOcorrencia;

@ApplicationScoped
public class ControleOcorrenciaConverter extends Converter<ControleOcorrencia>{
	
	
	@Override
	public Document paraDocumento(ControleOcorrencia controleOcorrencia) 
	{
    	String json = gson.toJson(controleOcorrencia);
    	String jsonMongoDB = transformarIdParaJsonDb(json);
    	Document documento = Document.parse(jsonMongoDB); 
 		return documento;
	}

	@Override
	public ControleOcorrencia paraObjeto(Document doc, Class<ControleOcorrencia> clazz) {
		
		String jsonMongoDB = doc.toJson();
    	String json = transformarIdParaJsonObj(jsonMongoDB);
 		ControleOcorrencia controleOcorrencia = gson.fromJson(json, clazz);
    	
    	return controleOcorrencia;
	}	
	
}
