package hello;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @RepositoryRestResource is not required for a repository to be exported.
 * It is only used to change the export details, such as using /people instead
 * of the default value of /persons.
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    List<Customer> findByLastName(@Param("name") String name);

}