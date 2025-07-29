package com.demo.lab3;

import java.time.Year;

public class Movie {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private int duration;
    private int year;
    private String category;
    private final String movieId;
    private static int moviesCount = 0;

    // Constructor with mandatory fields
    public Movie(String movieName, String producedBy) {
        moviesCount++;
        this.movieName = movieName;
        this.producedBy = producedBy;
        this.movieId = movieName + "_" + moviesCount;
    }

    // Full constructor using this()
    public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    // Getter for movieId
    public String getMovieId() {
        return movieId;
    }

    // ✅ Method to return all details as a single string
    public String showDetails() {
        return "Movie ID: " + movieId +
                ", Name: " + movieName +
                ", Produced By: " + producedBy +
                ", Directed By: " + (directedBy != null ? directedBy : "N/A") +
                ", Duration: " + (duration > 0 ? duration + " mins" : "N/A") +
                ", Year: " + (year > 0 ? year : "N/A") +
                ", Category: " + (category != null ? category : "N/A");
    }

    // Main method to test it
    public static void main(String[] args) {
        Movie m = new Movie("Hello", "XYZ Productions");
        System.out.println(m.getMovieId());
        System.out.println(m.showDetails());
    }
}
