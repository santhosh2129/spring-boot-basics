package com.santhosh2129;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by santhosh on 7/1/17.
 */

@SpringBootApplication
@EnableSwagger2
@EnableAutoConfiguration
public class SpringBootStarter {
    public static void main(String[] arg) {
        SpringApplication.run(SpringBootStarter.class, arg);
    }
}
