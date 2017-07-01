package com.santhosh2129.common.persistence.repository;

import com.santhosh2129.common.persistence.entity.SignUpEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by santhosh on 7/1/17.
 */
public interface UserSignUpRepository extends MongoRepository<SignUpEntity , String>{
}
