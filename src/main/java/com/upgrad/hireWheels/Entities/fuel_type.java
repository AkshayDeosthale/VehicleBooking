package com.upgrad.hireWheels.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class fuel_type {

    @Id
    private int fuel_type_id;

    @Column(nullable = true,unique = false)
    private String fuel_type;

    /*
    @OneToMany (mappedBy = "fuel_type")
    private Set<vehicle> vehicle;

     */


     public int getFuel_type_id() {
        return fuel_type_id;
    }

    public void set_fuel_type_id(int fuel_type_id) {
        this.fuel_type_id = fuel_type_id;
    }

    public String get_feul_type() {
        return fuel_type;
    }

    public void set_fuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public fuel_type(int fuel_type_id , String fuel_type){

         this.fuel_type_id = fuel_type_id;
        this.fuel_type = fuel_type;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + fuel_type_id +
                ", movieName='" + fuel_type + '\'' +

                '}';
    }


}
