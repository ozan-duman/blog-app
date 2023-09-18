package com.anproject.BlogApp.service;

import com.anproject.BlogApp.entity.Role;
import org.springframework.stereotype.Service;
import com.anproject.BlogApp.repository.RoleRepository;

import java.util.List;

@Service
public class RoleService {

    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> listRole() {
        return roleRepository.findAll();
    }

    public void save(Role role) {
        roleRepository.save(role);
    }

    public void update(Role role) {
        Role comingRole = roleRepository.findById(role.getId()).orElseThrow();
        comingRole.setRoleName(comingRole.getRoleName());
        roleRepository.save(comingRole);
    }

    public void deleteById(Long role) {
        roleRepository.deleteById(role);


    }
}
