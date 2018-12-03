package com.bank.auth.service;

import com.bank.auth.model.User;
import com.bank.auth.repository.RoleRepository;
import com.bank.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

/**
 * Class implements registering account
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    /**
     * Save user in JPA database
     *
     * @param user to save
     */
    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    /**
     * Find user bu username
     *
     * @param username - name of user to find
     * @return user by username
     */
    @Override
    public User findByUsername(String username) {
      return userRepository.findByUsername(username);
    }
}
