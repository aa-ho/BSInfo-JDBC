package server;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import server.entities.Ablesung;

@RepositoryRestResource(
        collectionResourceRel = "ablesungen",
        path = "ablesung"
)
public interface AblesungRepository extends CrudRepository<Ablesung, UUID> {
}
