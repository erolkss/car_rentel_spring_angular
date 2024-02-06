package br.com.codewithprojects.car_rentel_spring.controller;

import br.com.codewithprojects.car_rentel_spring.dto.SignupRequest;
import br.com.codewithprojects.car_rentel_spring.dto.UserDto;
import br.com.codewithprojects.car_rentel_spring.services.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
@RequiredArgsConstructor
public class UserController {
    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<?> signupCustomer(@RequestBody SignupRequest signupRequest){
        UserDto createCustomerDto = authService.createCustomer(signupRequest);
        if (createCustomerDto == null){
            return new ResponseEntity<>("Customer not created, Come again later", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(createCustomerDto, HttpStatus.CREATED);
    }
}
