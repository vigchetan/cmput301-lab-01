package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {

    // Constructor 1
    public Happy() {
        super(); // Calls Mood() constructor
    }

    // Constructor 2
    public Happy(Date date) {
        super(date);
    }

    @Override
    public String getMoodDescription() {
        return "Feeling joyful and content";
    }
}