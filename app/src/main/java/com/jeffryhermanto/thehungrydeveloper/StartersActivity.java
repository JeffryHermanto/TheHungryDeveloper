package com.jeffryhermanto.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        String[] dishes = {
                "Bacon and sausage penne",
                "Mustard seed and egusi salad",
                "Onion and brill salad",
                "Morel and red onion salad",
                "Mackerel and pork pie",
                "Nectarine and chilli dumplings",
                "Blackberry and coffee salad",
                "Caraway and apricot cake",
                "Prune and stilton cookies",
                "Bean and squash casserole",
                "Cranberry and spaghetti salad",
                "Crayfish and feta salad",
                "Cheese and polenta cupcakes",
                "Potato and salt gnocchi",
                "Tofu and lamb korma",
                "Cabbage and truffle soup",
                "Potato and mango loaf",
                "Jalapeno and egg ciabatta",
                "Mulberry and haricot salad",
                "Squash and pesto wontons",
        };

        ArrayAdapter<String> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);
    }
}