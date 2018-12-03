package com.bank.auth.service;

/**
 * Interface class  auto login user after registering an account
 */
public interface SecurityService {

    void autoLogin(String username, String password);
}
