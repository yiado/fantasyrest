package com.yiado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yiado.entity.Nota;
import com.yiado.model.NotaModel;

@Component("NotaConverter")
public class NotaConverter {

	public List<NotaModel> convertirLista(List<Nota> notas){
		
		List<NotaModel> mnotas = new ArrayList<>();
		
		for(Nota nota : notas ) {
			
			 mnotas.add(new NotaModel(nota));
		}
		
		return mnotas;
		
	}
	
}