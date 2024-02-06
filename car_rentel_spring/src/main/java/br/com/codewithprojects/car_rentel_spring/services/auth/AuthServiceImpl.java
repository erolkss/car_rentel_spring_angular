package br.com.codewithprojects.car_rentel_spring.services.auth;

import br.com.codewithprojects.car_rentel_spring.dto.SignupRequest;
import br.com.codewithprojects.car_rentel_spring.dto.UserDto;
import br.com.codewithprojects.car_rentel_spring.entity.User;
import br.com.codewithprojects.car_rentel_spring.enums.UserRole;
import br.com.codewithprojects.car_rentel_spring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
    private final UserRepository userRepository;


    @Override
    public UserDto createCustomer(SignupRequest signupRequest) {

        User user = new User();
        user.setName(signupRequest.getName());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword());
        user.setUserRole(UserRole.CUSTOMER);
        User createUser = userRepository.save(user);
        UserDto userDto = new UserDto();
        userDto.setId(createUser.getId());
        return userDto;
    }
}
