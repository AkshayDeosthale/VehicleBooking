package com.upgrad.hireWheels.Entities;

import javax.persistence.*;

@Entity
public class booking {

    @Id
    private int bookingId;

    @Column(nullable = true)
    private char pickup_date;

    @Column(nullable = true)
    private char dropoff_date;

    @Column(nullable = true)
    private char booking_date;

    @Column(nullable = true)
    private int amount;


    @Column(nullable = true)
    private int location_id;


    @Column(nullable = true)
    private int vehicle_id;


    @Column(nullable = true)
    private int user_id;

   /* @ManyToOne
    @JoinColumn(name = "location_id", nullable = true)
    private location location;



    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = true)
    private vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = true)
    private Users users;
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
