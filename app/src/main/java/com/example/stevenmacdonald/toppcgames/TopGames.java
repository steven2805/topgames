package com.example.stevenmacdonald.toppcgames;


import java.util.ArrayList;

public class TopGames {

    private ArrayList<Games> list;


    public TopGames(){
        list = new ArrayList<Games>();
        list.add(new Games(1, "Injustice 2", "May 15, 2017"));
        list.add(new Games(2, "DIRT 4", "Jun 6, 2017"));
        list.add(new Games(3, "Forza 3", "May 9, 2017"));
        list.add(new Games(4, "RIME", "May 25, 2017"));
        list.add(new Games(5, "Prey", "May 5, 2017"));
        list.add(new Games(6, "little nightmare", "April 29, 2017"));
        list.add(new Games(7, "Chess ultra", "Jun 23, 2017"));
        list.add(new Games(8, "Tekken 7", "June 7, 1017"));
        list.add(new Games(9, "Bulletstorm", "April 7, 2017"));
        list.add(new Games(10, "Grand Theft Auto 5", "April 10, 2017"));

    }

    public ArrayList<Games> getList() {
        return list;
    }
}
