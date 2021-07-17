package com.yiado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yiado.entity.Inscripcion;
import com.yiado.model.InscripcionModel;

@Component("InscripcionConverter")
public class InscripcionConverter {

	public List<InscripcionModel> convertirLista(List<Inscripcion> inscripciones){
		
		List<InscripcionModel> minscripcion = new ArrayList<>();
		
		for(Inscripcion inscripcion : inscripciones ) {
			
			minscripcion.add(new InscripcionModel(inscripcion));
		}
		
		return minscripcion;
		
	}
}
