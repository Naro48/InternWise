package com.internwise.InternWise.Controllers;

import com.internwise.InternWise.Entities.User;
import com.internwise.InternWise.Service.AuthenticationService;
import com.internwise.InternWise.Service.UserService;
import com.internwise.InternWise.dto.LoginDto;
import com.internwise.InternWise.dto.LoginResponse;
import com.internwise.InternWise.jwt.JwtService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/auth")
@RestController
@CrossOrigin("http://localhost:4200/")
public class AuthenticationController {
    private final JwtService jwtService;

    private final UserService userService;

    private final AuthenticationService authenticationService;

    public AuthenticationController(JwtService jwtService, UserService userService, AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.userService = userService;
        this.authenticationService = authenticationService;
    }



    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginDto loginUserDto) {
        User authenticatedUser = authenticationService.authenticate(loginUserDto);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken(jwtToken);
        loginResponse.setExpiresIn(jwtService.getExpirationTime());

        return ResponseEntity.ok(loginResponse);
    }

    @GetMapping("/encode")
    public ResponseEntity<List<User>> encode(){
        return new ResponseEntity<>(userService.encodePassword(), HttpStatus.OK);
    }

    @GetMapping("/search/{username}")
    public ResponseEntity<List<User>> searchByName(@PathVariable String username){
        return new ResponseEntity<>(userService.searchByName(username),HttpStatus.OK);
    }
}