package com.young.usermanagementapp.service;

import com.young.usermanagementapp.domain.User;
import com.young.usermanagementapp.exception.domain.EmailExistException;
import com.young.usermanagementapp.exception.domain.UserNotFoundException;
import com.young.usermanagementapp.exception.domain.UsernameExistException;

import java.util.List;

public interface UserService {

    User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, UsernameExistException, EmailExistException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
