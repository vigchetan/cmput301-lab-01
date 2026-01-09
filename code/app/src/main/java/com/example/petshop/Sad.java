package com.example.petshop;

import java.util.Date;

public class Sad extends Mood {

    // Constructor 1: Uses default date (current date)
    public Sad() {
        super(); // Calls Mood() constructor
    }

    // Constructor 2: Takes a date as argument
    public Sad(Date date) {
        super(date); // Calls Mood(Date) constructor
    }

    // Override abstract method to return mood description
    @Override
    public String getMoodDescription() {
        return "Sad - feeling down and melancholic";
    }
}