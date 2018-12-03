package com.bank.auth.service;

import com.bank.auth.model.User;

/**
 * Interface class for registering account
 */
public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
