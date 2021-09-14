package com.yiado.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yiado.converter.JugadorConverter;
import com.yiado.entity.Jugador;
import com.yiado.model.JugadorModel;
import com.yiado.repository.JugadorRepository;

@Service("JugadorService")
public class JugadorService {

	@Autowired
	@Qualifier("JugadorRepository")
	private JugadorRepository repo;
	
	
	@Autowired
	@Qualifier("JugadorConverter")
	private JugadorConverter converter;
	
	private static final Log logger = LogFactory.getLog(JugadorService.class);
	
	public boolean AddJugador(Jugador jugador) {
		logger.info("CREANDO JUGADOR");
		try {
			repo.save(jugador);
			return true;
					
			
		}catch(Exception e){
			logger.error("ERROR CREANDO JUGADOR: " + e);
			return false;
		}
		
	}
	
	public boolean AddJugadores(List<Jugador> jugadores) {
		logger.info("CREANDO JUGADORES");
		try {
			for(Jugador jugador : jugadores ) {
				repo.save(jugador);
			}
			
			return true;
			
		}catch(Exception e){
			logger.error("ERROR CREANDO JUGADOR: " + e);
			return false;
		}
		
	}
	
	public boolean UpdateJugador(Jugador jugador) {
		logger.info("ACTUALIZANDO JUGADOR");
			try {
				repo.save(jugador);
				return true;
						
				
			}catch(Exception e){
				
				return false;
			}
			
		}
	
	public boolean DeleteJugador(String nombre, long id) {
			logger.info("ELIMINANDO JUGADOR");
				try {
					Jugador jugador = repo.findByNombreAndId(nombre, id);
					repo.delete(jugador);
					return true;
							
					
				}catch(Exception e){
					
					return false;
				}
				
			}
		
	public List<JugadorModel> getAllJugador() {
			logger.info("LISTANDO NOTA");
				return converter.convertirLista(repo.findAll());
			
		}
	
	public JugadorModel getNombreStatus(String nombre, Boolean status) {
		
			return new JugadorModel(repo.findByNombreAndStatus(nombre, status));
		
	}
	
	public List<JugadorModel> getStatus(boolean status) {
		
				return converter.convertirLista(repo.findByStatus(status));
			
		}
	
	public List<JugadorModel> getAllJugadorPage(Pageable pageable){
		
		return converter.convertirLista(repo.findAll(pageable).getContent());
		
	}
	

	
}
