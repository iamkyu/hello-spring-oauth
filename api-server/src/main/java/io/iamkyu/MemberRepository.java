package io.iamkyu;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Kj Nam
 */
@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
}
