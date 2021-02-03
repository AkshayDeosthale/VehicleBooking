package com.upgrad.hireWheels.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class city {

    @Id
    private int city_id;

    @Column(nullable = true)
    private String city_name;

    /*
    @OneToMany (mappedBy = "city")
    private Set<location> location;

     */


     public int get_city_id() {
        return city_id;
    }

    public void set_city_id(int city_id)  {
        this.city_id= city_id;
    }

    public String get_city_name() {
        return city_name;
    }

    public void set_city_name(String city_name) {
        this.city_name = city_name;
    }

    public city(int city_id , String city_name){
         this.city_id= city_id;
         this.city_name= city_name;
    }



    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + city_id +
                ", movieName='" + city_name + '\'' +
                '}';
    }


}
