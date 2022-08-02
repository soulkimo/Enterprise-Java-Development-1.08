package com.ironhack.videostreaming;

import java.util.ArrayList;

public class Movie extends Video {

    private ArrayList<Movie> nextMovie;


    public Movie(String title, String genre, int duration) {
        super(title, genre, duration);
    }

    public Movie(String title, String genre, int duration, ArrayList<Movie> nextMovie) {
        super(title, genre, duration);
        setNextMovie(nextMovie);
    }

    public ArrayList<Movie> getNextMovie() {
        return nextMovie;
    }

    public void setNextMovie(ArrayList<Movie> nextMovie) {
        this.nextMovie = nextMovie;
    }
}
