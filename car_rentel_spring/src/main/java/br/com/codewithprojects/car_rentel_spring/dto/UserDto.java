package br.com.codewithprojects.car_rentel_spring.dto;

import br.com.codewithprojects.car_rentel_spring.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private UserRole userRole;
}
