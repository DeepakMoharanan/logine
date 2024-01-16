package com.login.controller;
import com.login.entity.Registration;
import com.login.service.RegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/reg")
public class RegistrationController {

    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
   //http://localhost:8080/api/reg/register
    @PostMapping("/register")
    public Registration registerUser(@RequestBody Registration user) {
        return registrationService.registerUser(user);
    }
}

