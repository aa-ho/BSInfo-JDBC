package server;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import server.entities.Customer;

@RepositoryRestResource(
        collectionResourceRel = "customer",
        path = "customer"
)
public interface CustomerRepository extends CrudRepository<Customer, UUID> {
}