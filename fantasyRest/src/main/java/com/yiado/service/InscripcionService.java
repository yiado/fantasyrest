package com.yiado.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yiado.converter.InscripcionConverter;
import com.yiado.entity.Inscripcion;
import com.yiado.entity.Torneo;
import com.yiado.model.InscripcionModel;
import com.yiado.repository.InscripcionRepository;




@Service("InscripcionService")
public class InscripcionService {

	@Autowired
	@Qualifier("InscripcionRepository")
	private InscripcionRepository repo;
	
	
	@Autowired
	@Qualifier("InscripcionConverter")
	private InscripcionConverter converter;
	
	private static final Log logger = LogFactory.getLog(InscripcionService.class);
	
	public boolean AddInscripcion(Inscripcion inscripcion) {
		logger.info("CREANDO INSCRIPCIÓN");
		try {
			repo.save(inscripcion);
			return true;
					
			
		}catch(Exception e){
			logger.error("ERROR CREANDO INSCRIPCIÓN: " + e);
			return false;
		}
		
	}
	
	public boolean AddInscripciones(List<Inscripcion> inscripciones) {
		logger.info("CREANDO INSCRIPCIÓN");
		try {
			for(Inscripcion inscripcion : inscripciones ) {
				repo.save(inscripcion);
			}
			
			return true;
			
		}catch(Exception e){
			logger.error("ERROR CREANDO INSCRIPCIÓN: " + e);
			return false;
		}
		
	}
	
	public boolean UpdateInscripcion(Inscripcion inscripcion) {
		logger.info("ACTUALIZANDO INSCRIPCIÓN");
			try {
				repo.save(inscripcion);
				return true;
						
				
			}catch(Exception e){
				
				return false;
			}
			
		}
	
	public boolean DeleteInscripcion(long id, long torneoId) {
			logger.info("ELIMINANDO INSCRIPCIÓN");
				try {
					Inscripcion inscripcion = repo.findByIdAndTorneoId(id, torneoId);
					repo.delete(inscripcion);
					return true;
							
					
				}catch(Exception e){
					
					return false;
				}
				
			}
		
	public List<InscripcionModel> getAllInscripcion() {
			logger.info("LISTANDO INSCRIPCIÓN");
				return converter.convertirLista(repo.findAll());
			
		}
	
	public InscripcionModel getIdStatus(long id, Boolean status) {
		
			return new InscripcionModel(repo.findByIdAndStatus(id, status));
		
	}
	
	public List<InscripcionModel> getStatus(boolean status) {
		
				return converter.convertirLista(repo.findByStatus(status));
			
		}
	
	public List<InscripcionModel> getStatusAndTorneo(boolean status, Torneo torneoId) {
		
		return converter.convertirLista(repo.findByStatusAndTorneoId(status , torneoId));
	
}
	
	public List<InscripcionModel> getAllInscripcionPage(Pageable pageable){
		
		return converter.convertirLista(repo.findAll(pageable).getContent());
		
	}
	
}
