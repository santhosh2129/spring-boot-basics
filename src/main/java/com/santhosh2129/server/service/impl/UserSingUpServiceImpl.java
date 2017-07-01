package com.santhosh2129.server.service.impl;

import com.santhosh2129.common.authentication.AuthenticationService;
import com.santhosh2129.common.persistence.entity.SignUpEntity;
import com.santhosh2129.common.persistence.repository.UserSignUpRepository;
import com.santhosh2129.server.rest.entity.SignupRequestEntity;
import com.santhosh2129.server.service.UserSingUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by santhosh on 7/1/17.
 */
@Service
public class UserSingUpServiceImpl implements UserSingUpService {

    @Autowired
    private UserSignUpRepository userSignUpRepository;

    @Autowired
    private AuthenticationService authenticationService;

    @Override
    public String registerUser(SignupRequestEntity signupRequestEntity) {
        SignUpEntity signUpEntity = new SignUpEntity();
        signUpEntity.setPassword(authenticationService.encrypt(signupRequestEntity.getPassword()));
        signUpEntity.setCreateTimestamp(new Date());
        signUpEntity.setUpdateTimestamp(new Date());
        SignUpEntity.Name name = signUpEntity.new Name();
        name.setFirstName(signupRequestEntity.getFirstName());
        name.setLastName(signupRequestEntity.getLastName());
        signUpEntity.setName(name);
        userSignUpRepository.insert(signUpEntity);
        return signupRequestEntity.getUserName();
    }
}
