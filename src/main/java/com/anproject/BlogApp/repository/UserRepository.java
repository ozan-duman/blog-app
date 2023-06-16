package com.anproject.BlogApp.repository;

import com.anproject.BlogApp.entity.Role;
import com.anproject.BlogApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    User getUserById(long id);

    User getUserByNickname(String nickname);

    User getUserByEmail(String email);

    List<Role> getUserByRole(Role role);



}
