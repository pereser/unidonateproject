package br.unibh.unidonate.rest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import br.unibh.unidonate.entities.Usuario;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "usuarios", path = "usuarios")
public interface UsuarioCRUD extends CrudRepository<Usuario, Long> {
	
}