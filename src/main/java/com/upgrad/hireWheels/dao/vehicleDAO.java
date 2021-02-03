package com.upgrad.hireWheels.dao;

import com.upgrad.hireWheels.Entities.vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vehicleDAO extends JpaRepository<vehicle,Integer> {

}
