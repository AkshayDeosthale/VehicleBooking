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

        int id=1;
        vehicle vehicle1= new vehicle();
        vehicle1 = vehi.findById(id);

    }

}
