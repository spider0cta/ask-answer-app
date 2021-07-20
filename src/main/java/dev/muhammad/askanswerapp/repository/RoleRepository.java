package dev.muhammad.askanswerapp.repository;

import dev.muhammad.askanswerapp.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}