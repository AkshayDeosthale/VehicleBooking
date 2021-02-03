package com.upgrad.hireWheels.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class vehicle_subcategory {

    @Id
    private int vehicle_subcategory_id;

    @Column(nullable = true, unique = false)
    private String vehicle_subcategory_name;

    @Column(nullable = true)
    private int price_per_day;


    @Column(nullable = true)
    private int vehicle_category_id;

    public vehicle_subcategory(int vehicle_subcategory_id , String vehicle_subcategory_name , int price_per_day , int vehicle_category_id){

        this.vehicle_subcategory_id=vehicle_subcategory_id;
        this.vehicle_subcategory_name=vehicle_subcategory_name;
        this.price_per_day=price_per_day;
        this.vehicle_category_id=vehicle_category_id;
    }

    /*
    @OneToMany (mappedBy = "vehicle_subcategory")
    private Set<vehicle> vehicle;

     */

    /*
     public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                ", coverPhotoUrl='" + coverPhotoUrl + '\'' +
                ", trailerUrl='" + trailerUrl + '\'' +
                '}';
    }
     */

}
