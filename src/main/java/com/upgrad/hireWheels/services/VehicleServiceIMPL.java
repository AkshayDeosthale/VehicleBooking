package com.upgrad.hireWheels.services;


import com.upgrad.hireWheels.Entities.vehicle;
import com.upgrad.hireWheels.dao.vehicleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceIMPL {

    @Autowired
    vehicleDAO vehi;

    public vehicle getVehicleDetails(){

        return vehi.findById(1).get();

    }

    public List<vehicle> getAllVehicleDetails(){
        return vehi.findAll();
    }

}
