package br.com.codewithprojects.car_rentel_spring.repository;

import br.com.codewithprojects.car_rentel_spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
