package com.anproject.BlogApp.repository;

import com.anproject.BlogApp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role getRoleById(long id);
}
