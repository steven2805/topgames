package com.example.stevenmacdonald.toppcgames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TopGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_list);

        TopGames topGames = new TopGames();
        ArrayList<Games> list = topGames.getList();

        TopGamesAdaptor gameAdapter = new TopGamesAdaptor(this,list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(gameAdapter);

    }
}
