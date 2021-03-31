package com.young.usermanagementapp.resource;

import com.young.usermanagementapp.domain.User;
import com.young.usermanagementapp.exception.domain.ExceptionHandling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/", "/user"})
public class UserResource extends ExceptionHandling {

    @GetMapping("/home")
    public String showUser() {
        return "application works";
    }
}
