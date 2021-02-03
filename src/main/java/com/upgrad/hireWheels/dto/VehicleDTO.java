package com.upgrad.hireWheels.dto;

public class VehicleDTO {

    private int vehicle_id;
    private String vehicle_model;
    private int vehicle_number;
    private int vehicle_subcategory_id;
    private String color;
    private int location_id;
    private int fuel_type_id;
    private int available_status;
    private String vehicle_image_url;

    public void set_Vehicle_id(int vehicle_id){
        this.vehicle_id = vehicle_id;
    }
    public int get_Vehicle_id(){
        return vehicle_id;
    }

    public void set_Vehicle_model(String vehicle_model){
        this.vehicle_model = vehicle_model;
    }
    public String get_Vehicle_model(){
        return vehicle_model;
    }

    public void set_Vehicle_number(int vehicle_number){
        this.vehicle_number=vehicle_number;
    }
    public int get_Vehicle_number(){
        return vehicle_number;
    }

    public void set_Vehicle_subcategory_id(int vehicle_subcategory_id){
        this.vehicle_subcategory_id=vehicle_subcategory_id;
    }
    public int get_Vehicle_subcategory_id(){
        return vehicle_subcategory_id;
    }

    public void set_Vehicle_color(String color){
        this.color=color;
    }
    public String get_Vehicle_colour(){
        return color;
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

}
