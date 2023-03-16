package server.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import server.entities.Ablesung;

import java.util.Optional;
import java.util.UUID;

//Hallo Kili
@RepositoryRestResource(collectionResourceRel = "ablesung", path = "ablesung")
public interface AblesungRepository extends CrudRepository<Ablesung, UUID> {


}
