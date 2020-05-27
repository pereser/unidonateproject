package br.unibh.unidonate.rest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.unibh.unidonate.entities.Donate;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "donates", path = "donates")
public interface DonateCRUD extends CrudRepository<Donate, Long> {

}