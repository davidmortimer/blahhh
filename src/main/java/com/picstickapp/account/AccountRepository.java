package com.picstickapp.account;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by David on 24/05/2015.
 */
public interface AccountRepository extends MongoRepository<Account, String> {

    public Account findByUsername(String username);

}
