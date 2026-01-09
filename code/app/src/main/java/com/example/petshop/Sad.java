package com.example.petshop;

import java.util.Date;

public class Sad extends Mood {

    // Constructor 1
    public Sad() {
        super();
    }

    // Constructor 2
    public Sad(Date date) {
        super(date);
    }

    @Override
    public String getMoodDescription() {
        return "Feeling down and melancholic";
    }
}