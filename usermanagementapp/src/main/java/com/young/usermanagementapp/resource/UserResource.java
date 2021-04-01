package com.young.usermanagementapp.resource;

import com.young.usermanagementapp.domain.User;
import com.young.usermanagementapp.exception.domain.EmailExistException;
import com.young.usermanagementapp.exception.domain.ExceptionHandling;
import com.young.usermanagementapp.exception.domain.UserNotFoundException;
import com.young.usermanagementapp.exception.domain.UsernameExistException;
import com.young.usermanagementapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = {"/", "/user"})
@RequiredArgsConstructor
public class UserResource extends ExceptionHandling {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) throws UserNotFoundException, UsernameExistException, EmailExistException {
        User newUser = userService.register(user.getFirstName(), user.getLastName(),
                user.getUsername(), user.getEmail());
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }
}
