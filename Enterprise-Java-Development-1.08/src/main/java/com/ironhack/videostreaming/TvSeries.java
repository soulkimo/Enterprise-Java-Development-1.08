package com.ironhack.videostreaming;

public class TvSeries extends Video {

    private int numberOfSeason;
    private int numberOfChapters;

    public TvSeries(String title, String genre, int duration) {
        super(title, genre, duration);
    }

    public TvSeries(String title, String genre, int duration, int numberOfSeason, int numberOfChapters) {
        super(title, genre, duration);
        this.numberOfSeason = numberOfSeason;
        this.numberOfChapters = numberOfChapters;
    }

    public int getNumberOfSeason() {
        return numberOfSeason;
    }

    public void setNumberOfSeason(int numberOfSeason) {
        this.numberOfSeason = numberOfSeason;
    }

    public int getNumberOfChapters() {
        return numberOfChapters;
    }

    public void setNumberOfChapters(int numberOfChapters) {
        this.numberOfChapters = numberOfChapters;
    }
}
