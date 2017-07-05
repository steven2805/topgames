package com.example.stevenmacdonald.toppcgames;

public class Games {

    private int rank;
    private String title;
    private String releasedate;


    public Games(Integer rank, String title, String releasedate){
        this.rank = rank;
        this.title = title;
        this.releasedate = releasedate;
    }

    public Integer getRank() {
        return rank;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return releasedate;
    }
}
