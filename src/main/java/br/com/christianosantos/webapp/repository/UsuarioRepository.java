package br.com.christianosantos.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.christianosantos.webapp.entity.UsuarioEntity;
 
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
 
	UsuarioEntity findByLogin(String login);
 
}