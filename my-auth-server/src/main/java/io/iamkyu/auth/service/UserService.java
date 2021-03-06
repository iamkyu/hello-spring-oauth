package io.iamkyu.auth.service;

import io.iamkyu.auth.domain.User;
import io.iamkyu.auth.dto.UserCredentials;
import io.iamkyu.auth.exception.BadCredentialsException;
import io.iamkyu.auth.repository.UserJdbcRepository;
import org.springframework.stereotype.Service;

/**
 * @author Kj Nam
 */
@Service
public class UserService {

    UserJdbcRepository userJdbcRepository;

    public UserService(UserJdbcRepository userJdbcRepository) {
        this.userJdbcRepository = userJdbcRepository;
    }

    public User userAuthentication(UserCredentials userCredentials) throws BadCredentialsException {

        if (userCredentials.getName() == null || "".equals(userCredentials.getName())) {
            throw new BadCredentialsException();
        }

        User anUser = userJdbcRepository.findByUserName(userCredentials.getName())
                .orElseThrow(BadCredentialsException::new);

        if (userCredentials.getPassword() == null ||
                !anUser.getPassword().equals(userCredentials.getPassword())) {
            throw new BadCredentialsException();
        }

        return anUser;
    }
}
