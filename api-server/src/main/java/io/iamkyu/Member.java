package io.iamkyu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Kj Nam
 */
@Entity
public class Member {

    @Id @GeneratedValue
    Long id;

    String name;

    String userName;

    String remark;

    public Member(String name, String userName, String remark) {
        this.name = name;
        this.userName = userName;
        this.remark = remark;
    }
}
