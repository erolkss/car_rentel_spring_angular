package br.com.codewithprojects.car_rentel_spring.entity;

import br.com.codewithprojects.car_rentel_spring.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private UserRole userRole;
}
