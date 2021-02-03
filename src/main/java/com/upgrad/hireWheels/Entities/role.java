package com.upgrad.hireWheels.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class role {

    @Id
    private int role_id;

    @Column(nullable = true , unique = false)
    private String role_name;

    /*
    @OneToMany (mappedBy = "role")
    private Set<Users> users;

     */


     public int get_role_id() {
        return role_id;
    }

    public void set_role_id(int role_id) {
        this.role_id = role_id;
    }

    public String get_role_name() {
        return role_name;
    }

    public void set_role_name(String role_name) {
        this.role_name = role_name;
    }

    public role(int role_id , String role_name){
         this.role_id = role_id;
         this.role_name = role_name;
    }



    @Override
    public String toString() {
        return "Role {" +
                "Role ID=" + role_id +
                ", Role Name='" + role_name + '\'' +
                '}';
    }


}
