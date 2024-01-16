package com.login.controller;
import com.login.dto.LoginDto;
import com.login.entity.Login;
import com.login.entity.Registration;
import com.login.repository.LoginRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("api/login")
public class LoginController {

    private LoginRepository loginRepository;

    public LoginController(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    //http://localhost:8080/api/login/authenticate
    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginDto logindto) {
        Optional<Registration> byUsername = loginRepository.findByUsername(logindto.getUsername());
        if (byUsername.isPresent()) {
            Registration login = byUsername.get();
            if(login.getPassword().equals(logindto.getPassword())){
                return new ResponseEntity<>("login ok",HttpStatus.OK);
            }else{
                return new ResponseEntity<>("worng password",HttpStatus.UNAUTHORIZED);
            }
        }else {
            return new ResponseEntity<>("worng username",HttpStatus.UNAUTHORIZED);
        }
    }

}
