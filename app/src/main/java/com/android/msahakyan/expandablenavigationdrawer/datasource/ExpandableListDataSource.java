package com.android.msahakyan.expandablenavigationdrawer.datasource;

import android.content.Context;

import com.android.msahakyan.expandablenavigationdrawer.R;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by msahakyan on 22/10/15.
 */
public class ExpandableListDataSource {

    /**
     * Returns fake data of films
     *
     * @param context
     * @return
     */
    public static Map<String, List<String>> getData(Context context) {
        Map<String, List<String>> expandableListData = new TreeMap<>();

        List<String> filmGenres = Arrays.asList(context.getResources().getStringArray(R.array.film_genre));

        List<String> actionFilms = Arrays.asList(context.getResources().getStringArray(R.array.actionFilms));
        List<String> musicalFilms = Arrays.asList(context.getResources().getStringArray(R.array.musicals));
        List<String> dramaFilms = Arrays.asList(context.getResources().getStringArray(R.array.dramas));
        List<String> thrillerFilms = Arrays.asList(context.getResources().getStringArray(R.array.thrillers));
        List<String> comedyFilms = Arrays.asList(context.getResources().getStringArray(R.array.comedies));

        expandableListData.put(filmGenres.get(0), actionFilms);
        expandableListData.put(filmGenres.get(1), musicalFilms);
        expandableListData.put(filmGenres.get(2), dramaFilms);
        expandableListData.put(filmGenres.get(3), thrillerFilms);
        expandableListData.put(filmGenres.get(4), comedyFilms);

        return expandableListData;
    }
}
