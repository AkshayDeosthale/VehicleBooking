package com.upgrad.hireWheels.services;

import com.upgrad.hireWheels.Entities.*;
import com.upgrad.hireWheels.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManagerFactory;

@Service
public class initServiceImpl implements InitService{
    @Autowired
    roleDAO userRoleDAO;

    @Autowired
    UserDAO userDAO;

    @Autowired
    VehicleCategoryDAO vehicleCategoryDAO;

    @Autowired
    vehicle_subcatDAO vehicleSubCategoryDAO;

    @Autowired
    cityDAO cityDAO;

    @Autowired
    fuelDAO fuelTypeDAO;

    @Autowired
    locationDAO locationDAO;

   // @Autowired
   // DTOEntityConverter dtoEntityConverter;

    public void start() {
        addUserRole();
        addUsers();
        addVehicleCategory();
        addVehicleSubCategory();
        addCity();
        addFuelType();
        addLocation();
    }


    private void addLocation() {
        location location = new location(1, "Worli",
                "Dr E Moses Rd, Worli Naka, Upper Worli",400018,"Mumbai");
        locationDAO.save(location);
        location = new location(2, "Chembur",
                "Optic Complex",400019,"Mumbai");
        locationDAO.save(location);
        location = new location(3, "Powai",
                "Hiranandani Tower",400020,"Mumbai");
        locationDAO.save(location);
    }




    private void addFuelType() {
        List<fuel_type> fuelTypeList = Arrays.asList(new fuel_type(1,"Petrol"), new fuel_type(2, "Diesel"));
        fuelTypeDAO.saveAll(fuelTypeList);
    }

    private void addCity() {
        cityDAO.save(new city(1,"Mumbai"));
    }

    private void addVehicleCategory() {
        List<vehicleCategory> vehicleCategoryList = Arrays.asList(new vehicleCategory(10, "CAR"),
                new vehicleCategory(11,"BIKE"));
        vehicleCategoryDAO.saveAll(vehicleCategoryList);
    }

    private void addVehicleSubCategory() {
        List<vehicle_subcategory> vehicleSubCategories = new ArrayList<>();

        vehicleSubCategories.add(new vehicle_subcategory(1, "SUV",
                300,10 ));

        vehicleSubCategories.add(new vehicle_subcategory(2, "SEDAN",
                350,10 ));

        vehicleSubCategories.add(new vehicle_subcategory(3, "HATCHBACK",
                250,10 ));

        vehicleSubCategories.add(new vehicle_subcategory(4, "CRUISER",
                200,11 ));

        vehicleSubCategories.add(new vehicle_subcategory(5, "DIRT BIKE",
                200,11 ));

        vehicleSubCategories.add(new vehicle_subcategory(6, "SPORTS BIKE",
                150,11 ));

        vehicleSubCategoryDAO.saveAll(vehicleSubCategories);
    }

    private void addUserRole() {

        List<role> userRoleList = Arrays.asList(new role(1, "Admin"),
                new role(2,"User"));
        userRoleDAO.saveAll(userRoleList);
    }


    private void addUsers() {
        Users adminUser = new Users("Upgrad","Admin","admin@123","upgrad@gmail.com",
                "9999999999", 10000,1);
        userDAO.save(adminUser);
    }
}
