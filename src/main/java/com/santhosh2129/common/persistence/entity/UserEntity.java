package com.santhosh2129.common.persistence.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.Map;

/**
 * Created by santhosh on 7/1/17.
 */

@Document(collection = "users")
public class UserEntity {
    public static final String NAME = "name";
    public static final String PASSWORD = "password";
    public static final String UPDATE_TS = "update_ts";
    public static final String CREATE_TS = "create_ts";

    @Id
    private String userName;

    @Field(NAME)
    private Name name;

    @Field(PASSWORD)
    private String password;

    @Field(UPDATE_TS)
    private Date updateTimestamp;

    @Field(CREATE_TS)
    private Date createTimestamp;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public class Name {
        private String firstName;
        private String lastName;

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
    }

}
