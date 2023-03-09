package server.test;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "ablesungen", path = "ablesung")
public interface UserRepository extends PagingAndSortingRepository<WebsiteUser, UUID> {

}
