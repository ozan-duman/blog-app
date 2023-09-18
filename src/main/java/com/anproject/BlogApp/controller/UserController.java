package com.anproject.BlogApp.controller;

import com.anproject.BlogApp.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){this.userService = userService;}




}
