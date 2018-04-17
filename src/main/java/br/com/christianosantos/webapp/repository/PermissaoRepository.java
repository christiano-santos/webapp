package br.com.christianosantos.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
 
import br.com.christianosantos.webapp.entity.GrupoEntity;
import br.com.christianosantos.webapp.entity.PermissaoEntity;
 
 
public interface PermissaoRepository extends JpaRepository<PermissaoEntity, Long> {
 
	List<PermissaoEntity> findByGruposIn(GrupoEntity grupoEntity);
}