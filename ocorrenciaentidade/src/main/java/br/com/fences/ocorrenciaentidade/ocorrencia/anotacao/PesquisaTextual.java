package br.com.fences.ocorrenciaentidade.ocorrencia.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Indica que o atributo eh considerado para pesquisa textual.
 * 
 */
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.FIELD)  
public @interface PesquisaTextual {

}
