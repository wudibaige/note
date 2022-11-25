package com.example.democacheehcache.service;

import com.example.democacheehcache.entity.User;

public interface UserService {
    User saveOrUpdate(User user);
    User get(Long id);
    void delete(Long id);
}
