package com.example.stevenmacdonald.toppcgames;

public class Games {

    private int rnak;
    private String title;
    private String releasedate;


    public Games(Integer rank, String title, String releasedate){
        this.rank = rank;
        this.title = title;
        this.releasedate = releasedate;
    }

    public int getRnak() {
        return rnak;
    }

    public String getTitle() {
        return title;
    }

    public String getReleasedate() {
        return releasedate;
    }
}
