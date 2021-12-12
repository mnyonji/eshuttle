package ke.co.eshuttle.eshuttle.repository;

import ke.co.eshuttle.eshuttle.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
