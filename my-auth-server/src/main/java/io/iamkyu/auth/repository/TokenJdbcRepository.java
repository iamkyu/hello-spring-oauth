package io.iamkyu.auth.repository;

import io.iamkyu.auth.domain.AccessToken;
import io.iamkyu.auth.domain.User;
import io.iamkyu.auth.util.SerializationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Kj Nam
 */
@Repository
public class TokenJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(User user, AccessToken accessToken) {

        String sql = "insert into oauth_client_token (token_id, token, user_no, refresh_token) values (?, ?, ?, ?, ?)";

        this.jdbcTemplate.update(sql,
                new Object[] {accessToken.getValue(), SerializationUtils.serialize(accessToken),
                user.getNo(), accessToken.getRefreshToken().getValue()});
    }
}
