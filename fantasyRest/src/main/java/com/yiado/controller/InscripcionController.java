package com.yiado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yiado.entity.Inscripcion;
import com.yiado.entity.Torneo;
import com.yiado.model.InscripcionModel;
import com.yiado.service.InscripcionService;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RequestMapping("/v1")
public class InscripcionController {
	
	@Autowired
	 @Qualifier("InscripcionService")
	 InscripcionService servi;
	
	 @PostMapping("/inscripcion")
	 public boolean addJugador(@RequestBody @Validated Inscripcion inscripcion){
		return servi.AddInscripcion(inscripcion);
		
	}
	 
	 @PostMapping("/inscripciones")
	 public boolean addJugadores(@RequestBody @Validated List<Inscripcion> inscripcion){
		return servi.AddInscripciones(inscripcion);
		
	} 
	
	 @PutMapping("/inscripcion")
	 public boolean UpdateJugador(@RequestBody @Validated Inscripcion inscripcion){
		return servi.UpdateInscripcion(inscripcion);
		
	}
	 
	 
	 @DeleteMapping("/inscripcion/{id}/{torneoId}")
	 public boolean deleteJugador(@PathVariable("id") long id, @PathVariable("torneoId") long torneoId){
		
		//Debe retornar acorde a como fue definido en el servicio
		return servi.DeleteInscripcion(id, torneoId);
		
	}
	 
	/*@GetMapping("/inscripciones")
	public List<InscripcionModel> getAllJugador(Pageable pageable){
		
		return servi.getAllInscripcionPage(pageable);
	}*/
	 
	 @GetMapping("/inscripciones/{status}")
		public List<InscripcionModel> getAllJugador(@PathVariable("status") boolean status){
			
			return servi.getStatus(status);
	}
	 
	 @GetMapping("/inscripciones/{status}/{torneoId}")
		public List<InscripcionModel> getAllInscripcion(@PathVariable("status") boolean status, @PathVariable("torneoId") long torneoId){
		 
		 	Torneo torneo = new Torneo();
		 	torneo.setId(torneoId);
			
			return servi.getStatusAndTorneo(status, torneo);
	}


}
