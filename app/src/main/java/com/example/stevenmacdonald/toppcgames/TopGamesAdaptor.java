package com.example.stevenmacdonald.toppcgames;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TopGamesAdaptor extends ArrayAdapter<Games> {

    public TopGamesAdaptor(Context context, ArrayList<Games> games) {
        super(context, 0, games);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.game_item, parent, false);
        }

        Games currentGame = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentGame.getRank().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentGame.getTitle().toString());

        TextView year = (TextView) listItemView.findViewById(R.id.date);
        year.setText(currentGame.getDate().toString());

        listItemView.setTag(currentGame);


        return listItemView;

    }

}

