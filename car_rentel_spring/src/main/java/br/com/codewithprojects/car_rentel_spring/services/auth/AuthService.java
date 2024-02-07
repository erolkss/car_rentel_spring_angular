package br.com.codewithprojects.car_rentel_spring.services.auth;

import br.com.codewithprojects.car_rentel_spring.dto.SignupRequest;
import br.com.codewithprojects.car_rentel_spring.dto.UserDto;

public interface AuthService {

    UserDto createCustomer(SignupRequest signupRequest);
    boolean hasCustomerWithEmail(String email);

}
