package com.yiado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yiado.entity.Jugador;
import com.yiado.model.JugadorModel;

@Component("JugadorConverter")
public class JugadorConverter {
	
	public List<JugadorModel> convertirLista(List<Jugador> jugadores){
			
			List<JugadorModel> mjugador = new ArrayList<>();
			
			for(Jugador jugador : jugadores ) {
				
				mjugador.add(new JugadorModel(jugador));
			}
			
			return mjugador;
			
		}
	
}
