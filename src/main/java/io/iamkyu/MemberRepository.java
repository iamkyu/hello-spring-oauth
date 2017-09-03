package io.iamkyu;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Kj Nam
 */
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
}
