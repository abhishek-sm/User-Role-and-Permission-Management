package com.example.role_management.roleManagement.repository;

import com.example.role_management.roleManagement.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
Optional<User> findByUsername(String username);
}
