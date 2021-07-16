package com.yiado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yiado.entity.Usuario;

@Repository("UsuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable> {
	
	public  abstract Usuario findByNombre(String usuario); 
	

}