package com.santhosh2129.rest.controller;

import com.santhosh2129.rest.entity.SignupRequestEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/*
 * Created by santhosh on 7/1/17.
 */

@org.springframework.web.bind.annotation.RestController
@CrossOrigin
@RequestMapping("/santhosh2129")
public class RestController {

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerModule(@Validated @RequestBody SignupRequestEntity signupRequestEntity) {
        return "hello " + signupRequestEntity.getUserName();
    }

}
