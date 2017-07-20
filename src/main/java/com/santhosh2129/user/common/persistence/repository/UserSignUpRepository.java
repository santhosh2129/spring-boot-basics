package com.santhosh2129.user.common.persistence.repository;

import com.santhosh2129.user.common.persistence.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by santhosh on 7/1/17.
 */
public interface UserSignUpRepository extends MongoRepository<UserEntity, String>{
}
