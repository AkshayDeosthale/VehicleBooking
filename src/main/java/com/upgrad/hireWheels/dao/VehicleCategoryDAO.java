package com.upgrad.hireWheels.dao;
import com.upgrad.hireWheels.Entities.vehicleCategory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleCategoryDAO extends JpaRepository<vehicleCategory, Integer>{
   // public vehicleCategory findByVehicleCategoryId(int id);

}
