package com.upgrad.hireWheels.dao;

import com.upgrad.hireWheels.Entities.Users;
import com.upgrad.hireWheels.Entities.role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface roleDAO extends JpaRepository<role,Integer> {

   // public role findByRoleId(int id);

}
