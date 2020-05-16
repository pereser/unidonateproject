package br.unibh.unidonate.rest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import br.unibh.unidonate.entities.Donate;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "Donate", path = "Donate")
public interface DonateCRUD extends CrudRepository<Donate, Long> {

}