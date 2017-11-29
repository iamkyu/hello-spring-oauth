package io.iamkyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author Kj Nam
 */
@EnableResourceServer
@EnableAuthorizationServer
@SpringBootApplication
public class OAuth2Application {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2Application.class, args);
    }
}
