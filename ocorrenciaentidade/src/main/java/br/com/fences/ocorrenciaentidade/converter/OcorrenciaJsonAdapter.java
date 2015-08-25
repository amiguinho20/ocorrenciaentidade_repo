package br.com.fences.ocorrenciaentidade.converter;

import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import br.com.fences.ocorrenciaentidade.ocorrencia.Ocorrencia;

public class OcorrenciaJsonAdapter implements JsonDeserializer<Ocorrencia>, JsonSerializer<Ocorrencia> {

	@Override
	public Ocorrencia deserialize(JsonElement json, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		
		
//		JsonArray jsonArray = json.getAsJsonArray();
//		jsonArray.
		
		Ocorrencia ocorrencia = context.deserialize(json, type);
		//-- coloca a referencia do pai nos filhos
		if (ocorrencia != null && ocorrencia.getAuxiliar() != null && ocorrencia.getAuxiliar().getFilhos() != null)
		{
			for (Ocorrencia filho : ocorrencia.getAuxiliar().getFilhos())
			{
				filho.getAuxiliar().setPai(ocorrencia);
			}
		}
		
		return ocorrencia;
	}

	@Override
	public JsonElement serialize(Ocorrencia ocorrencia, Type arg1, JsonSerializationContext context) {
		
		//-- retira a referencia do pai nos filhos (EVITA ERRO DE REFERENCIA TRANSITIVA "LOOP INFINITO")
		if (ocorrencia != null && ocorrencia.getAuxiliar() != null && ocorrencia.getAuxiliar().getFilhos() != null)
		{
			for (Ocorrencia filho : ocorrencia.getAuxiliar().getFilhos())
			{
				filho.getAuxiliar().setPai(null);
			}
		}
		JsonElement json = context.serialize(ocorrencia);
		return json;
	}

}
