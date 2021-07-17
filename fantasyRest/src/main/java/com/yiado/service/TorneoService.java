package com.yiado.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yiado.converter.TorneoConverter;
import com.yiado.entity.Torneo;
import com.yiado.model.TorneoModel;
import com.yiado.repository.TorneoRepository;


@Service("TorneoService")
public class TorneoService {
	
	@Autowired
	@Qualifier("TorneoRepository")
	private TorneoRepository repo;
	
	
	@Autowired
	@Qualifier("TorneoConverter")
	private TorneoConverter converter;
	
	private static final Log logger = LogFactory.getLog(TorneoService.class);
	
	public boolean AddTorneo(Torneo torneo) {
		logger.info("CREANDO TORNEO");
		try {
			repo.save(torneo);
			return true;
					
			
		}catch(Exception e){
			logger.error("ERROR CREANDO TORNEO: " + e);
			return false;
		}
		
	}
	
	public boolean AddTorneos(List<Torneo> torneos) {
		logger.info("CREANDO TORNEO");
		try {
			for(Torneo torneo : torneos ) {
				repo.save(torneo);
			}
			
			return true;
			
		}catch(Exception e){
			logger.error("ERROR CREANDO TORNEO: " + e);
			return false;
		}
		
	}
	
	public boolean UpdateTorneo(Torneo torneo) {
		logger.info("ACTUALIZANDO TORNEO");
			try {
				repo.save(torneo);
				return true;
						
				
			}catch(Exception e){
				
				return false;
			}
			
		}
	
	public boolean DeleteTorneo(String nombre, long id) {
			logger.info("ELIMINANDO TORNEO");
				try {
					Torneo torneo = repo.findByNombreAndId(nombre, id);
					repo.delete(torneo);
					return true;
							
					
				}catch(Exception e){
					
					return false;
				}
				
			}
		
	public List<TorneoModel> getAllTorneo() {
			logger.info("LISTANDO TORNEOS");
				return converter.convertirLista(repo.findAll());
			
		}
	
	public TorneoModel getNombreStatus(String nombre, Boolean status) {
		
			return new TorneoModel(repo.findByNombreAndStatus(nombre, status));
		
	}
	
	public List<TorneoModel> getStatus(boolean status) {
		
				return converter.convertirLista(repo.findByStatus(status));
			
		}
	
	public List<TorneoModel> getAllTorneoPage(Pageable pageable){
		
		return converter.convertirLista(repo.findAll(pageable).getContent());
		
	}
}
