package com.yiado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yiado.entity.Torneo;
import com.yiado.model.TorneoModel;



@Component("TorneoConverter")
public class TorneoConverter {
	
	public List<TorneoModel> convertirLista(List<Torneo> Torneos){
		
		List<TorneoModel> mtorneo = new ArrayList<>();
		
		for(Torneo torneo : Torneos ) {
			
			mtorneo.add(new TorneoModel(torneo));
		}
		
		return mtorneo;
		
	}

}
