package com.santhosh2129.server.service;

import com.santhosh2129.server.rest.entity.SigninRequestEntity;
import com.santhosh2129.server.rest.entity.SignupRequestEntity;

/**
 * Created by santhosh on 7/1/17.
 */
public interface UserSingUpService {
    public String registerUser(SignupRequestEntity signupRequestEntity);

    public String loginUser(SigninRequestEntity signinRequestEntity);

}
