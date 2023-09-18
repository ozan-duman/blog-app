package com.anproject.BlogApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {

    @GetMapping(value={"", "/", "home/index"})
    public String homePage(){
        return "/home/index";
    }

    @PostMapping("/admin/index")
    public String showAdminPage(){

        return "/admin/index";
    }




}