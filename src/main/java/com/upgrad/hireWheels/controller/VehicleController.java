package com.upgrad.hireWheels.controller;
import com.upgrad.hireWheels.Entities.vehicle;
import com.upgrad.hireWheels.dto.VehicleDTO;
import com.upgrad.hireWheels.services.VehicleServiceIMPL;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class VehicleController {

    @Autowired
    ModelMapper modelmapper;

    @Autowired
    VehicleServiceIMPL vehicleService;

    @GetMapping(value ={"/hirewheels/v1/vehicles"})
    public VehicleDTO getVehicles(){
        vehicle v= vehicleService.getVehicleDetails();


        VehicleDTO responseVehicleDTO= modelmapper.map(v,VehicleDTO.class);
        return(responseVehicleDTO);

    }

    @GetMapping(value ={"/hirewheels/v1/allVehicles"})
    public VehicleDTO getAllVehicles(){
        List<vehicle>  v=vehicleService.getAllVehicleDetails();


        VehicleDTO responseVehicleDTO= modelmapper.map(v,VehicleDTO.class);
        return(responseVehicleDTO);

    }

    @GetMapping(value={"/sayHelloMovie"})
    public String sayHello(){
        return "Hello World To All From MovieController";
    }

}
