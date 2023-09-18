package com.anproject.BlogApp.controller;


import com.anproject.BlogApp.entity.User;
import com.anproject.BlogApp.payload.request.RegularUserRequestDto;
import com.anproject.BlogApp.service.CustomUserDetailsService;
import com.anproject.BlogApp.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class AuthController {

    private final UserService userService;
    private final CustomUserDetailsService customUserDetailsService;
    private final PasswordEncoder passwordEncoder;

    public AuthController(UserService userService, CustomUserDetailsService customUserDetailsService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.customUserDetailsService = customUserDetailsService;
        this.passwordEncoder = passwordEncoder;
    }



    @GetMapping("/login")
    public String showLoginPage(User user, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
            return "/login/login";
        }

        return "redirect:/home/index";
    }


    @GetMapping("/login/register")
    public String showRegisterPage(Model model) {
        model.addAttribute("user", new RegularUserRequestDto());
        return "/login/register";
    }

    @PostMapping("/login/registration-process")
    public String registrationProcess(RegularUserRequestDto user) {
        userService.save(user);
        return "redirect:/login";
    }

}
