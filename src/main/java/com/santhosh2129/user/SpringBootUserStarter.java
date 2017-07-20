package com.santhosh2129.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by santhosh on 7/1/17.
 */

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class SpringBootUserStarter {
    public static void main(String[] arg) {
        SpringApplication.run(SpringBootUserStarter.class, arg);
    }
}
