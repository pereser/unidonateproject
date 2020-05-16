package br.unibh.unidonate.rest;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import br.unibh.unidonate.entities.Ong;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "ong", path = "ong")
public interface OngCRUD extends CrudRepository<Ong, Long> {


}
