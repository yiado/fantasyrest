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

import com.yiado.entity.Torneo;
import com.yiado.model.TorneoModel;
import com.yiado.service.TorneoService;

@RestController
@RequestMapping("/v1")
public class TorneoController {
	
	@Autowired
	 @Qualifier("TorneoService")
	 TorneoService servi;
	
	 @PostMapping("/torneo")
	 public boolean addTorneo(@RequestBody @Validated Torneo torneo){
		return servi.AddTorneo(torneo);
		
	}
	 
	 @PostMapping("/torneos")
	 public boolean addTorneos(@RequestBody @Validated List<Torneo> torneos){
		return servi.AddTorneos(torneos);
		
	} 
	
	 @PutMapping("/torneo")
	 public boolean UpdateTorneo(@RequestBody @Validated Torneo torneo){
		return servi.UpdateTorneo(torneo);
		
	}
	 
	 
	 @DeleteMapping("/torneo/{id}/{nombre}")
	 public boolean deleteTorneo(@PathVariable("id") long id, @PathVariable("nombre") String nombre){
		
		//Debe retornar acorde a como fue definido en el servicio
		return servi.DeleteTorneo(nombre, id);
		
	}
	 
	@GetMapping("/torneos")
	public List<TorneoModel> getAllTorneo(Pageable pageable){
		
		return servi.getAllTorneoPage(pageable);
	}

}
