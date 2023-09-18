package com.anproject.BlogApp.service;

import com.anproject.BlogApp.entity.Role;
import com.anproject.BlogApp.entity.User;
import com.anproject.BlogApp.payload.request.RegularUserRequestDto;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.anproject.BlogApp.repository.RoleRepository;
import com.anproject.BlogApp.repository.UserRepository;
import com.anproject.BlogApp.service.ValidationRules.UserValidationRules;

@Service
public class UserService {


    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }


    public void save(RegularUserRequestDto regularUserRequestDto){

        User user = RegularUserRequestDto.mapRequestDtoToEntity(regularUserRequestDto);
        user.setPassword(passwordEncoder.encode(regularUserRequestDto.getPassword()));
        user.setRole(roleRepository.findRoleByRoleName("USER").orElseThrow());
        user.setStatus(true);
        userRepository.save(user);
    }
}
