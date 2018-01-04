package io.iamkyu.auth.service;

import io.iamkyu.auth.domain.AccessToken;
import io.iamkyu.auth.domain.RefreshToken;
import io.iamkyu.auth.domain.User;
import io.iamkyu.auth.dto.UserCredentials;
import io.iamkyu.auth.exception.BadCredentialsException;
import io.iamkyu.auth.repository.TokenJdbcRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

/**
 * @author Kj Nam
 */
@Service
public class TokenService {

    private TokenJdbcRepository tokenJdbcRepository;

    private UserService userService;

    public TokenService(TokenJdbcRepository tokenJdbcRepository, UserService userService) {
        this.tokenJdbcRepository = tokenJdbcRepository;
        this.userService = userService;
    }

    public AccessToken allocateToken(UserCredentials userCredentials) throws BadCredentialsException {
        User user = userService.userAuthentication(userCredentials);

        return new AccessToken(
                UUID.randomUUID().toString(),
                AccessToken.TOKEN_TYPE_BEARER,
                new RefreshToken(),
                Date.from(Instant.now()));
    }
}
