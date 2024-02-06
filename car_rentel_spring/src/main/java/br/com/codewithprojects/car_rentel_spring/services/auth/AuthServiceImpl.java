package br.com.codewithprojects.car_rentel_spring.services.auth;

import br.com.codewithprojects.car_rentel_spring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
    private final UserRepository userRepository;
}
