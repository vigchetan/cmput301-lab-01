package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {

    // Constructor 1: Uses default date (current date)
    public Happy() {
        super(); // Calls Mood() constructor
    }

    // Constructor 2: Takes a date as argument
    public Happy(Date date) {
        super(date); // Calls Mood(Date) constructor
    }

    // Override abstract method to return mood description
    @Override
    public String getMoodDescription() {
        return "Happy - feeling joyful and content";
    }
}