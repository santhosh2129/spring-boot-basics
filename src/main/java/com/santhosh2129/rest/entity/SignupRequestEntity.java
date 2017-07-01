package com.santhosh2129.rest.entity;

import javax.validation.constraints.NotNull;

/**
 * Created by santhosh on 7/1/17.
 */
public class SignupRequestEntity {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String password;

    @NotNull
    private String rePassword;

    @NotNull
    private String userName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
