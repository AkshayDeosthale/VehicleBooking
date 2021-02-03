package com.upgrad.hireWheels.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class vehicle {

    @Id
    private int vehicle_id;

    @Column(nullable = true)
    private String vehicle_model;

    @Column(nullable = true)
    private int vehicle_number;

    @Column(nullable = true)
    private int vehicle_subcategory_id;

    @Column(nullable = true)
    private String color;


    @Column(nullable = true)
    private int location_id;


    @Column(nullable = true)
    private int fuel_type_id;

    @Column(nullable = true)
    private int available_status;

    @Column(nullable = true)
    private String vehicle_image_url;

    /*
    @OneToMany (mappedBy = "vehicle")
    private Set<booking> book;

    @ManyToOne
    @JoinColumn(name = "fuel_type_id", nullable = false)
    private fuel_type fuel_type;

     */

    /*
    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private location location;



    @ManyToOne
    @JoinColumn(name = "vehicle_subcategory_id", nullable = false)
    private vehicle_subcategory vehicle_subcategory;

     */


     public int get_vehicle_id() {
        return vehicle_id;
    }

    public void set_vehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String get_vehicle_model() {
        return vehicle_model;
    }

    public void set_vehicle_model(String vehicle_model) {
        this.vehicle_model = vehicle_model;
    }

    public int get_vehicle_number() {
        return vehicle_number;
    }

    public void set_vehicle_number(int vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public int get_Vehicle_subcategory_id() {
        return vehicle_subcategory_id;
    }

    public void setVehicleSubcategoryID(int vehicle_subcategory_id) {
        this.vehicle_subcategory_id = vehicle_subcategory_id;
    }

    public String get_color() {
        return color;
    }

    public void set_color(String color) {
        this.color = color;
    }

    public int get_location_id() {
        return location_id;
    }

    public void set_location_id(int location_id) {
        this.location_id = location_id;
    }

    public int get_fuel_type_id() {
        return fuel_type_id;
    }

    public void set_feul_type_id(int fuel_type_id) {
        this.fuel_type_id = fuel_type_id;
    }

    public int get_available_status() {
        return available_status;
    }

    public void set_available_status(int available_status) {
        this.available_status = available_status;
    }

    public String get_vehicle_image_url() {
        return vehicle_image_url;
    }

    public void set_vehicle_image_url(String vehicle_image_url) {
        this.vehicle_image_url = vehicle_image_url;
    }

   /* @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + vehicle_id +
                ", movieName='" + vehicle_model + '\'' +
                ", movieDescription='" + vehicle_number + '\'' +
                ", releaseDate=" + vehicle_subcategory_id +
                ", duration=" + color +
                ", coverPhotoUrl='" + location_id + '\'' +
                ", trailerUrl='" + fuel_type_id + '\'' +
                ", coverPhotoUrl='" + available_status + '\'' +
                ", trailerUrl='" + vehicle_image_url + '\'' +
                '}';
    }

    */


}
