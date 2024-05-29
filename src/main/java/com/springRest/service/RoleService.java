package com.springRest.service;

import com.springRest.DAO.RoleRepository;
import com.springRest.enitity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService
{
    @Autowired
    private RoleRepository roleRepository;
    //use Role of user and admin
    public List<Role> getRoles()
    {
        return roleRepository.findAll();
    }
}
