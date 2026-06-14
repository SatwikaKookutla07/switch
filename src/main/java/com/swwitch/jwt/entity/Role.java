package com.swwitch.jwt.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //Tells the database "hey, make a table for this class". So there will be a Role table in your database
 public class Role {

    @Id
    private String roleName;
    private String roleDescription;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
}
