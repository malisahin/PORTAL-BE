package com.portal.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Mehmet Ali Sahinogullari on 1.09.2017.
 */

@Entity
@Table(name = "USER", schema = "PORTAL")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER_CODE")
    private String userCode;

    @Column(name = "PASSWORD")
    private String password;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
