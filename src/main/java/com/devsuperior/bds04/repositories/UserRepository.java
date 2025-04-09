package com.devsuperior.bds04.repositories;

import com.devsuperior.bds04.entities.User;
import com.devsuperior.bds04.projections.UserDetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
