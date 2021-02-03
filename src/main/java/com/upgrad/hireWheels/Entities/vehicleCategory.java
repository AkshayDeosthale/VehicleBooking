package com.upgrad.hireWheels.Entities;
import javax.persistence.*;

@Entity
public class vehicleCategory {
    @Id
    private int vehicle_category_id;

    private String vehicle_category_name;

    public vehicleCategory(int vehicle_category_id , String vehicle_category_name) {
        this.vehicle_category_id = vehicle_category_id;
        this.vehicle_category_name = vehicle_category_name;
    }

}
