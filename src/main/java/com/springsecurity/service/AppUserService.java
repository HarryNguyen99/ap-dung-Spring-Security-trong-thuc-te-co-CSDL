package com.springsecurity.service;

import com.springsecurity.model.AppUser;

public interface AppUserService {
    AppUser getUserByUsername(String username);
}
