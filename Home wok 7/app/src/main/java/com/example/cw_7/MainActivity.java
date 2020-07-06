package com.example.cw_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<pokemon> myPokemon = new ArrayList<>();

        pokemon Pokemon1 = new pokemon("Bulbasaur",R.drawable.bulbasaur,49,49,318);
        pokemon pokemon = new pokemon("Charmander",R.drawable.charmander,52,43,309);
        pokemon pokemon2 = new pokemon("squirtle",R.drawable.squirtle,48,65,314);
        pokemon pokemon3 = new pokemon("pidgey",R.drawable.pidgey,45,35,251);

        myPokemon.add(pokemon);
        myPokemon.add(Pokemon1);
        myPokemon.add(pokemon2);
        myPokemon.add(pokemon3);

        RecyclerView RV = findViewById(R.id.N1);





    }
}