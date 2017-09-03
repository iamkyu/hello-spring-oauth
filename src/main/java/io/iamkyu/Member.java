package io.iamkyu;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Kj Nam
 */
@Data
@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String userName;

    private String remark;

    protected Member() {
    }

    public Member(String name, String userName, String remark) {
        this.name = name;
        this.userName = userName;
        this.remark = remark;
    }
}
