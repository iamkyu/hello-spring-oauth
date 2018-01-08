package io.iamkyu.auth.domain;

/**
 * @author Kj Nam
 */
public class RefreshToken {

    private String value;

    public RefreshToken(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
