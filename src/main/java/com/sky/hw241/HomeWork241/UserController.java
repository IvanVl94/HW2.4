package com.sky.hw241.HomeWork241;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class UserController {
    private final UserService userService;
    public UserController (UserService userService) {
        this.userService = userService;
    }
    @GetMapping(path = "/user")
    public String getUserInfo (@RequestParam("login") Integer login){
        final String user;
if (userService.getLogin.lenght <= 20)
        try {
            user = String.valueOf(userService.getUser(login).length());
        } catch (WrongLoginException e){
            throw new RuntimeException(e);
        }
        return "";
    }
}
