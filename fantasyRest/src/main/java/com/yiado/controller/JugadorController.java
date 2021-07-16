package com.yiado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yiado.entity.Jugador;
import com.yiado.model.JugadorModel;
import com.yiado.service.JugadorService;

@RestController
@RequestMapping("/v1")
public class JugadorController {
	
	@Autowired
	 @Qualifier("JugadorService")
	 JugadorService servi;
	 
	 
	 @PostMapping("/jugador")
	 public boolean addJugador(@RequestBody @Validated Jugador jugador){
		return servi.AddJugador(jugador);
		
	}
	 
	 @PostMapping("/jugadores")
	 public boolean addJugadores(@RequestBody @Validated List<Jugador> jugadores){
		return servi.AddJugadores(jugadores);
		
	} 
	
	 @PutMapping("/jugador")
	 public boolean UpdateJugador(@RequestBody @Validated Jugador jugador){
		return servi.UpdateJugador(jugador);
		
	}
	 
	 
	 @DeleteMapping("/jugador/{id}/{nombre}")
	 public boolean deleteJugador(@PathVariable("id") long id, @PathVariable("nombre") String nombre){
		
		//Debe retornar acorde a como fue definido en el servicio
		return servi.DeleteJugador(nombre, id);
		
	}
	 
	@GetMapping("/jugadores")
	public List<JugadorModel> getAllJugador(Pageable pageable){
		
		return servi.getAllJugadorPage(pageable);
	}

}
