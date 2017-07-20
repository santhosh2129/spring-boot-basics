package com.santhosh2129.user.server.rest.entity;

import javax.validation.constraints.NotNull;

/**
 * Created by santhosh on 7/1/17.
 */
public class SigninRequestEntity {
    @NotNull
    private String userName;

    @NotNull
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
