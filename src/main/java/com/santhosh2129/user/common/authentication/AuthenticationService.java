package com.santhosh2129.user.common.authentication;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by santhosh on 7/1/17.
 */
@Service
public class AuthenticationService {


    public String encrypt(String password) {
        try {
            BCryptPasswordEncoder bCryptPasswordEncoder =  new BCryptPasswordEncoder();
            String hashedPassword = bCryptPasswordEncoder.encode(password);
            return hashedPassword;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean checkPassword(String password , String hashedPassword) {
        try {
            BCryptPasswordEncoder bCryptPasswordEncoder =  new BCryptPasswordEncoder();
            return  bCryptPasswordEncoder.matches(password,hashedPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
