package com.example.petshop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Pet pet = new Pet("");
        // Making our main class abstract means we cannot use it directly
        // Only use for inheritance with "extends" keyword
        // Instead try using this statement instead
        Cat cat = new Cat("Tuts");
        // Cat class inherits properties from the Pet abstract class
        Dog dog = new Dog("Snoopy");
        Scorpion scorpion = new Scorpion("Scorponok");

        ArrayList<Pet> petList = new ArrayList<>();

        petList.add(cat);
        petList.add(dog);
        petList.add(scorpion);

        ArrayList<Pettable> pettablePets = new ArrayList<>();

        pettablePets.add(cat);
        pettablePets.add(dog);

        // pettablePets.add(scorpion); // This should produce an error
        Happy happy = new Happy(); // Uses current date
        Sad sad = new Sad(new Date(2024, 1, 15)); // Uses specific date

    }

}