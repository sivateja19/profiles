package com.siva.profiles.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sivateja on 10/9/16.
 */
@RestController
public class ProfilesLoginController {

    @RequestMapping("/")
    public String index() {
        return "You have reached Profiles Application";
    }
}
