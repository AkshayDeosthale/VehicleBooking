package com.upgrad.hireWheels.dao;
import com.upgrad.hireWheels.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDAO extends JpaRepository<Users, Integer> {

    //public List<Users> findByFirstName(String name);
    //public List<Users> findByFirstOrLastName(String name);
   // public List<Users> findByEmail(String email);
   // public List<Users> findByMovileNumber(int mob);


}
