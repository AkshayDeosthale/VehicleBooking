package com.upgrad.hireWheels.Entities;

import javax.persistence.*;

@Entity
public class location {



    @Id
    private int location_id;

    @Column(nullable = true)
    private String location_name;

    @Column(nullable = true)
    private String address;


    @Column(nullable = true)
    private int city_id;



    @Column(nullable = true)
    private String pincode;

    public location(int location_id , String location_name , String address , int city_id , String pincode){

        this.location_id = location_id;
        this.location_name = location_name;
        this.address = address;
        this.city_id = city_id;
        this.pincode = pincode;

    }



    /*
    @OneToMany (mappedBy = "location")
    private Set<booking> book;



    @ManyToOne
    @JoinColumn(name = "city_id", nullable = true)
    private city city;

     */


   /*
    @OneToMany (mappedBy = "location")
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
