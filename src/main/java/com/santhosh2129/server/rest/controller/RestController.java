package com.santhosh2129.server.rest.controller;

import com.santhosh2129.server.rest.entity.SignupRequestEntity;
import com.santhosh2129.server.service.UserSingUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/*
 * Created by santhosh on 7/1/17.
 */

@org.springframework.web.bind.annotation.RestController
@CrossOrigin
@RequestMapping("/santhosh2129")
public class RestController {

    @Autowired
    private UserSingUpService userSingUpService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerModule(@Validated @RequestBody SignupRequestEntity signupRequestEntity) {
        return userSingUpService.registerUser(signupRequestEntity);
    }

}
