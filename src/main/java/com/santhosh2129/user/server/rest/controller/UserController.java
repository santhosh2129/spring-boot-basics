package com.santhosh2129.user.server.rest.controller;

import com.santhosh2129.user.server.rest.entity.SigninRequestEntity;
import com.santhosh2129.user.server.rest.entity.SignupRequestEntity;
import com.santhosh2129.user.server.service.UserSingUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/*
 * Created by santhosh on 7/1/17.
 */

@RestController
@CrossOrigin
@RequestMapping("/santhosh2129")
public class UserController {

    @Autowired
    private UserSingUpService userSingUpService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerModule(@Validated @RequestBody SignupRequestEntity signupRequestEntity) {
        return userSingUpService.registerUser(signupRequestEntity);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginModule(@Validated @RequestBody SigninRequestEntity signinRequestEntity) {
        return userSingUpService.loginUser(signinRequestEntity);
    }

}
