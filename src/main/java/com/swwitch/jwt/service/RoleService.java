package com.swwitch.jwt.service;

import com.swwitch.jwt.dao.RoleDao;
import com.swwitch.jwt.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    public RoleDao roleDao;

    public Role createNewRole(Role role){
        return roleDao.save(role);


    }
}
