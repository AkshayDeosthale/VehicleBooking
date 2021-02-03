package com.upgrad.hireWheels.dao;

import com.upgrad.hireWheels.Entities.fuel_type;

import org.springframework.data.jpa.repository.JpaRepository;

public interface fuelDAO extends JpaRepository<fuel_type,Integer> {

}
