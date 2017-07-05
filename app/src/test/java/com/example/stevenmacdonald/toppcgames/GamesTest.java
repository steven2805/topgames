package com.example.stevenmacdonald.toppcgames;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GamesTest {

    @Test
    public void hasMovies(){
        TopGames topGames = new TopGames();
        assertEquals(10, topGames.getList().size());
    }


}
