package com.santhosh2129.user.server.service.impl;

import com.santhosh2129.user.common.authentication.AuthenticationService;
import com.santhosh2129.user.common.persistence.entity.UserEntity;
import com.santhosh2129.user.common.persistence.repository.UserSignUpRepository;
import com.santhosh2129.user.server.rest.entity.SigninRequestEntity;
import com.santhosh2129.user.server.rest.entity.SignupRequestEntity;
import com.santhosh2129.user.server.service.UserSingUpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by santhosh on 7/1/17.
 */
@Service
public class UserSingUpServiceImpl implements UserSingUpService {

    private final static Logger log = LoggerFactory.getLogger( UserSingUpServiceImpl.class );


    @Autowired
    private UserSignUpRepository userSignUpRepository;

    @Autowired
    private AuthenticationService authenticationService;

    @Override
    public String registerUser(SignupRequestEntity signupRequestEntity) {
        UserEntity userEntity = new UserEntity();
        userEntity.setPassword(authenticationService.encrypt(signupRequestEntity.getPassword()));
        userEntity.setCreateTimestamp(new Date());
        userEntity.setUpdateTimestamp(new Date());
        UserEntity.Name name = userEntity.new Name();
        name.setFirstName(signupRequestEntity.getFirstName());
        name.setLastName(signupRequestEntity.getLastName());
        userEntity.setName(name);
        userEntity.setUserName(signupRequestEntity.getUserName());
        userSignUpRepository.insert(userEntity);
        return signupRequestEntity.getUserName();
    }

    @Override
    public String loginUser(SigninRequestEntity signinRequestEntity) {
        UserEntity userDocument = userSignUpRepository.findOne(signinRequestEntity.getUserName());
        if (userDocument == null) {
            log.error("User not available");
            return "User Not Registered";
        }
        if (authenticationService.checkPassword(signinRequestEntity.getPassword(), userDocument.getPassword())) {
            log.error("User available");
            return "Sign In Success";
        } else {
            log.error("login failed");
            return "Wrong password";
        }
    }
}
